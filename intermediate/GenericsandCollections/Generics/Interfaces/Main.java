package intermediate.GenericsandCollections.Generics.Interfaces;
/*Let’s create some references to our generic interfaces and output some data to the terminal.

In Main.java, under variables we’ve defined for you (myNumber & bookName), 
create two Retriever references:

An Integer type Container implementation named containerRetriever. Initialize it with myNumber.
Book implementation named bookRetriever. Initialize it with bookName.
Call System.out.println() to print the result of retrieveData() from containerRetriever.

Call System.out.println() to print the result of retrieveData() from bookRetriever. */
public class Main {
    public static void main(String[] args) {
      int myNumber = 24;
      String bookName = "Hello Book!";
      // Enter your code below...
      Retriever<Integer> containerRetriever = new Container<>(myNumber);
      Retriever<String> bookRetriever = new Book(bookName);
  
      System.out.println("Container retrieved data: "+ containerRetriever.retrieveData());
      System.out.println("Book retrieved data: " + bookRetriever.retrieveData());
  
    }
  }
