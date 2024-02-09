package intermediate.GenericsandCollections.Generics.UpperBounds;
/*.
Currently, our Bus class can have any type of generic parameter. We would like to
 restrict this type of parameter to better meet our needs.

In Bus.java, modify the type parameter so that we can only create Buses of SchoolPerson, Student, 
or Teacher.

Note: Both Student and Teacher are subclasses of SchoolPerson. Feel free to look at 
SchoolPerson.java, Student.java, and Teacher.java to see how they relate to each other. */
public class Bus<T extends SchoolPerson> {
    private T rider;
  
    public Bus(T rider) {
      this.rider = rider;
    }
  
    public void setRider(T rider) {
      this.rider = rider;
    }
  
    public T getRider() {
      return this.rider;
    }
  
    public void printRider() {
      System.out.println(rider.toString());
    }
  }