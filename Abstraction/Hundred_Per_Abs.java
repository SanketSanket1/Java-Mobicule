package Abstraction;

public class Hundred_Per_Abs 
{
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.method1();
		c.method2();
	}
}

abstract class Parent                  //in 100% abstraction all methods for abstract class are abstract
{                                      //100% abstraction also achieve through interfaces
	abstract void method1();
	abstract void method2();
}

class Child extends Parent
{
	public void method1()
	{
		System.out.println("Method 1");
	}
	public void method2()
	{
		System.out.println("Method 2");
	}
}
