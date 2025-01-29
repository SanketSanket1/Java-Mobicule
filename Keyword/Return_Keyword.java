package Keyword;

public class Return_Keyword 
{
	public boolean checkEven(int n)
	{
		if(n % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void isReturn(int age)
	{
		if(age < 18)
		{
			return;
		}
		System.out.println("Eligible for Voting");
	}
	
	public static void someMethod() {
        System.out.println("Before return");

        return;  // Exits the method here, so nothing after it will be executed
        
    }


	public static void main(String[] args) 
	{
		Return_Keyword rk = new Return_Keyword();
		System.out.println(rk.checkEven(1234));
		rk.isReturn(23);
	}
}
