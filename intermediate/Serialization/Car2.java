package intermediate.Serialization;
/*Let’s begin by creating the helper objects we will use to deserialize an object from a file.

At the bottom of main(), create:

A FileInputStream object named fileInputStream and pass "cars.txt" as an argument to its constructor.
A ObjectInputStream object named objectInputStream and pass fileInputStream as an argument to its constructor.

Stuck? Get a hint
Checkpoint 2 Step instruction is unavailable until previous steps are completed
2.
Using the helper objects defined previously, let’s convert a serialized stream of bytes back into a Java object (also known as deserialization).

In main(), below the helper input objects, call readObject() from objectInputStream and store the return value of the first call in a Car type named toyotaCopy and the second call in hondaCopy.

Checkpoint 3 Step instruction Let’s compare the original serialized objects with the deserialized objects to ensure that they have the same field values but are different objects.

Create a boolean type named isSameObject and set the value to be the reference comparison of toyotaCopy and toyota. Then, using System.out.println(), output toyotaCopy, toyota, and isSameObject to the terminal.

Note that we’ve provided a toString() implementation in the Car class that returns the String "Car make is: <this.make>, Car year is: <this.year>"

An example terminal output would look like:

Toyota (Copy) - Car make is: Toyota, Car year is: 2021
Toyota (Original) - Car make is: Toyota, Car year is: 2021
Is same object: false


*/
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Car2 implements Serializable {
  private String make;
  private int year;
  private static final long serialVersionUID = 1L;

  public Car2(String make, int year) {
    this.make = make;
    this.year = year;
  }

  public String toString(){
    return String.format("Car make is: %s, Car year is: %d", this.make, this.year);
  }

  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    Car2 toyota = new Car2("Toyota", 2021);
    Car2 honda = new Car2("Honda", 2020);

    FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

    objectOutputStream.writeObject(toyota);
    objectOutputStream.writeObject(honda);


    FileInputStream fileInputStream = new FileInputStream("cars.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

    Car2 toyotaCopy= (Car2) objectInputStream.readObject();
    Car2 hondaCopy= (Car2) objectInputStream.readObject();

    boolean isSameObject = toyotaCopy == toyota;
    //Then, using System.out.println(), output toyotaCopy, toyota, and isSameObject
    System.out.println("Toyota (Copy) - "+toyotaCopy);
    System.out.println("Toyota (Original) - "+toyota);
    System.out.println("Is same object: "+ isSameObject);



  }
}