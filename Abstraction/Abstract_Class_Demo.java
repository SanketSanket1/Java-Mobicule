/*
	
 */

package Abstraction;

public class Abstract_Class_Demo 
{
	public static void main(String[] args) 
	{
		Chair c = new Chair(78,50, 30, 4);
		c.getLength();
		c.getBreadth();
		c.getHeight();
		c.getNol();
		
		BookShelf b = new BookShelf(150, 120, 92);
		b.getLength();
		b.getBreadth();
		b.getHeight();
	}
}

abstract class Furniture
{
	int l,b,h;
	
	Furniture(int l,int b,int h)
	{
		this.l = l;
		this.b = b;
		this.h = h;
	}
	
	abstract void getLength();
	abstract void getBreadth();
	abstract void getHeight();
}

class Chair extends Furniture
{
	int no_of_leg;
	
	Chair(int l,int b,int h,int nol) 
	{
		super(l,b,h);
		this.no_of_leg = nol;
		System.out.println("\n****Chair Data****\n");
	}
	
	public void getLength() 
	{
		System.out.println("Length = "+l);
	}
	public void getBreadth()
	{
		System.out.println("Breadth = "+b);
	}
	public void getHeight()
	{
		System.out.println("Height = "+h);
	}
	public void getNol()
	{
		System.out.println("No of Legs = "+no_of_leg);
	}
}

class BookShelf extends Furniture
{
	
	BookShelf(int l,int b,int h) 
	{
		super(l,b,h);
		System.out.println("\n****BookShelf Data****\n");
	}
	
	public void getLength() 
	{
		System.out.println("Length = "+l);
	}
	public void getBreadth()
	{
		System.out.println("Breadth = "+b);
	}
	public void getHeight()
	{
		System.out.println("Height = "+h);
	}
}

//abstract class Sample extends Furniture
//{
//	Sample(int l,int b,int h)
//	{
//		super(l,b,h);
//	}
//	abstract void getLength();
//	abstract void getBreadth();
//	abstract void getHeight();
//}
