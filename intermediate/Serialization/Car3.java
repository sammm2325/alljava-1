package intermediate.Serialization;
/*Let’s practice the serialization process with static and transient fields.

We’ve included a new String field named model in the Car class and modified the constructor and main() function to incorporate it. Run the program to observe what gets printed when deserializing an object with a non transient and static field.

Checkpoint 2 Step instruction is unavailable until previous steps are completed
2.
Let’s see what happens when we serialize an object with a transient field.

Modify the model field and include the transient keyword after private. Observe the terminal output for toyotaCopy and it’s model field. */
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Car3 implements Serializable {
  private String make;
  private int year;
  private static final long serialVersionUID = 1L;
  private transient String model;

  public Car3(String make, int year, String model) {
    this.make = make;
    this.year = year;
    this.model = model;
  }

  public String toString(){
    return String.format("Car make is: %s, Car year is: %d, Car model is: %s, serialVersionUID: %d", this.make, this.year, this.model, serialVersionUID);
  }

  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    Car3 toyota = new Car3("Toyota", 2021, "Corolla");
    Car3 honda = new Car3("Honda", 2020, "Civic");
    FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(toyota);
    objectOutputStream.writeObject(honda);

    FileInputStream fileInputStream = new FileInputStream("cars.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

    Car3 toyotaCopy = (Car3) objectInputStream.readObject();
    Car3 hondaCopy = (Car3) objectInputStream.readObject();

    boolean isSameObject = toyotaCopy == toyota;
    System.out.println("Toyota (Copy) - "+ toyotaCopy);
    System.out.println("Toyota (Original) - "+ toyota);
    System.out.println("Is same object: "+ isSameObject);
  }
}