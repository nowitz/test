package cz.extended;

import cz.extended.model.Child;
import cz.extended.model.People;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

        List<People> list = Arrays.asList(a,b);
        list.forEach(people -> System.out.println(people.toString()));
        List<Child> listChild = list.stream().filter(people -> people instanceof Child).map(people -> (Child)people).collect(Collectors.toList());
        System.out.println(listChild.size());


        System.out.println("MASTER");
    }
}
