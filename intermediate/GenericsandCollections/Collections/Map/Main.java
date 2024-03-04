package intermediate.GenericsandCollections.Collections.Map;
/*In Main.java, we’ve defined a method named countNumbers() that takes in a List of Integers named list as a parameter and returns a Map of an Integer-Integer pair. The purpose of this function is to count the number of occurrences of each number in list.

Inside countNumbers() create a Map named intCount that maps an integer to another integer.


Stuck? Get a hint
Checkpoint 2 Step instruction is unavailable until previous steps are completed
2.
Inside countNumbers(), loop through list. For each number in list, if it does not contain an entry in intCount, map that number to the number 1. If the entry does exist, do nothing (we will change this in the next checkpoint).

Checkpoint 3 Step instruction is unavailable until previous steps are completed
3.
Now it’s time to count the occurrences of each number in list. In the loop inside the countNumbers() method, if an entry for a number does exist, get the value of that entry, increment it by 1, and update the value of that entry. This represents the count of each number in list. */
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;
public class Main {
  public static void main(String[] args) {
    List<Integer> myInts = new ArrayList<>();
    Random random = new Random();

    for(int i =0; i < 20; i++) {
      myInts.add(random.nextInt(5));
    }

    System.out.println("myInts: " + myInts);

    Map<Integer, Integer> intCount = countNumbers(myInts);
    for(Map.Entry<Integer, Integer> entry: intCount.entrySet()) {
      System.out.println("Integer: "+ entry.getKey()+" appears: "+ entry.getValue());
    }
  }

public static Map<Integer, Integer> countNumbers(List<Integer> list) {
    Map<Integer, Integer> intCount = new HashMap<>();

    for (Integer number : list) {
        if (!intCount.containsKey(number)) {
            intCount.put(number, 1);
        } else {
            intCount.put(number, intCount.get(number) + 1);
        }
    }

    return intCount;
}
}