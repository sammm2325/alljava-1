package intermediate.GenericsandCollections.Collections.Deque;
/*Let’s practice using a Deque to separate odd and even integers stored in a List.

In Main.java, complete the body of separateInts() by first creating a Deque of Integers called separatedDeque with an ArrayDeque implementation.


Stuck? Get a hint
Checkpoint 2 Step instruction is unavailable until previous steps are completed
2.
Let’s separate even and odd integers.

In separateInts(), define an enhanced for-loop that iterates over integers using an Integer named myInt. 
In the body of the for-loop, add myInt to the front of separatedDeque if it’s even and add it to the back if it’s odd. */
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
    List<Integer> myInts = new ArrayList<>();
    myInts.add(9);
    myInts.add(13);
    myInts.add(2);
    myInts.add(1);
    myInts.add(11);
    myInts.add(39);
    myInts.add(78);
    myInts.add(4);

    Deque<Integer> result = separateInts(myInts);
    for(Integer i: result) {
      System.out.println(i);
    }
  }

 // add your code here to complete separateInts()
public static Deque<Integer> separateInts(List<Integer> integers){
    Deque<Integer> separatedDeque = new ArrayDeque<>();
    
    for(Integer myInt : integers) {
        if(myInt % 2 == 0) {
            separatedDeque.addFirst(myInt); // add even integers to the front
        } else {
            separatedDeque.addLast(myInt); // add odd integers to the back
        }
    }
    
    return separatedDeque;
}
}