package Collection;

import java.util.*;

public class LinkedList_Demo 
{
	public static void main(String[] args) 
	{
		LinkedList<String> l = new LinkedList<>();
		
		l.add("A");    //Index-based methods (add, get) traverse nodes sequentially until the desired position is reached.
		l.add("B");
		l.add("C");
		l.add("D");
		l.add(1,"E");
		
//		System.out.println(l);
		
		l.forEach((n)->{System.out.println(n);});
		
l.remove(1);                             //remove use for remove element for specific index
		
		System.out.println(l);
		
		if(l.contains("A"))                      //contains return boolean
		{
			System.out.println("Value Present");
		}
		else
		{
			System.out.println("Not Present");
		}
		
	    System.out.println("indexOf Method "+l.indexOf("C"));       //indexOf return 0 if value present otherwise return -1
	    
	    System.out.println("Get Method "+l.get(2));                 //get method use get element for specific index
	    
	    System.out.println(l);
	    
	    System.out.println(l.peek());
	    
	    l.clear(); 								 //clear method remove all element from collection
	    
	    if(l.isEmpty())
	    {
	    	System.out.println("ArrayList is Empty");
	    }
	    else
	    {
	    	System.out.println("ArrayList is not Empty");
	    }
	}
}
