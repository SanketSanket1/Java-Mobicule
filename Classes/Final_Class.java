/*
   1 - final class cannot inherit with another class
 */


package Classes;

public class Final_Class 
{
	public static void main(String[] args) 
	{
		Final_Demo f = new Final_Demo();
		f.setData("sanket", " sahane");
		f.getData();
	}
}

final class Final_Demo
{
	private String var1,var2;
	
	public void setData(String var1, String var2)
	{
		this.var1 = var1;
		this.var2 = var2;
	}
	
	public void getData()
	{
		System.out.println("Var1 = "+ var1+"\nVar2 = "+var2);
	}
}
