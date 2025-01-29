/*
 	break keyword use only in loops and switch cases 
 */


package Keyword;

public class Break_Keyword 
{
	public void useBreak()
	{
		for(int i = 0 ; i < 100 ; i += 10)
		{
			if(i == 60)
			{
				break;
			}
			else
			{
				System.out.println(i);
			}
		}
	}
	
	public void switch_Break(int n)
	{
		switch (n) 
		{
			case 1:
				System.out.println("Case 1");
				break;
			case 2:
				System.out.println("Case 2");
				break;
			case 3:
				System.out.println("Case 3");
				break;	
			default:
				System.out.println("This is Default Case");
		}
	}
	
	public static void main(String[] args) 
	{
		Break_Keyword b = new Break_Keyword();
		b.useBreak();
		b.switch_Break(2);
	}
}
