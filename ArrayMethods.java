
import java.util.Arrays;

/**
 * Write a description of class ArrayMethods here.
 *
 * @JAmanderico
 * @1/29/21
 */


public class ArrayMethods
{
    private int[] values;
    /**
     * Constructor for ArrayMethods Class.
     * initializes the "values" array as 
     */
    public ArrayMethods(int[] initialValues)
    {
        this.values = initialValues;
    }
    
    public void printArray()
    {
        System.out.println(Arrays.toString(this.values));
    }
    
    /**
     * 1. Swap the first and last elements in the array.
     */
    public void swapFirstAndLast()
    {
        int temp = this.values[0];
        this.values[0] = this.values[-1];
        this.values[-1] = temp;
    }
    
    /**
     * 2. Shift all elements by one to the right and move the last element into
     *      the first position. 
     *          1 4 9 16 25 --> 25 1 4 9 16
     */
    public void shiftRight()
    {
        int temp = this.values[this.values.length - 1];
        
        for ( int i = this.values.length - 1; i > 0; i--)
        {
            this.values[i] = this.values[i-1];
        }
        
        
        this.values[0] = temp;
    }
    
    /**
     * 3. Replace all even elements with 0.
     */
    public void evensAreZero()
    {
        for ( int i = 0; i < this.values.length - 1; i++ )
        {
            
        }
        /*for ( int element : this.values )
        {   
            double remainder = Math.IEEEremainder( element, 2 );
            if ( remainder == 0)
            {
                
            }
        }*/
    }
    
    public static void main( String[] args )
    {
        int[] testValues = new int[]{ 3, 5, 6, 1 /* add your own values */ };
        ArrayMethods tester = new ArrayMethods( testValues );
        tester.printArray();
        tester.swapFirstAndLast();
        tester.printArray();
        
        testValues = new int[]{ 1, 6, 3, 9, 5, 6 /* add your own values */ };
        tester = new ArrayMethods(testValues);
        tester.printArray();
        tester.shiftRight();
        tester.printArray();
        //...
    }
}
