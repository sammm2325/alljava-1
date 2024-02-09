package intermediate.GenericsandCollections.Collections.Set;
/*Let’s create a collection of unique numbers that are stored in order based on their values.

In main() of Main.java, create a Set of Integers named sortedSet with an implementation of Set that stores elements in order based on their values.


Stuck? Get a hint
Checkpoint 2 Step instruction is unavailable until previous steps are completed
2.
Let’s add elements to our collection.

In main(), call add() on sortedSet and add the following elements: 3, 7, 27, 7.

Checkpoint 3 Step instruction is unavailable until previous steps are completed
3.
Let’s print out all the elements in our Set.

After adding the number to the sortedSet, iterate through sortedSet with an enhanced for-loop using an Integer reference named element. In the body of the for-loop call System.out.println() and output element to the terminal. */

import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Set<Integer> sortedSet = new TreeSet<Integer>();
    sortedSet.add(3);
    sortedSet.add(7);
    sortedSet.add(27);
    sortedSet.add(7);
    for (Integer element : sortedSet) {
      System.out.println(element);
    }
  }
}