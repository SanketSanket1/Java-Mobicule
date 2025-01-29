package Classes;

public class Anonymous_class 
{
	public static void main(String[] args) 
	{
		Anonymous_Demo ad = new Anonymous_Demo();
		ad.exe_Ano();
	}
}

abstract class Shape
{
	abstract void shapeName();
}

class Anonymous_Demo extends Shape
{
	public void exe_Ano()
	{
		Shape s = new Shape()
		{
			@Override
			public void shapeName()
			{
				System.out.println("Shape is Rectangle");
			}
		};
		s.shapeName();
	}
	@Override
	public void shapeName()
	{
		System.out.println("Shape is Rectangle");
	}
}
