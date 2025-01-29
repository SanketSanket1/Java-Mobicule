package Classes;

public class Local_Inner_Class 
{
	public static void main(String[] args) 
	{
		OuterClass_Demo o = new OuterClass_Demo();
		o.sample();
	}
}

class OuterClass_Demo
{
	String name = "Sanket";
	public void sample()
	{
		
		class Local_Inner_Class
		{
			public void acess_Method_data()
			{
				System.out.println("Name is : "+name);
			}
		}
		Local_Inner_Class li = new Local_Inner_Class();
		li.acess_Method_data();
	}
}
