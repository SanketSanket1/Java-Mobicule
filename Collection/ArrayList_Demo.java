package Collection;

import java.util.*;

public class ArrayList_Demo 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l = new ArrayList<>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(1,1000);
		
		Iterator<Integer> i = l.iterator();
		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());     //iterator iterate one by one element into the list
//		}
		
//		System.out.println(l);                //return full list
		
//		for (Object l1 : l)                   //forEach loop is same for iterator which iterate one by one element into the collection
//		{
//			System.out.println(l1);
//		}
		
		l.forEach((n) ->{ System.out.println(n); });   //forEach method in iterator class is used lambda function to iterate element
		
		l.remove(1);                             //remove use for remove element for specific index
		
		System.out.println(l);
		
		if(l.contains(100))                      //contains return boolean
		{
			System.out.println("Value Present");
		}
		else
		{
			System.out.println("Not Present");
		}
		
	    System.out.println("indexOf Method "+l.indexOf(100));       //indexOf return 0 if value present otherwise return -1
	    
	    System.out.println("Get Method "+l.get(2));                 //get method use get element for specific index
	    
	    System.out.println(l);
	    
	    System.out.println(l.size());            //return size of collection
	    
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
