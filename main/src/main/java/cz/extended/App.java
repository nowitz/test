package cz.extended;

import cz.extended.model.Child;
import cz.extended.model.People;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	People a = new People();
    	a.setAge(5);
    	a.setName("honza");
    	
    	Child b = new Child();
    	b.setName("kuba");
    	b.setAge(12);
    	b.setSport("letec");
    	
        System.out.println( a.toString() );
        System.out.println( b.toString() );
        a.addAge();
        b.addAge();
        System.out.println( a.toString() );
        System.out.println( b.toString() );

        System.out.println("honza");

    }
}
