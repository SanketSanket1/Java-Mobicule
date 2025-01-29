/*
    default method signature => public, abstract (after version 8 default, static)
                    variable => final, static, public 
 */

package Interface;

public class Interface_Demo 
{
	public static void main(String[] args) 
	{
		A1 a = new A1_impl();            //here a is a reference of class A1_impl
		a.m1();
		a.m2();
	}
}

interface A1
{
	void m1();
	void m2();
}

class A1_impl implements A1
{
	public void m1()
	{
		System.out.println("method m1");
	}
	public void m2()
	{
		System.out.println("method m2");
	}
}
