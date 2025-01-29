package Method;

public class Final_Method 
{
	final public void display()
	{
		System.out.println("This is Final Method it cannot override in its child class");
	}
	
	public static void main(String[] args) 
	{
		Final_Impl f = new Final_Impl();
		f.display();
		f.msg();
		;
	}
}

class Final_Impl extends Final_Method
{
//	public void display()
//	{
//		      this method cannot override because this is final method in its parent class
//	}
	
	public void msg()
	{
		
	}
}
