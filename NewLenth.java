/**
 * Auto Generated Java Class.
 */
import java.util.*;
import java.lang.Math.*;
public class NewLenth {
  
  
  public static void main(String[] args) { 
    String s1="Happy Birthday to you";
    int x=s1.length();
    System.out.println("Length: "+x);
    
    String s2=s1.substring(5);
    System.out.println("Substring after 5: "+s2);
   
    String s3=s1.toLowerCase();
    System.out.println("Sentence in lower case "+s3);
      
    String s4=s1.toUpperCase();
    System.out.println("Sentence in upper case "+s4);
      
    String s5="     Happy Birthday    ";
    String s6=s5.trim();
    System.out.println("Sentence without spaces is: "+s6);
       
    String s7=s1.substring(5,10);
    System.out.println("Substring is: "+s7);
       
    String s8=s5.replace('a','b');
    System.out.println("Replaced character "+s8);
        
    int y=s1.indexOf("Birthday");
    System.out.println("Index of "+y);
       
    String s9="Happy birthday to you if its your birthday today";
    int t=s9.lastIndexOf("Birthday");
    System.out.println("Index of "+x);
       
    boolean u=s1.startsWith("Happy");
    System.out.println(u);
       
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
