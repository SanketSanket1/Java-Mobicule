package Abstraction;

public class Fifty_Per_Abs 
{
	public static void main(String[] args) 
	{
		Child_Impl c = new Child_Impl();
		c.greet();
		c.display();
	}
}

abstract class Parent_Abstract
{
	abstract public void greet();            //Fifty percent abstraction means some methods are abstract and some are concrete in abstract class
	
	protected void display()
	{
		System.out.println("this is parent class method");
	}
}

class Child_Impl extends Parent_Abstract
{
	public void greet()
	{
		System.out.println("Hii!!! Good Morning");
	}
}
