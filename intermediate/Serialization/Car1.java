package intermediate.Serialization;
// //In the main() method, let’s create all the Car objects we need to serialize an object to a file.

// Create:

// A Car object named toyota that represents a 2021 Toyota.
// A Car object named honda that represents a 2020 Honda.
// Now, let’s continue in the main() method by creating the Stream objects that we will need.

// Create:

// A FileOutputStream object (this class has been imported for you) named fileOutputStream, passing the String "cars.txt" as an argument. This will be the name of the file created.
// A ObjectOutputStream object (this class has been imported for you) named objectOutputStream, passing fileOutputStream to its constructor.

// Stuck? Get a hint
// Checkpoint 3 Failed, try again
// 3.
// Now that we have all our helper objects, let’s serialize the Car objects and write them to the cars.txt file.

// In the main() function, after all the object declarations we did previously, serialize the Car objects toyota and honda using the writeObject() method of objectOutputStream.

// We should see the file cars.txt appear in the file navigator. If we open the file, we see strange text written to it. This strange text is our serialized objects!
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Car1 implements Serializable {
  private String make;
  private int year;
  private static final long serialVersionUID = 1L;

  public static void main(String[] args) throws FileNotFoundException, IOException {
    Car1 toyota = new Car1("Toyota",2021);
    Car1 honda = new Car1("Honda",2020);

    FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(toyota);
    objectOutputStream.writeObject(honda);  
  }
}