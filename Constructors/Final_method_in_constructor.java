package Constructors;

public class Final_method_in_constructor 
{
	final String name = "Mobicule";
	public Final_method_in_constructor(String name) 
	{
		System.out.println("hii " + name);
		getData();
	}
	
	public final void getData()
	{
		System.out.println("your compuny name is = " + name);
	}
	
	public static void main(String[] args) 	
	{
		Final_method_in_constructor f = new Final_method_in_constructor("Sanket");
		
	}
}
