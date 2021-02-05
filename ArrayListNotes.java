import java.util.ArrayList;

/**
 * Write a description of class ArrayListNotes here.
 *
 * @jamanderico
 * @2/5/21 
 */

public class ArrayListNotes
{
    public static void main(String[] args)
    {
        
        /* ArrayList<String> names;
         * The ArrayList is a Java Generic.
         * 
         * We have to specify the type of the elements in the list in angle brackets.
         * No primitives: they are not objects. Can be used if a Wrapper is used.
         *         boolean , byte , char , short , int , long , float and double
         *    Wrapper examples: Integer, Double, Boolean, etc.
         * 
         * toString() returns: [element 1, element 2, ... element n]
         */
        
        ArrayList<Integer> myList;
        myList = createRandomIntegerList(10,20);
        System.out.println(myList);
        removeEvens(myList);
        System.out.println(myList);
        System.out.println(sumList(myList));
    }
    
    /**
     * Creates & returns a reference to an ArrayList of the specified number of 
     *      integer elements where each element is assigned a random value 
     *      between 1 and range.
     *      
     * @param size      the number of Integer elements to add to the list
     * @param range     the range of random values to assign to each element 
     *                      [1, range]
     *                      
     * @return a reference to the newly created and initialized list                     
     */
    public static ArrayList<Integer> createRandomIntegerList(int size, int range)
    {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
            // a list initialized with an unspecified capacity is initialized to 10
        for(int i = 0; i < size; i++)
        {
            int value = (int)(Math.random() * range) + 1;
            
            /*
             * The add method adds the specified object to the thend of the list.
             * 
             * Autoboxing:
             *      Primitive values are automatically converted to their 
             *          corresponding wrapper class. However, type promotion does
             *          not occur.
             */
            
            list.add(value);
        }
        
        return list;
        
    }
    
    /**
     * Removes all even numbers from the specified list.
     * 
     * @param list      the list of numbers to potentially remove
     */
    public static void removeEvens(ArrayList<Integer> list)
    {
        
        /*
         * The size method returns the number of elements in the list.
         */
        
        //int size = list.size();
                            // query the size after it changes
        for ( int i = 0; i < list.size(); i++)
        {
            /*
             * The get method returns the value of the elements at the specified 
             *      index.
             */
            
            int value = list.get(i);
            
            if(value % 2 == 0)
            {
                
                /*
                 * The remove method deletes the element at the specified index
                 *      from the list. All subsequent elements are "shifted left."
                 */
                list.remove(i);
                i--;    // 
                
            }
        }
        
    }
    public static void removeEvensAlt(ArrayList<Integer> list)
    {
        for(int i = list.size() - 1; i <= 0; i--)
        {
            if(list.get(i) % 2 == 0)
            {
                list.remove(i);
            }
        }
    }
    
    
    public static int sumList(ArrayList<Integer> list)
    {
    
        int sum = 0;
        
        for(int value : list)
        {
            sum += value;
        }
        
        return sum;
        
    }
}






