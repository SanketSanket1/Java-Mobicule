package Collection;

import java.util.*;

public class LinkedList_To_Stack 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list =new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println("\nLinkedList");
		System.out.println(list);
		System.out.println("Peek Element : "+list.peek());
		
		Stack<String> stack = new Stack<>();             //we cannot convert linkedlist into stack using constructor
		
		stack.addAll(list);                             //convert through addAll method
		
		System.out.println("\n\nStack");
		System.out.println(stack);
		System.out.println("Peek Element : "+stack.peek());
		
		List<String> v = new Vector<String>(list);
		System.out.println("\n\nVector");
		System.out.println(v);	
	}
}
