/**
 * Auto Generated Java Class.
 */
public class Microwave {
  protected int start;
  protected int inc=0;
  protected int powerlevel;
  protected int reset=0;
  
  public void power(){
  if(powerlevel==1)
    powerlevel=2;
  else
    powerlevel=1;
  }
  
  public void increment(){
  inc=inc+30;
  }
  
  public void reset(){
  increase=reset;
  }
  
  public void prog(){
  System.out.println("Cooking for "+inc+" Seconds at level "+powerlevel+);
  }
  public static void main(String[] args) { 
    Microwave m=new Microwave();
    m.power();
    m.increment();
    
    m.prog();
  }
  
  /* ADD YOUR CODE HERE */
  
}
