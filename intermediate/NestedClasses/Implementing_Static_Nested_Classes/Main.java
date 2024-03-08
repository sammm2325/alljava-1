package intermediate.NestedClasses.Implementing_Static_Nested_Classes;

class VendingMachine{

    static class ChocolateBar {
     public String getName(){
       return "Hershey";
     }
 
     public double getPrice(){
       return 2.12;
     }
    }
 
    static class BagOfChips {
     public String getName(){
       return "Lays";
     }
 
     public double getPrice(){
       return 1.69;
     }
    }
   
 }
 
 public class Main{
   public static void main(String[] args){
     VendingMachine.ChocolateBar mikesChocolateBar = new VendingMachine.ChocolateBar();
 
     VendingMachine.BagOfChips  gabbysBagOfChips = new VendingMachine.BagOfChips();
 
     System.out.println("Mike's "+ mikesChocolateBar.getName()+ " chocolate bar costs "+mikesChocolateBar.getPrice());
     System.out.println("Gabby's "+ gabbysBagOfChips.getName()+ " bag of chips costs "+gabbysBagOfChips.getPrice());
     
     
   }
 }