/*
     1 - Risk for data loss
     2 - use for converting large data type to smaller data type by programer using casting operator 
 	 3 - e.g convert double to int
 	 double a; 
 	 int res = int(a);      //here convert data from double to int
 */



package TypeCasting;

public class ExplicitTypeCasting 
{
	public int sum(int a, int b)
	{
		int res = a + b;
		return res;
	}
	
	public int sum(double a, double b)
	{
		int res = (int)a + (int)b;
		return res;
	}
	
	public int sum(short a, short b)
	{
		int res = (int)a + (int)b;
		return res;
	}
	
	public float sum(float a, float b)
	{
		float res = a + b;
		return res;
	}
	
	
	
	public static void main(String[] args) 
	{
		byte a = 100,b = 50;
		
		ExplicitTypeCasting i = new ExplicitTypeCasting();
		System.out.println(i.sum((double)a, (double)b));
		
		System.out.println(i.sum((int)a, (int)b));
		
		System.out.println(i.sum((short)a, (short)b));
		
		System.out.println(i.sum((float)a, (float)b));
	}
}
