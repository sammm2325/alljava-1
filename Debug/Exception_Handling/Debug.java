package Debug.Exception_Handling;

public class Debug {

    public static void main(String[] args) {
     try{
      int width = 0;
      int length = 40;
      
      int ratio = length / width;
     } 
     catch(NullPointerException e) {
        System.err.println(e.getMessage());
     }
     catch(ArithmeticException e){
      System.err.println(e.getMessage());
     }
      
          
    }
    
  }
