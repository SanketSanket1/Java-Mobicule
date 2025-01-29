package Classes;

public class Abstract_Class
{
	public static void main(String[] args) 
	{
		Demo_impl d = new Demo_impl();
		d.test();
	}
}

class Demo                                  //This is a abstract class
{
	//abstract void test();                            //This is abstract method
	public void msg()
	{
		System.out.println("Inside msg method");
	}
	public String msg(String s)
	{
		return s;
	}
}

class Demo_impl extends Demo
{
	public void test()
	{
		msg();
		msg("Mobicule");
		System.out.println("Test Completed");
	}
}
