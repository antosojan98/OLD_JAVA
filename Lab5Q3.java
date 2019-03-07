/**
 * Auto Generated Java Class.
 */
import java.util.*;


public class Lab5Q3 {
  
  int temperature;
  
  
  public Lab5Q3(int t) { 
    this.temperature=t;
  }
  
  public boolean isEthylFreezing(){
  
    if(this.temperature<=(-173)){
      return true;
    }else{
    return false;
    }
  
  }
  
  public boolean isEthylBoiling(){
  
    if(this.temperature>=172){
      return true;
    }else{
    return false;
  
  }
  }
    
  public boolean isOxygenFreezing(){
  
    if(this.temperature<=(-362)){
      return true;
    }else{
    return false;
    }
  
  }
      
  public boolean isOxygenBoiling(){
  
    if(this.temperature>=(-306)){
      return true;
    }else{
    return false;
  
  }
    
    }
        
  public boolean isWaterFreezing(){
            
    if(this.temperature<=32){
      return true;
    }else{
    return false;
    }  
  
  }
          
  public boolean isWaterBoiling(){
   
    if(this.temperature>=212){
      return true;
    }else{
    return false;  
 
  }
    
     }
  
  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a temperature");
    int temp=sc.nextInt();
    
   Lab5Q3 lab1= new Lab5Q3(temp);
   
   System.out.println("Will Ethyl Alcohol freeze at "+temp+" ?");
    System.out.println(lab1.isEthylFreezing());
   
   System.out.println("Will Ethyl Alcohol boil at "+temp+" ?");
   System.out.println(lab1.isEthylBoiling());
   
   System.out.println("Will Oxygen freeze at "+temp+" ?");
   System.out.println(lab1.isOxygenFreezing());
   System.out.println("Will Oxygen boil at "+temp+" ?"); 
   System.out.println(lab1.isOxygenBoiling());
   
   System.out.println("Will Water freeze at "+temp+" ?");
   System.out.println(lab1.isWaterFreezing());
   System.out.println("Will Water boil at "+temp+" ?");
   System.out.println(lab1.isWaterBoiling());
   
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
