// Implements a 2-D array of characters

public class CharMatrix
{
    // Instance variables:
    
    private int up;
    private int over;
    private char item;
    private char matrix[][];
    
    // Constructor: creates a grid with dimensions rows, cols,
    // and fills it with spaces
    public CharMatrix(int rows, int cols)
    {
        this.up = rows;
        this.over = cols;
        this.matrix = new char[this.up ][this.over];
        for (int i = 0; i < this.up; i++)
        {
            for ( int q = 1; q < this.over; q++)
            {
                matrix[i][q] = ' ';
            }
        }
        /*
        for ( char element[] : matrix )
        {
            System.out.print(element + " ");
        }*/
    }
    
    // Constructor: creates a grid with dimensions rows , cols ,
    // and fills it with the fill  character
    public CharMatrix(int rows, int cols, char fill)
    {
        this.up = rows;
        this.over = cols;
        this.item = fill;
        
        
        this.matrix = new char[this.up ][this.over];
        for (int i = 0; i < this.up; i++)
        {
            for ( int q = 1; q < this.over; q++)
            {
                matrix[i][q] = this.item;
            }
        }
        
        for ( char element[] : matrix )
        {
            System.out.print(element + " ");
        }
    }
    
    // Returns the number of rows in grid
    public int numRows()
    {
        return 0;
    }
    
    // Returns the number of columns in grid
    public int numCols()
    {
        return 0;
    }
    
    // Returns the character at row, col location
    public char charAt(int row, int col)
    {
        return 0;
    }
    
    // Sets the character at row, col location to ch
    public void setCharAt(int row, int col, char ch)
    {
        
    }
    
    // Returns true if the character at row, col is a space,
    // false otherwise
    public boolean isEmpty(int row, int col)
    {
        return true;
    }
    
    // Fills the given rectangle with fill  characters.
    // row0, col0 is the upper left corner and row1, col1 is the
    // lower right corner of the rectangle.
    public void fillRect(int row0, int col0, int row1, int col1, char fill)
    {
        
    }
    
    // Fills the given rectangle with SPACE characters.
    // row0, col0 is the upper left corner and row1, col1 is the
    // lower right corner of the rectangle.
    public void clearRect(int row0, int col0, int row1, int col1)
    {
        
    }
    
    // Returns the count of all non-space characters in row 
    public int countInRow(int row)
    {
        return 0;
    }
    
    // Returns the count of all non-space characters in col 
    public int countInCol(int col)
    {
        return 0;
    }
}








