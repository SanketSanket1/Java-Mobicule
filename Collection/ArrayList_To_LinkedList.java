package Collection;

import java.util.*;

public class ArrayList_To_LinkedList 
{
	static List<Integer> i = new LinkedList<>();
	
	public static void main(String[] args) 
	{	
		i.add(111);
		i.add(222);
		i.add(333);
		i.add(444);
		
		System.out.println("This is ArrayList");
		
		System.out.println(i);
		
		List<Integer> j = new LinkedList<>(i);             //convert thought constructor
		
		System.out.println("\nThis is LinkedList");
		System.out.println(j);
	}
}
