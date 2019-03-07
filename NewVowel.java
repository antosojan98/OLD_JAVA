/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class NewVowel {
  
  
  public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String");
    String input=sc.nextLine();
    String inputup=input.toUpperCase();
    int vowel=0;
    for(int i=0;i<=inputup.length()-1;i++) {
        char ch=inputup.charAt(i);
        if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')) {
            vowel++;
            continue;
        }
    }
    System.out.println("No. of Vowels="+vowel);

    
  }
  
  /* ADD YOUR CODE HERE */
  
}
