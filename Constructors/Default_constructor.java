/*
 	1 - Static variables and methods are allowed in constructors and can be accessed or called.
    2 - Final variables can be initialized in constructors, but their values cannot be changed once set.
    3 - Abstract methods cannot be used in constructors, but abstract classes can have constructors that can be invoked by subclass constructors.
    4 - cannot write return statement in the constructor because constructor does not have any return type. 
    5 - constructor call in subclass using super() method.
 */


package Constructors;

import java.util.Scanner;

public class Default_constructor 
{
	int a;
	
	public Default_constructor() 
	{
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		sc.close();
	}
	
	public void getData()
	{
		System.out.println("Num is "+a);
	}
	
	public static void main(String[] args) 
	{
		Default_constructor d = new Default_constructor();
		d.getData();
	}
}
