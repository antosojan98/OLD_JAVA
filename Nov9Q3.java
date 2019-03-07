/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Nov9Q3 {
  int x;
  int y;
  int w;
  int z;
  
  public Nov9Q3() { 
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  public void get_data(){
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter first integer");
    x=s1.nextInt();
    
    Scanner s2=new Scanner(System.in);
    System.out.println("Enter second integer");
    y=s2.nextInt();
    
    Scanner s3=new Scanner(System.in);
    System.out.println("Enter third integer");
    w=s3.nextInt();
    
    Scanner s4=new Scanner(System.in);
    System.out.println("Enter fourth integer");
    z=s4.nextInt();
      
  }
  public void display(){
  }
  public int smallest(int a, int b,int c,int d){
  
    x=a;
    y=b;
    w=c;
    z=d;
    return (smallest);
    
  }
  
  public static void main(String[] args) { 
    Nov9Q3 n=new Nov9Q3();
    n.get_data();
    n.smallest();
    int min;
    int num[]={a,b,c,d};
    Array.sort(num);
    for(int i=0;i<num.length;i++){
       if (num[i] > min) min = num[i];
    }
    System.out.println("The smallest number is "+min);
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
