package intermediate.GenericsandCollections.Generics.Interfaces;
/*Let’s implement the Retriever interface in a non-generic class.

In Book.java, implement the Retriever interface in Book and override retrieveData(). 
The body of retrieveData() should return the name field in Book. In this case, 
Book is a Retriever of Strings.

Note: It’s okay to see an error in the terminal window about a missing main() method. */
public class Book implements Retriever<String>{
    @Override
    public String retrieveData() {
      return this.name;
    }
    private String name;
  
    public Book(String name) {
      this.name = name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    public String getName() {
      return this.name;
    }
  }