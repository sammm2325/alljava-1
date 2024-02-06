package module4;

public class store1 {
    // instance fields
    String productType;
    
    // constructor method
    public store1(String product) {
      productType = product;
    }
    
    // advertise method
    public void advertise() {
      String message = "Selling " + productType + "!";
          System.out.println(message);
    }
    
    // main method
    public static void main(String[] args) {
      String cookie = "Cookies";
      store1 cookieShop = new store1(cookie);
      cookieShop.advertise();
    }
  }
