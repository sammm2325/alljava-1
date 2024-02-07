package intermediate.Serialization;
/*Let’s begin by creating a class that will serve as a blueprint for creating Car objects.

In Car.java, define a public class named Car with the following member fields:

A private String named make.
A private int named year.

Stuck? Get a hint
Checkpoint 2 Step instruction is unavailable until previous steps are completed
2.
Let’s implement the Serializable interface (this has been imported for you) in the Car class to inform the JVM that Car objects are serializable.

Checkpoint 3 Step instruction is unavailable until previous steps are completed
3.
We need to provide the JVM with a unique identifier when converting a serialized stream of bytes back into an object with a serialVersionUID. Add a private static final long to the Car class named serialVersionUID with a value of 1L.

Checkpoint 4 Step instruction is unavailable until previous steps are completed
4.
Finally, create a public constructor with two parameters, a String and int type named make and year respectively. Initialize the member fields make and year to the parameters make and year in the constructor. */
import java.io.Serializable;

public class Car implements Serializable {
    private String make;
    private int year;
    private static final long serialVersionUID = 1L;

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }
}