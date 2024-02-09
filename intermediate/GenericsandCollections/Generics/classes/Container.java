package intermediate.GenericsandCollections.Generics.classes;
/*Let’s start by defining our generic class that will represent a real world container.

In Container.java, create a generic class called Container with a type parameter T. Inside container, create a private type T field called data.

Note: It’s okay to see an error in the terminal window about a missing main() method. 

Let’s complete our class so we can create references to it.

In the Container class, add a public constructor with a type T parameter named data. Set the data field to the value of the data parameter. Also, create a getter named getData() and a setter named setData() for the data field.

Note: It’s okay to see an error in the terminal window about a missing main() method.
*/
public class Container<T> {
  private T data;

    public Container(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
