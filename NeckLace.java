/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class NeckLace {
  
  public NeckLace() { 
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  public static int howLong (int firstStarting, int secondStarting) {

        int sum = 0;
        int temp;
        int one = firstStarting;
        int two = secondStarting;

        do{
            temp = (one + two) % 10;
            one = two;
            two = temp;
            System.out.print(two + " ");
        }while (two != secondStarting || one != firstStarting);

        return (sum);
    }
  
  public static void main(String[] args) { 
    int total;
        int first;
        int sec;

        Scanner in = new Scanner (System.in);
        System.out.print("Enter the first starting number: ");
        first = in.nextInt();

        System.out.print("Enter the second starting number: ");
        sec = in.nextInt();

        total = howLong (first, sec);
        in.close();
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
