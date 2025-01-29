package Interface;

interface Callback                       //callback interface
{
	void a();
	void b();
}

public class Callback_Interface 
{
	public static void main(String[] args) 
	{
		Implement_Callback c1 = new Implement_Callback(new Callback(){         //interface method implementation using anonymous body
			public void a()
			{
				System.out.println("Method A");
			}
			public void b()
			{
				System.out.println("Method B");
			}
		});
		c1.executeTask();
	}
}

class Implement_Callback                    
{
	private Callback c;                    //implement interface
	
	public Implement_Callback(Callback c)
	{
		this.c = c;
	}
	
	public void executeTask()
	{
		System.out.println("Task Execution");
		
		c.a();                             //call interface method
		c.b();
	}
}
