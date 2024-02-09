package intermediate.GenericsandCollections.Generics.classes;

import java.awt.print.Book;

/*Let’s create Container references and print it’s data field to the terminal.

We’ve provided a Book class for you to use with a single String argument constructor. In main() of Main.java, create the following references:

A String type Container named wordContainer. Use myWord to initialize it.
A Book type Container named bookContainer. Use myBook to initialize it.
Call System.out.println() to print wordContainers data field using it’s getter.

Call System.out.println() to print bookContainers data field using it’s getter. */

public class Main {
    public static void main(String[] args) {
      String myWord = "Hello";
      Book myBook = new Book("My Book");
      // Create `Container` references and print statement below...
      Container<String> wordContainer = new Container<String>(myWord);
      Container<Book> bookContainer = new Container<Book>(myBook);

      System.out.println(wordContainer.getData());
      System.out.println(bookContainer.getData());
    }
  }