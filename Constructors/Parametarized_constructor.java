package Constructors;

public class Parametarized_constructor 
{
	int a;
	
	public Parametarized_constructor(int a) 
	{
		this.a = a;
		getData();
	}
	
	public void getData()
	{
		System.out.println("Value of a = " + a);
	}
	
	public static void main(String[] args) 
	{
		Parametarized_constructor p = new Parametarized_constructor(100);
		
	}
}
