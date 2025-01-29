package Exception;

public class Exit_fun 
{
	public void sample()
	{
		try
		{
			System.out.println("in try block");
			System.exit(0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("in Finally Block");
		}
		
	}
	
	public static void main(String[] args) 
	{
		Exit_fun e = new Exit_fun();
		e.sample();
	}
}
