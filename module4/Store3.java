package module4;

public class Store3 {
    // instance fields
    String productType;
    double price;
    
    // constructor method
    public Store3(String product, double initialPrice) {
      productType = product;
      price = initialPrice;
    }
    
    // increase price method
    public void increasePrice(double priceToAdd){
      double newPrice = price+priceToAdd;
      price=newPrice;
    }
    
    public double getPriceWithTax(){
        double totalPrice= price + price * 0.08;
        return totalPrice;
    }

    // main method
    public static void main(String[] args) {
      Store3 lemonadeStand = new Store3("Lemonade", 3.75);
      lemonadeStand.increasePrice(1.5);
      System.out.println(lemonadeStand.price);

      Store3 lemonadeStand1 = new Store3("Lemonade", 3.75);
      double lemonadePrice= lemonadeStand1.getPriceWithTax();
      System.out.println(lemonadePrice);
    }
  }
