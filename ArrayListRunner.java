import java.util.ArrayList;
/**
 * Write a description of class ArrayListRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayListRunner
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);
        
        //a
        names.add("Alice"); names.add("Bob"); names.add("Connie"); names.add("David"); 
        names.add("Edward"); names.add("Fran"); names.add("Gomez"); names.add("Harry");
        System.out.println(names);
        
        //b
        System.out.println("First: " + names.get(0) ); 
        System.out.println("Last: " + names.get( names.size() - 1 ) );
        
        //c
        System.out.println("Size: " + names.size() );
        
        //d
        System.out.println(names.get( names.size() - 1 ) + " is the last name in the list.");
        
        //e
        for( int i = 0; i < (names.size() - 1); i++)
        {
            if (names.get(i) == "Alice")
            {
                names.set(i, "Alice B. Toklas");
            }
        }
        System.out.println(names);
        
        //f
        for( int i = 0; i < (names.size() - 1); i++)
        {
            if (names.get(i) == "David")
            {
                names.add(i+1, "Doug");
            }
        }
        System.out.println(names);
        
        //g
        for(String name : names)
        {
            System.out.println(name);
        }
        
        //h
        ArrayList<String> names2 = new ArrayList<String>(names);
        
        //ArrayList(Collection<names2 extends names>);
        System.out.println(names2);
        
        //i
        names.remove(0);
        System.out.println("names1: " + names);
        System.out.println("names2: " + names2);
    }
}





