package MethodOverriding_OverLoading;

public class MethodOverloading 
{
    public int add(int a , int b)
    { 
    	return a+b;
    }
    
    public double add(double a, double b)           //overload add method over here with int,double and String type
    {
    	return a+b;
    }
    
    public String add(String a, String b)
    {
    	return a+b;
    }
	
	public static void main(String[] args) 
	{
		MethodOverloading m = new MethodOverloading();
		System.out.println( m.add(12,34));
		
		System.out.println( m.add(1.6,34.90));
		
		System.out.println( m.add("sanket"," sahane"));
	}
}
