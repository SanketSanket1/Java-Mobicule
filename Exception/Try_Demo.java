/*
  in multiple catch block parent class exception is always declare at last
 */


package Exception;

public class Try_Demo 
{ 
	public void op(int num)
	{
		int ans = 0;
		try
		{
			try
			{
				System.out.println("Hello");
				ans = num / 0;
				System.out.println("demo");         //if exception occure before this statement then this statement will not execute
			}
			catch(NullPointerException e)
			{
				e.printStackTrace();
			}
			catch(RuntimeException e)
			{
				System.out.println("Denominator is Zero Please Change it"+e);
			}
		
			
			
			System.out.println("After Exeption");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This is Finally Block");
		}
	}

	public static void main(String[] args) 
	{
		new Try_Demo().op(12);
	}
}
