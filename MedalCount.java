
/**
 * Write a description of class MedalCount here.
 *
 * @JAmanderico
 * @1/29/21
 */
public class MedalCount
{
    final int COUNTRIES = 7;
    final int MEDALS = 3;
    
    private int[][] counts = new int[][]
        {
        //  {bronze, silver, gold}
            {     1,      0,    1},
            { 1, 1, 0},
            { 0, 1, 0},
            { 1, 1, 0},
            { 0, 1, 1},
            { 0, 0, 0},
            { 1, 1, 1}
        };
        
    public MedalCount()
    {
        /*
         * Alternate way to create a 2D array. The initialization would be followed by
         *      nested loops to initialize each element.
         */
        // this.counts = new int[COUNTRIES][MEDALS];
        // for ...
    }
    
    public void printTable()
    {
        //good: for( int row = 0; row < COUNTRIES; row++)
        for( int row = 0; row < this.counts.length; row++)
        {
            // good: for(int col = 0; col < MEDALS; col++)
            // better 
            for( int col = 0; col < this.counts[row].length; col++)
            {
                
                System.out.print( this.counts[row][col] + "\t" );
                
            }
            System.out.println();
        }
    }
    
    public int sumMedalsForCountry(int countryIndex)
    {
        int sum = 0;
        
        for ( int col = 0; col < this.counts[countryIndex].length; col++)
        {
            sum += this.counts[countryIndex][col];
        }
        
        return sum;
    }

    public int sumMedalsForType(int medalIndex)
    {
        int sum = 0;
        
        for( int row = 0; row < this.counts.length; row++)
        {
            sum += this.counts[row][medalIndex];
        }
        
        return sum;
    }
    
}












