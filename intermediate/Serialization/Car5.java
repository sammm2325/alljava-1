package intermediate.Serialization;
/*The class Car has a non-serializable Engine reference field named engine that cannot be serialized currently. Let’s fix that!

In the class Car, complete the implementation of writeObject() to serialize the fields (state) of engine using the ObjectOutputStream stream methods. Use the provided public getters to access engine fields.

// Engine getter methods (implemented in Engine.java)
public double getLiters();
public int getCylinders();


Stuck? Get a hint
Checkpoint 2 Step instruction is unavailable until previous steps are completed
2.
We’ve customized the serialization of a non-serializable field in Car. Now, we need to deserialize the Engine fields back into an engine object.

In the class Car, complete the implementation of readObject() to deserialize all Car fields using the ObjectInputStream stream methods. Create a local double variable named liters and an int variable named cylinders to store the serialized Engine fields. Use the provided Engine constructor to initialize the engine reference field with liters and cylinders.

Note: The fields must be deserialized in the same order as they were serialized in Checkpoint 1. */
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Car5 implements Serializable {
  private String make;
  private int year;
  private static final long serialVersionUID = 1L;
  private Engine engine;

  public Car5(String make, int year) {
    this.make = make;
    this.year = year;
    this.engine = new Engine(2.4, 6);
  }

 private void writeObject(ObjectOutputStream stream) throws IOException {
    stream.writeObject(this.make);
    stream.writeInt(this.year);
    stream.writeDouble(this.engine.getLiters());
    stream.writeInt(this.engine.getCylinders());
  }
 
  private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
    this.make = (String) stream.readObject();
    this.year = (int) stream.readInt();
    double liters = (double) stream.readDouble();
    int cylinders  = (int) stream.readInt();
    this.engine = new Engine(liters, cylinders);
  }    


  public String toString(){
    return String.format("Car make is: %s, Car year is: %d, %s", this.make, this.year, this.engine);
  }

  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    Car5 toyota = new Car5("Toyota", 2021);
    Car5 honda = new Car5("Honda", 2020);
    FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(toyota);
    objectOutputStream.writeObject(honda);

    FileInputStream fileInputStream = new FileInputStream("cars.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

    Car5 toyotaCopy = (Car5) objectInputStream.readObject();
    Car5 hondaCopy = (Car5) objectInputStream.readObject();

    boolean isSameObject = toyotaCopy == toyota;
    System.out.println("Toyota (Copy) - "+toyotaCopy);
    System.out.println("Toyota (Original) - "+toyota);
    System.out.println("Is same object: "+ isSameObject);
  }
}