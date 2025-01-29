/*
 	LinkedHashSet maintain insertion order
 	LinkedHashSet allow only one null value
 	LinkedHashSet is slightly slow than  and HashSet
 	don't allow duplicate 
 */

package Collection;

import java.util.*;

public class LinkedHashSet_Demo 
{
	public static void main(String[] args) 
	{
		Set<Integer> set = new LinkedHashSet<>();
		
		set.add(23);
		set.add(87);
		set.add(34);
		set.add(20);
		set.add(87);
		
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
