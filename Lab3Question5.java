/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Lab3Question5 {
  
  
  public static void main(String[] args) { 
    
    String transaction,account;
   double deposit,withdraw,td,tw,transfer,tt,initial,transactions,at,att,totalamount,finalamount;
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter your initial balance");
    initial=s1.nextDouble();
    if(initial<0)
      System.out.println("It cannot be processed");
 
    System.out.println("What is the type of transaction? Deposit(d) Withdraw(w) Transfer(t)");
    transaction=s1.nextLine();
    char ch=transaction.charAt(0);
    
    
    
    if(ch=='d')
    {
      System.out.println("Enter your deposit");
      deposit=s1.nextDouble();
      td=initial+deposit;
    }
    if(ch=='w')
    {
      System.out.println("Enter your amount you want to withdraw");
      withdraw=s1.nextDouble();
      tw=initial-withdraw;
    }
    if(ch=='t')
    {
      System.out.println("Enter your amount you want to transfer");
      transfer=s1.nextDouble();
      tt=initial-transfer;
    } 
    
  
    System.out.println("Enter your account type");
    account=s1.nextLine();
    if(account.equals("chequing"));
    {
      System.out.println("You have selected chequing");
    }
      if(account.equals("savings"))
    {
      System.out.println("You have selected savings");
    }
    
  
      
    
    
      System.out.println("Please enter your amount");
    at=s1.nextDouble();
    
  
    if(at>initial)
      System.out.println("It cannot be processed");
    else
      System.out.println("Balances are: Chequing="+at+" Saving=");
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
