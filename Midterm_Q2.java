/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Midterm_Q2 {
  
  
  public static void main(String[] args) { 
    double price,newprice=0;
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the original price");
    price=scan.nextDouble();
    
    for(int day=1;day<6;day++)
    {
      newprice=price-(price*0.01);
           
      price=0+newprice;
       price--;

     
    
      System.out.println("The price for day "+day+" is: "+newprice);
    }
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
