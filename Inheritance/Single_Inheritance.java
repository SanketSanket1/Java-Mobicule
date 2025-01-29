/*
 	   class A
 	      |
 	   class B
 */

package Inheritance;

public class Single_Inheritance 
{
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.m1();
		c.call();
		c.m4();
		//Parent.m2();    static method call using class name
	}
}

class Parent
{
	public Parent() 
	{
		super();
		System.out.println("Parent Constructor");
	}
	
	public void m1()
	{
		System.out.println("m1");
	}
	
	public static void m2()
	{
		System.out.println("m2");
	}
	
	final void m3()
	{
		System.out.println("m3");
	}
	
	protected void m4()
	{
		System.out.println("m4");
	}
}

class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("Child constructor");
	}
	
	@Override
	public void m1()
	{
		super.m1();
		System.out.println("override m1");
	}
	
	public void call()
	{
		m2();
		m3();
	}
	
	@Override
	public void m4()
	{
		super.m4();
		System.out.println("override m4");
	}
}
