/*
 		class A
 		   |
 		class B
 		   |
 		class C    
 */

package Inheritance;

public class Multi_Level_Inheritance 
{
	public static void main(String[] args) 
	{
		Child1 c = new Child1();
		c.p1();
		c.gp1();
		c.gp2();
		c.gp3();
	}
}

class GrandParent
{
	public void gp1()
	{
		System.out.println("gp1");
	}
	
	static void gp2()
	{
		System.out.println("gp2");
	}
	
	final void gp3()
	{
		System.out.println("gp3");
	}
}

class Parent1 extends GrandParent
{
	protected Parent1()
	{
		super();
		System.out.println("Parent constructor");
	}
	
	public static void p1()
	{
		System.out.println("p1");
	}
	
}

class Child1 extends Parent1
{	
	Child1()
	{
		super();
		System.out.println("Child Constructor");
	}
	public void c1()
	{
		System.out.println("c1");
		gp1();
	}
}
