/*
  1 - static inner class access only static member variable of outer class
  2 - cannot access private,public,default,protected member of outer class
  3 - non static inner class cannot contain static methods only static inner class contain static method
 */

package Classes;

public class Static_Inner_Class 
{
	public static void main(String[] args) 
	{
		Outer_Class.InnerClass i = new Outer_Class.InnerClass();
		i.getData();
	}
}

class Outer_Class
{
	private static int num = 100;
	
	static class InnerClass
	{
		public void getData()
		{
			System.out.println("Value of Num = "+num);
		}
	}
}
