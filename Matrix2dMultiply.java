/**
 * Auto Generated Java Class.
 */
public class Matrix2dMultiply {
  
  public static void display(int x[][]) {
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + "\t");
            }
            System.out.println();
        }

    
  }
  public static void main(String[] args) { 
     int firstarray[][] = {{1, 2, -2, 0}, {-3, 4, 7, 2}, {6, 0, 3, 1}};
        int secondarray[][] = {{-1, 3}, {0, 9}, {1, -11}, {4, -5}};

        System.out.println("This is the first array");
        display(firstarray);

        System.out.println("This is the second array");
        display(secondarray);
    }

    
  
  /* ADD YOUR CODE HERE */
  
}
