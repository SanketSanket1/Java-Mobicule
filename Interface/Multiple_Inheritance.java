package Interface;

public class Multiple_Inheritance 
{
	public static void main(String[] args) 
	{
		Inter_Impl i = new Inter_Impl();
		i.m1();
		i.m2();
		
	}
}

interface One1
{
	int a = 12;
	void m1();
}

interface Two
{
	int b = 43;
	void m2();
}

class Inter_Impl implements One1,Two
{
	public void m1()
	{
		System.out.println("value of A : "+a);
		System.out.println("Method 1");
	}
	
	public void m2()
	{
		System.out.println("Value of B : "+b);
		System.out.println("Method 2");
	}
}