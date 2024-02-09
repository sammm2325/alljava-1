package intermediate.GenericsandCollections.Collections.Queue;
/*In main() of Main.java we’ve made a Queue named line with names (Strings) and printed out the contents of the Queue. We’d like to be able to process line in alphabetical order rather than FIFO.

Define a new public static method called processAlphabetically() that accepts a parameter named queue that represents a Queue of Strings. This method returns no value


Stuck? Get a hint
Checkpoint 2 Step instruction is unavailable until previous steps are completed
2.
Recall that a PriorityQueue will have the smallest element at the head of the collection. The smallest element in a collection of Strings will be in lexicographical (alphabetical) order.

In processAlphabetically(), create a Queue of Strings reference with a PriorityQueue implementation named alphabeticalQueue.

Checkpoint 3 Step instruction is unavailable until previous steps are completed
3.
Next, let’s add all the elements in queue into alphabeticalQueue by using an enhanced for-loop. The for-loop should iterate through queue using a String reference called name and add name to alphabeticalQueue.

Checkpoint 4 Step instruction is unavailable until previous steps are completed
4.
Let’s process the names in alphabeticalQueue alphabetically.

Under the for-loop in processAlphabetically() define a while loop that will iterate until peek() of alphabeticalQueue returns null. In the body of the while loop, create a String reference named headElement and store the result of removing the head from alphabeticalQueue. Finally, use System.out.println() to print the following message:

Processing: <element> */

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class Main {

    public static void processAlphabetically(Queue<String> queue) {
        Queue<String> alphabeticalQueue = new PriorityQueue<>();
        for(String name: queue) {
        alphabeticalQueue.add(name);
        }
        while(alphabeticalQueue.peek() != null) {
          String headElement = alphabeticalQueue.poll();
          System.out.println("Processing: " + headElement);
        }
    }
  public static void main(String[] args) {
    Queue<String> line = new LinkedList<>();
    line.add("Mike");
    line.add("Isabel");
    line.add("Jenny");

    for(String name: line) {
      System.out.println(name);
    }
    processAlphabetically(line);
  }
}