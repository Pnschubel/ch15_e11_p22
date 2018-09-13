import java.util.Stack;

/**
 * Grid Class to be filled with pairs for floodfill program
 * 
 * @author Payton Schubel
 * @version 9/13/2018
 */
public class Grid
{
   private static final int SIZE = 10;
   int[][] grid = new int[SIZE][SIZE];
   Stack<Pair> filledSquares= new Stack<>(); //Stack to be filled with coordinates on grid
   
   /**
    * Fills all of the squares on the grid starting with the given row, column pair
   */
   public void fillSquare(int row, int column, int fill)
   {
      Pair coordinates = new Pair(row, column) //Creates the pair
      
      //Sees if the coordinate pair is filled by seeing if it is in the Stack
      if (filledSquares.contains(coordinates)){
        }
   }

   /**
    * Prints the grid in a readable manner
    * @return string -- the printable string
    */
   @Override
   public String toString()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%4d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }
}
