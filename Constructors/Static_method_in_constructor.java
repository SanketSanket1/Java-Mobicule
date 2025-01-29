package Constructors;

public class Static_method_in_constructor 
{
	public Static_method_in_constructor() 
	{
		m1();
	}
	
	public static void m1()
	{
		System.out.println("m1");
	}
	
	public static void main(String[] args) 
	{
		Static_method_in_constructor s = new Static_method_in_constructor();
	}
}
