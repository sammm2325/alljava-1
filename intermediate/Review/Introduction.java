package intermediate.Review;

// Before we can print our variables, we need variables to print! In the code editor declare the following variables:

// a String name that’s set to your name
// a String hobbies that contains a list of your hobbies
// an int age that contains your age
// Use System.out.println() to print your name in the following format: My name is ___
// Use System.out.printf() to print your age in the following format:

// "I am __ years old"


// Stuck? Get a hint
// Checkpoint 4 Step instruction is unavailable until previous steps are completed
// 4.
// Use System.out.print() to print your hobbies using the following format:

// My hobbies are ______

// Checkpoint 5 Step instruction is unavailable until previous steps are completed
// 5.
// Hmm… Notice anything strange about the output? It looks like we need to add a new line character in order to get our text to format properly for the user.

// Go back to your .printf() statement and add \n to the end of the string.
public class Introduction {
    public static void main(String[] args) {
        String name = "Sam";
        String hobbies = "Reading, Writing, Coding";
        int age = 25;
        System.out.println("My name is " + name);
        System.out.printf("I am %d years old\n", age);
        System.out.print("My hobbies are " + hobbies);
    }
  }
  