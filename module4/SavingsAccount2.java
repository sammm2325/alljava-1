package module4;

public class SavingsAccount2 {
  
    int balance;
    
    public SavingsAccount2(int initialBalance){
      balance = initialBalance;
    }
    
    public void checkBalance(){
      System.out.println("Hello! Your balance is "+ balance);
    }
  
    public void deposit(int amountToDeposit){
      balance+=amountToDeposit;
    }
  
    public int withdraw(int amountToWithdraw){
      balance-=amountToWithdraw;
      return amountToWithdraw;
    }
    public static void main(String[] args){
      SavingsAccount2 savings = new SavingsAccount2(2000);
      
      //Check balance:
      System.out.println("Hello!");
      System.out.println("Your balance is "+savings.balance);
      
      //Withdrawing:
      int afterWithdraw = savings.balance - 300;
      savings.balance = afterWithdraw;
      System.out.println("You just withdrew "+300);
      
      //Check balance:
      System.out.println("Hello!");
      System.out.println("Your balance is "+savings.balance);
      
      //Deposit:
      int afterDeposit = savings.balance + 600;
      savings.balance = afterDeposit;
      System.out.println("You just deposited "+600);
      
      //Check balance:
      System.out.println("Hello!");
      System.out.println("Your balance is "+savings.balance);
      
      //Deposit:
      int afterDeposit2 = savings.balance + 600;
      savings.balance = afterDeposit2;
      System.out.println("You just deposited "+600);
      
      //Check balance:
      System.out.println("Hello!");
      System.out.println("Your balance is "+savings.balance);
      
      savings.checkBalance();
      savings.deposit(3);
      savings.withdraw(3);
    }       
  }
  
