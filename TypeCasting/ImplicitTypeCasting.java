/*
  1 - no risk of Data Loss
  2 - jvm automatically convert data type explicitly(but only smaller data type convert into larger data type)
  3 - byte - short - int - long - float - double   increasing order of data types
 */


package TypeCasting;

public class ImplicitTypeCasting 
{
	
	public static void main(String[] args) 
	{
		byte a = 100;
		
		int intA = a;
		System.out.println(intA);
		
		float floatA = a;
		System.out.println(floatA);
		
		double doubleA = a;
		System.out.println(doubleA);

		char charA = (char)a;
		System.out.println(charA);
		
	}
}
