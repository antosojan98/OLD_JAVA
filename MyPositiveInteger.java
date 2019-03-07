/**
 * Auto Generated Java Class.
 */
public class MyPositiveInteger {
 protected int value;
  
  public MyPositiveInteger(int a) { 
    
    if(value>=0)
      this.value=a;
  }
  /* ADD YOUR CODE HERE */
  
  public int getValue(){
  return value;
  }
  
  public boolean isEven(){
  if((value%2)==0)
    return true;
  return false;
  }
  
   public boolean isOdd(){
  if((value%2)!=0)
    return true;
  return false;
  }
   
   public boolean isPrime(){
   for(int i=2;i<value;i++) {
        if(value%i==0)
            return false;
    }
    return true;
  }
   
   public boolean equals(int c){
   if(value==c)
     return true;
   return false;
   }
   public boolean equals(Object other){
     if(other==null)
       return false;
     MyPositiveInteger m=(MyPositiveInteger)other;
   if(this.value==m.getValue())
     return true;
   return false;
      }
   
   
   public int parseInt(char[] x){
  int result=0;
    for(int y=0;y<x.length ;y++){
        result=result*10+(x[y]-'0');
    }
    return result;
     }
   
   public int parseInt(String str){
   int z = Integer.parseInt(str);
   return z;
   }
}
