/*FileWriter 
Add an import statement to the top of the file to bring in FileWriter and IOException. As with before, have the main method throw the IOException.


Stuck? Get a hint
Checkpoint 2 Step instruction is unavailable until previous steps are completed
2.
Declare a FileWriter object using "output.txt", which will be the name of our file.

Checkpoint 3 Step instruction is unavailable until previous steps are completed
3.
Now it’s time to write to our file! In the following order:

Create a String named outputText and set it to any message you want
Use the .write() method to write the message to the file.
Checkpoint 4 Step instruction is unavailable until previous steps are completed
4.
Finally, close your FileWriter object to ensure your message gets flushed from the buffer and into your file.
*/
import java.io.*;
public class Introduction4 {
    public static void main(String[] args) throws IOException {
        // Your code here:
        FileWriter writer = new FileWriter("output.txt");
        String outputText = "Hello, World!";
        writer.write(outputText);
        writer.close();
      }
}
