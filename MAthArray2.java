/**
 * Auto Generated Java Class.
 */
public class MAthArray2 {
  
  
  public static void main(String[] args) { 
    int [][] a={{1,2}, {3,4}};
   
    int [][] b={{1,2}, {3,4}};
    
    int [][] c={{0,0}, {0,0}};
    
    for(int i=0; i<a.length; i++)
    {
      for(int j=0;j<a[0].length; j++)
      {
        System.out.print(a[i][j] +"\t");
      }
      System.out.println();
    }
    
    for(int i=0; i<b.length; i++)
    {
      for(int j=0;j<b[0].length; j++)
      {
        System.out.print(b[i][j] +"\t");
      }
      System.out.println();
    }
    
    for(int i=0; i<b.length; i++)
    {
      for(int j=0;j<b[0].length; j++)
      {
       b[i][j]=a[i][j]+b[i][j];
      }
      System.out.println();
    }
    
    for(int i=0; i<c.length; i++)
    {
      for(int j=0;j<c[0].length; j++)
      {
        System.out.print(c[i][j] +"\t");
      }
      System.out.println();
    }
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
