package Control_Statement;

public class If_Else_Demo 
{
	public void check_Number(int num)
	{
		if(num >= 0)
		{
			if(num == 0)
			{
				System.out.println("Number is Zero");
			}
			else
			{
				System.out.println("Number is Positive");
			}
		}
		else
		{
			System.out.println("Number is Negative");
		}
	}
	
	public static void main(String[] args) 
	{
		If_Else_Demo i = new If_Else_Demo();
		i.check_Number(21);
	}
}
