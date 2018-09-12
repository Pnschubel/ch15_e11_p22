
/**
 * Pair class to act as 'locations' to 'fill' with floodfill program
 * 
 * @Payton Schubel
 * @9-12-2018
 */
public class Pair
{
    //instance Values
    private int row; //the row number of the Pair
    private int column; //the column number of the Pair
    private int fill; //the fill number of the Pair

    /**
     * Constructor for objects of class Pair
     * @param int row -- the row number of the Pair
     * @param int column -- the column number of the Pair
     * The fill number is originally set to zero, standing for 'unfilled'
     */
    public Pair(int row, int column)
    {
        //Initializing Variables
        this.row = row;
        this.column = column;
        this.fill = 0;
    }

    /**
     * 'Fills' the Pair with the number given
     * @param fill --the number the pair is to be filled with
     * @return none
     */
    public void fill(int fill){
        this.fill = fill;
    }
}
