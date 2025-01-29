package Loops;

public class While_Loop_Demo 
{
	public static void main(String[] args) 
	{
		int i = 0;
		while(i < 10)
		{
			int j = 0;
			while(j < 10)
			{
				System.out.println(i);
				j++;
			}
			i++;
		}
	}
}
