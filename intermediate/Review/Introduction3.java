package intermediate.Review;
/*FileReader
Import the two classes from the java.io package needed here.

In your main method declaration, throw the IOException.


Stuck? Get a hint
Checkpoint 2 Step instruction is unavailable until previous steps are completed
2.
Declare a FileReader object using path, which points to the relative path of input.txt. Name the FileReader something pertinent.

Checkpoint 3 Step instruction is unavailable until previous steps are completed
3.
Now it’s time to access our file! To do so:

Create a counter variable set to 0
Write a while loop
Checkpoint 4 Step instruction is unavailable until previous steps are completed
4.
Finally, close your FileInputStream object.
 */
import java.io.*;
public class Introduction3 {
    public static void main(String[] args) throws IOException {
        String path = "./input.txt";
        FileReader reader = new FileReader(path);
        int counter = 0;
        while ((counter = reader.read()) != -1) {    
            System.out.print((char)counter);    
          } 
          reader.close();
    }
    
}
