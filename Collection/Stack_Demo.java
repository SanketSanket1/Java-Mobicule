package Collection;

import java.util.*;

public class Stack_Demo 
{
	public static void main(String[] args) 
	{
		Stack<String> l = new Stack<>();         //Stack have only default constructor beacause it inherit from vector class
		
		l.add("ABC");
		l.addElement("PQR");
		l.addElement("XYZ");
		l.add("Mobicule");
		
		System.out.println(l);
		
		System.out.println(l.capacity());   //initial capacity of stack is 10 and if size exceed then capacity increase by 10
		
		System.out.println(l.size());       //return the size of stack
		
		System.out.println(l.peek());
		
		l.remove(2);
		
		l.forEach((n) ->{  
			System.out.println(n);
		});
	}
}
