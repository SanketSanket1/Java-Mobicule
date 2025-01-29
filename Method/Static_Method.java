/*
  1 - in static method we can initialize only static member variable 
  2 - static methods cannot be abstract because static method can't override into another class
 */

package Method;

public class Static_Method 
{
	public static String name;
	
	public static void setData()    //static method
	{
		name = "Mobicule";
	}
	
	public String getData()
	{
		return name;
	}
	
	public static void main(String[] args) 
	{
		Static_Method sm = new Static_Method();
		sm.setData();
		System.out.println(sm.getData());
	}
}
