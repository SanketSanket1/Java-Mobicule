package Control_Statement;

public class Ternary_Demo 
{
	
	public void sample()
	{
		
	}
	
	public void findGreater(int a1,int a2,int a3)
	{
		String res = (a1 > a2 || a3 > a2) ? ((a1 > a3) ? "first number is greater than second and third number" : "Third Number is Greater than First and Second Number") : "Second Number is Greater than First and Third Number";
		
		System.out.println(res);
	}
	
	public static void main(String[] args) 
	{
		Ternary_Demo t = new Ternary_Demo();
		t.findGreater(12, 9, 10);
		
		
		int num = -21;
		
		String res = (num <= 0) ? "Number is Zero or negative" : ((num % 2 == 0) ? "Number is Even" : "Number is Odd");
		System.out.println(res);
	}
}
