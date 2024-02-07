package intermediate.Review;
// //The Scanner Class
// .
// Import the Scanner class at the top of your program, outside of the class declaration.
// Checkpoint 2 Step instruction is unavailable until previous steps are completed
// 2.
// Now declare and instantiate a new Scanner object using System.in in the constructor.
import java.util.Scanner;

public class Introduction1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "Sam";
        String hobbies = "Reading, Writing, Coding";
        int age = 25;
        System.out.println("My name is " + name);
        System.out.printf("I am %d years old\n", age);
        System.out.print("My hobbies are " + hobbies);
        input.close();
    }    
}

