package Exception;

public class Throw_Throws_Demo 
{
	public void isValid(int age)throws Exception
	{
		if(age < 18)
		{
			throw new Exception("Age is less than 18");
			
			//System.out.println("After throwing Exception");
		}
		else
		{
			System.out.println("valid");
		}
	}
	
	public static void main(String[] args) 
	{
		try{
			new Throw_Throws_Demo().isValid(2);
			
			System.out.println("After Exception");
			
			try
			{
				int sum = 100/0;
				
				System.out.println("Sum = "+sum);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Change Denominator(non zero)");
			}
			
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			e1.printStackTrace();
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
}
