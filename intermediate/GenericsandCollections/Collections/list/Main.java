/*Let’s create a collection of words that are in sequential order.

In main() of Main.java, create a String type List reference with an ArrayList implementation named stringList.


Stuck? Get a hint
Checkpoint 2 Passed
2.
Let’s add elements in our collection.

In main(), call add() on stringList so that stringList has the following sequence of elements: "Hello", "World", "!"


Stuck? Get a hint
Checkpoint 3 Enabled
3.
Let’s print out all the elements in our List.

After adding Strings to stringList, iterate through stringList with an enhanced for-loop using a String reference named element. In the body of the for-loop call System.out.println() and output element to the terminal. */

import java.util.List;
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
    List<String> stringList = new ArrayList<String>();
    stringList.add("Hello");
    stringList.add("World");
    stringList.add("!");
    for (String element : stringList) {
      System.out.println(element);
    }
  }
} 