/*
 	Private constructor is used to prevent instantiation of class
 	private constructors are use in utility class or helper class 
 	It does not allow a class to be sub-classed.
	It does not allow to create an object outside the class.
	If a class has a private constructor and when we try to extend the class, a compile-time error occurs.
	We cannot access a private constructor from any other class.
	If all the constant methods are there in our class, we can use a private constructor.
	If all the methods are static then we can use a private constructor.
	We can use a public function to call the private constructor if an object is not initialized.
	We can return only the instance of that object if an object is already initialized.
 */

package Constructors;

public class Private_Constructor 
{
	private Private_Constructor()
	{
		System.out.println("constructor");
	}
	
	public static void main(String[] args) 
	{
		Private_Constructor p = new Private_Constructor();
		//Sample s = new Sample();             it is not allowed because constructor of Sample class is private
		
		Sample s = Sample.getInstace();
	}
}

class Sample
{
	private Sample()
	{
		System.out.println("sample constructor");
	}
	
	public static Sample getInstace()
	{
		return new Sample();
	}
}