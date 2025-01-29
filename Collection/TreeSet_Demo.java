/*
 	TreeSet sort the element
 	TreeSet don't allow null value because null not sort
 	TreeSet is slower than LinkedHashSet and HashSet
 	don't allow duplicate 
 */

package Collection;

import java.util.*;

public class TreeSet_Demo 
{
	public static void main(String[] args) 
	{
		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(23);
		set.add(87);
		set.add(34);
		set.add(20);
		set.add(87);
		//set.add(null);
		
		System.out.println(set);
		
		System.out.println(set.contains(20));
		
		System.out.println(set.remove(20));
		
		System.out.println(set);
		
		set.clear();
		
		if(set.isEmpty())
		{
			System.out.println("Set is Empty");
		}
		else
		{
			System.out.println("Set is not Empty");
		}
	}
}
