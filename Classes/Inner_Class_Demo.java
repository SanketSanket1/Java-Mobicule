/*
   1 - Inner Class can access private member for Outer Class
   2 - also we can give static keyword to inner class not outer class 
 */

package Classes;

public class Inner_Class_Demo 
{	
	public static void main(String[] args) 
	{
		OuterClass o = new OuterClass();
		OuterClass.InnerClass i = o.new InnerClass();
		i.getName();
		i.getData();
	}
}

class OuterClass
{
	public static int a = 10;                    //static variable
	private String name = "Sanket";	
	class InnerClass
	{
		public void getData()                    // inner class also acess static variable of outerclass
		{
			System.out.println("Value of a = "+a);
		}
		
		public void getName()
		{
			System.out.println("My Name is : "+name);
		}
	}
}
