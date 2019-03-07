/**
 * Auto Generated Java Class.
 */
import java.util.*;
import java.lang.Math.*;
public class Motor_Boat {
  double eff;
  double speed;
  double distance;
  double time;
  double amount;
  public Motor_Boat() { 
    this.eff=0.0;
    this.speed=0.0;
    this.distance=0.0;
    this.time=0.0;
    this.amount=0.0;
  }
  public void get_data(){
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter boat efficiency");
  eff=scan.nextDouble();
  System.out.println("Enter boat speed");
  speed=scan.nextDouble();
  System.out.println("Enter boat time");
  time=scan.nextDouble();
 
  
  }
  public double getfuel(){
  amount=eff*(Math.pow(speed,2))*time;
  return amount;
  }
  public double getdistance(){
  distance=speed*time;
  return distance;
  }
  
  public static void main(String[] args) { 
    Motor_Boat m=new Motor_Boat();
    m.get_data();
    m.getfuel();
    m.getdistance();
    
    System.out.println("The amount of fuel consumed: "+m.getfuel()); 
    
    System.out.println("The distance travelled: "+m.getdistance()); 
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
