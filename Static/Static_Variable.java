package Static;

public class Static_Variable 
{
	static int var1 = 15,var2 = 58;
	int res;
	
	public void add()
	{
		res = var1 + var2;
	}
	
	static int ans()
	{
		return new Static_Variable().res;         //if we want to perform operation on non static variable in static method it need to create object and then call variable
	}
	
	public static void main(String[] args) 
	{
		Static_Variable s = new Static_Variable();
		s.add();
		System.out.println(s.ans());
		
	}
}
