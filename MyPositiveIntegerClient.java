/**
 * Auto Generated Java Class.
 */
public class MyPositiveIntegerClient {
  
  
  public static void main(String[] args) { 
    MyPositiveInteger n1 = new MyPositiveInteger(5);
 System.out.println("n1 is " + n1.getValue());
 System.out.println("n1 is even? " + n1.isEven());
 System.out.println("n1 is odd? " + n1.isOdd());
 System.out.println("n1 is prime? " + n1.isPrime());
 char[] chars = {'3','5','3','9'};
 System.out.println(n1.parseInt(chars));
 String s = "9786";
 System.out.println(n1.parseInt(s));
 MyPositiveInteger n2 = new MyPositiveInteger(24);
 System.out.println("n2 is " + n2.getValue());
 System.out.println("n2 is odd? " + n2.isOdd());
 System.out.println("n1 is equal to n2? " + n1.equals(n2));
 System.out.println("n1 is equal to 5? " + n1.equals(5)); 
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
