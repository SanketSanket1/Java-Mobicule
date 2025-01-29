/*
 	Vectors are legacy classes in java it it is Thread safe by default
 	it is similar like to ArrayList but ArrayList do not thread safe but vactor is thread safe
 	and vectors are slow as compair to ArrayList
 */


package Collection;

import java.util.*;

public class Vector_Demo 
{
	public static void main(String[] args) 
	{
		Vector<Integer> l = new Vector<>();
		
		l.add(101);							  //add method is for List interface for collection
		l.addElement(102);                    //addElement method is legacy method for vector class
		l.add(103);
		l.add(104);
		
		System.out.println(l);
		
		System.out.println(l.contains(102));
		
		System.out.println(l.size());
		
		System.out.println(l.remove(2));
		
		System.out.println(l);
		
		System.out.println(l.indexOf(102));
		
		l.clear();
				
		if(l.isEmpty())
		{
			System.out.println("Vector is Empty");
		}
		else
		{
			System.out.println("Vector is not Empty");
		}
		
	}
}
