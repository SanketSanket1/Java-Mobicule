package Interface;

interface Functional_Inter
{
	void method();
}

public class Functional_Interface 
{
	public static void main(String[] args) 
	{
		Functional_Inter f = () -> {                               //This is Lambda Expression
			System.out.println("This is Lambda Expression");
		};
		
		f.method();
	}
}