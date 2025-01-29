/*   Heirarchical Inheritance
 	              class A
 	                 |
 	        -------------------
 	        |                 |
 	    class B            class C         
 */

package Inheritance;

public class Heirarchical_Inheritance 
{
	public static void main(String[] args) 
	{
		Kawasaki_Ninja k = new Kawasaki_Ninja();
		k.start();
		k.vehical_Details();
		
		Toyota_GR_Supra t = new Toyota_GR_Supra();
		t.start();
		t.vehical_Details();
	}
}

abstract class Vehical
{
	String engin;
	int no_of_tyre;
	
	abstract void start();
	abstract void vehical_Details();
}

class Kawasaki_Ninja extends Vehical
{
	public Kawasaki_Ninja() 
	{
		System.out.println("\n***Kawasaki_Ninja***");
	}
	public void start()
	{
		System.out.println("Start through key");
	}
	public void vehical_Details()
	{
		System.out.println("no of Tyre of this vahical is : 2\nengin hose power is : 38.90HP");
	}
}

class Toyota_GR_Supra extends Vehical
{
	public Toyota_GR_Supra() 
	{
		System.out.println("\n\n***Toyota_GR_Supra***");
	}
	public void start()
	{
		System.out.println("Start through button");
	}
	public void vehical_Details()
	{
		System.out.println("no of Tyre of this vahical is : 4\nengin hose power is : 332HP");
	}
}
