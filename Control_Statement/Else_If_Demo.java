package Control_Statement;

public class Else_If_Demo 
{
	public void impl(int num)
	{
		System.out.println("1");
		
		if(num <= 0)
		{
			System.out.println("Negative or Zero");
		}
		else if(num % 2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
	
	public static void main(String[] args) 
	{
		Else_If_Demo e = new Else_If_Demo();
		e.impl(2);
	}
}
