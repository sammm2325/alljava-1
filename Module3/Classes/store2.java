package Module3.Classes;

public class store2 {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;
    // constructor method
    public store2(String product, int count, double price) {
      productType = product;
      inventoryCount = count;
      inventoryPrice = price;
    }
    
    // main method
    public static void main(String[] args) {
        store2 cookieShop = new store2("cookies", 12, 3.75);
    }
  }
