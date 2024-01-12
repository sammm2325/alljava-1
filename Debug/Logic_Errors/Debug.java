package Debug.Logic_Errors;

// But the program is supposed to output steps 
// from #1 - #10. The program is somehow starting from 0…
public class Debug {

    public static void main(String[] args) {
      
      int steps = 10;
      
      for (int i = 1; i <= steps; i++) {
        
        System.out.println("Step #" + i);
        
      }
      
    }
    
  }