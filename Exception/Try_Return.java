package Exception;

public class Try_Return 
{
	public int isReturn()
	{
		try
		{
			System.out.println("Before Return");
			return 1;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return 2;
		}
		finally
		{
			System.out.println("in Finally Block");
			return 3;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println(new Try_Return().isReturn());
	}
}
