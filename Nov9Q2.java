/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Nov9Q2 {
  
  
  public static void main(String[] args) { 
    int num[]={1,2,3,4,5,6,7,8,9,10};
    int product=1;
    for(int i=0;i<10;i++)
    {
      System.out.println(num[i]);
    }
    for(int j=0;j<4;j++)
    {
      product=product*num[j];
    }

    int sum=0;
    for(int k=0;k<10;k++)
    {
      sum=sum+num[k];
    }
    System.out.println("Sum of last 5 is "+sum);
    System.out.println("Product plus sum of all "+(sum+product));
  }
  
  /* ADD YOUR CODE HERE */
  
}
