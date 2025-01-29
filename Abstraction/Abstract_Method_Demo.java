package Abstraction;

public class Abstract_Method_Demo 
{
	public static void main(String[] args) 
	{
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
	}
}

abstract class A
{
	abstract void m1();
	public void m2()
	{
		System.out.println("in m2");
	}
}

class B extends A
{
	public void m1()
	{
		System.out.println("in m1");
	}
	public void m3()
	{
		System.out.println("in m3");
	}
}

