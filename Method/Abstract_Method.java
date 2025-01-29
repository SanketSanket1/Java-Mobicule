package Method;

public class Abstract_Method 
{
	public static void main(String[] args) 
	{
		Cat c = new Cat();
		c.walk();
	}
}

abstract class Animal
{
	abstract void walk();
	public void eat()
	{
		System.out.println("Animals eat");
	}
}

class Cat extends Animal
{
	public void walk()
	{
		super.eat();
		System.out.println("Cat walk using legs");
	}
}
