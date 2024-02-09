package intermediate.GenericsandCollections.Generics.Interfaces;
/*Let’s implement the Retriever interface in a generic class.

In Container.java, implement the Retriever interface in Container and override retrieveData(). 
The body of retrieveData() should return the data field in Container.

Note: It’s okay to see an error in the terminal window about a missing main() method. */

public class Container<T> implements Retriever<T>{
  private T data;
    
  public Container(T data) {
    this.data = data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public T getData() {
    return this.data;
  }

@Override
    public T retrieveData() {
        return this.data;
    }
}