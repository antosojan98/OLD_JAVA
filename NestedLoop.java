/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class NestedLoop {
  
  
  public static void main(String[] args) { 
    for(int y=0;y<5;y++)
    {
    for(int x=0;x<5;x++)
    {
      System.out.print(x);
    }
      System.out.print(y);
    }
    int number, lastDigit, reverse = 0;

      Scanner scan = new Scanner(System.in);

      System.out.print("Enter a positive integer: ");
      number = scan.nextInt();
            do
      {
         lastDigit = number % 10;
         reverse = (reverse * 10) + lastDigit;
         number = number / 10;
      }
      while (number > 0);

      System.out.println("That number reversed is " + reverse);

  }
  
  /* ADD YOUR CODE HERE */
  
}
