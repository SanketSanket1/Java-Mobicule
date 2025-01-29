package Control_Statement;

public class Switch_Case_Demo 
{
	static class InnerClass
    {
    	public static void msg()
    	{
    		System.out.println("static method");
    	}
    }
	
	
	public static void main(String[] args) 
	{
		switch(new Switch_Case_Demo().condition())
		{
			case 1:
					System.out.println("1");
					break;
			case 2:
				    InnerClass.msg();
				    break;
			case 3:
				    System.out.println("3");
				    break;
		    default:
		    	    System.out.println("defaulter");
		}
	}

	public int condition()
	{
		return 89;
	}
}
