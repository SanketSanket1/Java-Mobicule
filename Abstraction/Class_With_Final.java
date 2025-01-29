package Abstraction;

public class Class_With_Final 
{
	public static void main(String[] args) 
	{
		impl i = new impl();
		i.sleep();
		Abs.eat();
		i.walk();
		i.laugh();
		i.sing();
	}
}

abstract class Abs
{
	final void sleep()                          //do not override
	{
		System.out.println("Sleeping...");
	}
	
	static void eat()                           //do not override
	{
		System.out.println("Eating...");
	}
	
	abstract void walk();                        //override
	
	private void speak()                         //do not override and also do not accessible outside class
	{
		System.out.println("Speaking...");
	}
	
	protected void laugh()                       //override
	{
		System.out.println("Laughing...");
	}
	
	void sing()                                  //override
	{
		System.out.println("Singing...");
	}
}

class impl extends Abs
{
	public void walk()
	{
		System.out.println("Walking...");
	}
}
