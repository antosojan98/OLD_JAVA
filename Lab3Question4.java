/**
 * Auto Generated Java Class.
 */
import java.util.*;
import java.lang.String.*;

public class Lab3Question4 {
  
  
  public static void main(String[] args) { 
    String s;
    
    Scanner s1=new Scanner(System.in);
    System.out.println("Please enter your country name");
    s=s1.nextLine();
    int x=s.length();
    //checking the last letter of the string
    char s2=s.charAt(x-1);
    
    //checking the last letter equals to e 
    if(s2=='e')
      System.out.println("La "+s);
    //checking the last letter equals to a 
     if(s2=='a')
      System.out.println("Le "+s);
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
