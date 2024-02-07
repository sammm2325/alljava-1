package intermediate.Review;

/*Beneath the comment, write a print statement that asks the user what their name is.


Stuck? Get a hint
Checkpoint 2 Step instruction is unavailable until previous steps are completed
2.
After the print statement, declare a new String variable called userName, initialize it to the Scanner’s next String input, and use the table from the exercise to find the appropriate method.

Remember, once we ask the Scanner to find us information, we block the execution of the rest of the program. Nothing will run unless the input is received.

Checkpoint 3 Step instruction is unavailable until previous steps are completed
3.
Use System.out.printf() to print the following statement:

Hello "userName"! It's nice to meet you.

where “userName” is replaced with the input provided by the user.

Checkpoint 4 Step instruction is unavailable until previous steps are completed
4.
Now let’s test it out! First, compile your program using the correct command in the terminal.

Checkpoint 5 Step instruction is unavailable until previous steps are completed
5.
Now, run your program using the correct command in the terminal. */

import java.util.Scanner;

public class Introduction2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Add code below:
        System.out.println("What is your name?");
        String userName = input.next();
        System.out.printf("Hello %s! It's nice to meet you.", userName);
        
        input.close();
      }
}
