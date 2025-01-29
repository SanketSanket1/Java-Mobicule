package Static;

public class Static_Method_Demo 
{
	int a = 10;
	public static void m1()
	{
		System.out.println("m1");
//		System.out.println(a);           //cannot access non static variables or methods in static method 
 	}
	
	public static void main(String[] args) 
	{
		Static_Method_Demo.m1();
	}
}
