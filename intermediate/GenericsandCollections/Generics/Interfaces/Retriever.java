package intermediate.GenericsandCollections.Generics.Interfaces;
/*Let’s start by defining our generic interface and an abstract method to be implemented.

In Retriever.java, create a generic interface named Retriever with a T type parameter. 
Define the method signature for a method named retrieveData() with no parameters and a T return type.

Note: It’s okay to see an error in the terminal window about a missing main() method. */
public interface Retriever<T> {
    public T retrieveData();
}