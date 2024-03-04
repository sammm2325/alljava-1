package intermediate;

public class Stringbox {
    private String data;
  
    public <T> boolean isString(T item) {
      return item instanceof String; 
    }
    public static void main(String[] args) {
      Stringbox box = new Stringbox();
      box.isString(5); // Returns false
    }
  }
  