package intermediate.GenericsandCollections.Generics.Methods;
/*Let’s define a generic method in our class so we can detect Double types.

In Main.java, define a generic, static method named isDouble() 
with a T type parameter named object and a boolean return type. 

et’s complete the body of isDouble() to return
 true if object is an instance of Double and false otherwise.
Let’s try calling our generic method using the variables provided.

In main() we’ve provided two test cases variables, test1 & test2. Call

isDouble() with test1 and store the result in a boolean type named isTest1Double.
isDouble() with test2 and store the result in a boolean type named isTest2Double.
Call System.out.println() twice to output isTest1Double & isTest2Double.*/
public class Main {
    public static <T> boolean isDouble(T object) {
      return object instanceof Double;
    }
    public static void main(String[] args) {
      String test1 = "Double";
      double test2 = 5.8;
  
      // Enter code below... 
        boolean isTest1Double = isDouble(test1);
        boolean isTest2Double = isDouble(test2);
        
        System.out.println(isTest1Double);
        System.out.println(isTest2Double);
    }
  }