/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class LeapYear {
  
  
  public static void main(String[] args) {
    int leap;
    
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your year");
    leap=scan.nextInt();
    if ((leap%4)==0 && (leap%100)!=0)
      System.out.println("It is a leap year");
     if ((leap%4)==0 && (leap%100)==0 && (leap%400)==0)
      System.out.println("It is a leap year");
      else 
      {
        System.out.println("It is not a leap year");}
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
