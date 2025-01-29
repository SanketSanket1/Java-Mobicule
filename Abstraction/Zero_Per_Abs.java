/*
 	in abstract class containing methods all are concrete therefore we can say only zero percent
    abstraction done over here
 */

package Abstraction;

abstract class Zero_Per_Abs 
{
	protected void display()
	{
		System.out.println("this is parent class method");
	}
	
	public void greet()
	{
		System.out.println("Hello!! Good Afternoon");
	}
	
	public static void main(String[] args) 
	{
		Imp_Abstract i = new Imp_Abstract();
		i.greet();
		i.display();
	}
}

class Imp_Abstract extends Zero_Per_Abs
{
	public void display()
	{
		super.display();
		System.out.println("this is child class method");
	}
}
