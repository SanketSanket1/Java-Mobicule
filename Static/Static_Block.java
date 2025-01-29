package Static;

public class Static_Block 
{
	static int count = 0 ;
	static
	{
		System.out.println("3");
	}
	static
	{
		count+=10;
		System.out.println("1");
	}
	
	static
	{
		System.out.println("2");
	}
	
	public static void main(String[] args) 
	{
		System.out.println(Static_Block.count);
	}
}
