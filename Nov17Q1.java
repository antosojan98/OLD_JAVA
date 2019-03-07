/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Nov17Q1 {
  
  
  public static void main(String[] args) { 
    String str="";
    
    do{
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your string");
    str=scan.nextLine();
    int x=str.length();
    //check for the last word of the string
    char ch=str.charAt(x-1);
    //check for the first word for the string
    char ch1=str.charAt(0);
    
    //check if first and last word is equal
      if(ch==ch1){
      System.out.println("First and last word is equal");}
      
       //check if first and last word is not equal
      if(ch!=ch1){
      System.out.println(" ");}
    
    
    }while(!str.equals("done")); //when done is entered the loop stops
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
