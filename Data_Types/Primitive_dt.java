package Data_Types;

public class Primitive_dt 
{
	static byte bVar = 100;
	short sVar = 4387;
	static int iVar = 3214567;
	long lVar = 6826043423444L;
	float fVar = 42432.64f;
	double dVar = 65565463464.90;
	char ch = 'M';
	static String name = "Mobicule";
	
	public static void display()
	{
		System.out.println(bVar);
		System.out.println(new Primitive_dt().lVar);        //cannot access non static variable in static method directly we need to create object and then access it   
		System.out.println(new Primitive_dt().fVar);
		System.out.println(new Primitive_dt().dVar);
	}
	
	public void display1()
	{
		System.out.println(bVar);
		System.out.println(sVar);
	}
	
	public static void main(String[] args) 
	{
		System.out.println(new Primitive_dt().sVar);
		System.out.println(iVar);
		System.out.println(new Primitive_dt().ch);
		System.out.println(name);
		
		display();
		new Primitive_dt().display1();
	}
}
