/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Midterm_Q4 {
  
  
  public static void main(String[] args) { 
    int ticket,limit=100,total;
    
    Scanner scan=new Scanner(System.in);
    
    

  
    do
    {
      
     System.out.println("Enter the number of tickets");
    ticket=scan.nextInt();
  
    
       total=limit-ticket;
       
       System.out.println("Tickets remaining "+total);
     
      limit=total;
     
     
    
    
    }while(ticket<20);
    System.out.println("sorry you can't buy more than 20 tickets");
      
       
      
      
    
    
    
    
   
      
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
