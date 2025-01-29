/*
 1 - it also called runtime polymorphism
 2 - make sure method in super class is not private because access for private method is only on class therefore it is not visible in subclass
 3 - final method does not override in subclass.  
*/

package MethodOverriding_OverLoading;

public class MethodOverRiding 
{
	
	public static void main(String[] args) 
	{
		Tiger t = new Tiger();
		t.eat();
	}
}

class Animal
{
	public void eat()
	{
		System.out.println("Eat");
	}
}

class Tiger extends Animal
{
	public void eat()                  //override eat method over here
	{
		super.eat();
		System.out.println("Tiger eat meat");
	}
}
