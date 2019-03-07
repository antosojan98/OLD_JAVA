/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Lab3Question3 {
  
  
  public static void main(String[] args) { 
    int month;
    
    Scanner s1=new Scanner(System.in);
    System.out.println("Please enter your month");
    month=s1.nextInt();
    //month where days=31
    if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
      System.out.println("This month has 31 days");
    //month where days=30
    else
       if(month==4 || month==6 || month==9 || month==11) 
         System.out.println("This month has 30 days");
    //month where days=28 February to be exact
       else
       if(month==2)
       System.out.println("This is the only month with 28 days");
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
