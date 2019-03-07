/**
 * Auto Generated Java Class.
 */
import java.util.*;

public class Lab8Q4 {
  
  
  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);  
    System.out.println("Please enter the first starting number:");
    int a=sc.nextInt();
    System.out.println("Please enter the second starting number:");
    int b=sc.nextInt();
    System.out.print(a+" "+b+" ");
    int aa=a;
    int bb=b;
    int x=0;
    String temp="";    
    boolean end=false;
       
    do{        
    x=a;
    a=b;
    b=x+b;
 
    temp=temp.valueOf(b);
   if(temp.length()>1){
     b=Integer.parseInt(temp.substring(1,2));
   }else{
     b=Integer.parseInt(temp.substring(0));}    
   System.out.print(b+" ");    
    if(a==aa && b==bb){
      end=true;
    }       
    }while(end==false);       
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
