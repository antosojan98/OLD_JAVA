/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Midterm_Q1 {
  
  
  public static void main(String[] args) { 
    double weight;
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the required weight");
    weight=scan.nextDouble();
    if(weight<=2)
      System.out.println("Your Shipping rate is: 1.10 ");
     if(weight>2 && weight<=6)
      System.out.println("Your Shipping rate is: 2.20 ");
      if(weight>6 && weight<=10)
      System.out.println("Your Shipping rate is: 3.70 ");
       if(weight>10)
      System.out.println("Your Shipping rate is: 3.80 ");
       
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
