/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class NameReaderInd {
  
  
  public static void main(String[] args) { 
    Scanner scan=new Scanner(System.in);
    String str;
    System.out.println("Enter string");
    str=scan.nextLine();
    
    int x=str.length();
    
    //first letter
    String f=str.substring(0,1);
    String l=str.substring(x-1);
    String m=str.substring(x/2);
    
    System.out.println(f);
    System.out.println(l);
    System.out.println(m);
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
