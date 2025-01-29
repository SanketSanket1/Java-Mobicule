package Static;

public class Static_Inner_Class 
{
	public static void main(String[] args) 
	{
		
		OuterClass.InnerClass.display();
		OuterClass.InnerClass o = new OuterClass.InnerClass();
		o.diaply2();
		new OuterClass().display();
	}
}

class OuterClass
{
	int a = 10;
	static int b = 20;
	
	public void display()
	{
		System.out.println("outer display");
	}
	
	static class InnerClass
	{
		static public void display()
		{
			System.out.println(new OuterClass().a);
			System.out.println(b);
		}
		public void diaply2()
		{
			System.out.println(b+10);
		}
	}
}
