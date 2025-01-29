package Method;

import java.util.Scanner;

public class Instance_Method 
{
	int num;
	public void setData()
	{
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
	}
	
	public int getData()
	{
		return num;
	}
	
	public static void main(String[] args) 
	{
		Instance_Method i = new Instance_Method();
		i.setData();
		System.out.println(i.getData());

	}
}
