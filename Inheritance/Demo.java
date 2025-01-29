package Inheritance;

class Demo {
	public static void main(String[] args) {
		//System.out.println("Hello");
		
		Child4 c = new Child4();
		
		c.age = 22;
		c.name = "Sanket";		
		c.display();
	}
}

class Parent4
{
	int age;
	String name;
	
	public void display()
	{
		System.out.println(this.age);
		System.out.println(this.name);
	}
}


class Child4 extends Parent4{
	
	
}


