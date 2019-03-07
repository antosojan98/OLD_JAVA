/**
 * Auto Generated Java Class.
 */
import java.lang.Math.*;
import java.lang.String.*;
import java.util.*;
public class MaleFemaleName {
  
  
  public static void main(String[] args) { 
    String s;
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter your name");
    s=s1.nextLine();
    
     if(s.charAt(s.length()-1)!='a' && s.charAt(s.length()-1)!='e' && s.charAt(s.length()-1)!='i' &&  s.charAt(s.length()-1)!='o' &&  s.charAt(s.length()-1)!='u')
      System.out.println("You have a Male name");
    if(s.charAt(s.length()-1)=='a' || s.charAt(s.length()-1)=='e' || s.charAt(s.length()-1)=='i' ||  s.charAt(s.length()-1)=='o' ||  s.charAt(s.length()-1)=='u')
      System.out.println("You have a female name");
  }
  
  /* ADD YOUR CODE HERE */
  
}
