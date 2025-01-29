package Inheritance;

public class Has_A_Relationship 
{
	public static void main(String[] args) 
	{
		Child2 c = new Child2();
		c.show();
	}
}

class Parent2
{
	public void msg()
	{
		System.out.println("Parent");
	}
}

class Child2
{
	public void show()
	{
		Parent2 p1 = new Parent2();           //has-a relationship
		p1.msg();
	}
}
