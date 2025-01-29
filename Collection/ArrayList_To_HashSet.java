package Collection;

import java.util.*;

public class ArrayList_To_HashSet 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("D");
		
		System.out.println("\nArrayList :");
		System.out.println(list);
		
		Set<String> set = new HashSet<>(list);
		
//		set.addAll(list);
		
		System.out.println("\n\nHashSet :");
		System.out.println(set);
	}
}
