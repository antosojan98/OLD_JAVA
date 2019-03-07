/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Nov17Q2 {
  
  
  public static void main(String[] args) { 
    double h=0,velocity;
    int time;
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the velocity");
    velocity=scan.nextDouble();
    //loop for the first 4 entries
    for(time=0;time<4;time++)
    {
//height is added with velocity each time and velocity is decreased by 32
    System.out.print("Time: "+time);
    h=h+velocity;
    System.out.println("  Height: "+h);
    velocity=velocity-32;
    }
   
//loop for the next 4 entries
    for(time=5;time<8;time++)
    {
//height is added with velocity each time and velocity is decreased by 32
    System.out.print("Time: "+time);
    h=h+velocity;
    System.out.println("  Height: "+h);
    velocity=velocity-32;
    
   
    }
    //when height is less than zero the ball bounces and height=v*h*0.05
    if(h<0)
    {
      h=h*velocity*(0.05);
      System.out.println("Bounce");
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}
