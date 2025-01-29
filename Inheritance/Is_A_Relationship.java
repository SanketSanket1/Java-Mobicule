package Inheritance;

abstract public class Is_A_Relationship 
{
	public static void main(String[] args) 
	{
		Mobile m = new Mobile();
		m.name();
	}
}

abstract class Electronics
{
	abstract public void name();
}

class Mobile extends Electronics                           //is-a relationship
{
	public void name()
	{
		System.out.println("Vivo s1 pro");
	}
}
