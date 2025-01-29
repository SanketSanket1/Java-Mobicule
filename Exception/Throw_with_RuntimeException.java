package Exception;

public class Throw_with_RuntimeException 
{
	public void isPass(int arr[])
	{
		int len = arr.length;
		arr[3] = 44;
		for(int i = 0 ;i < 100 ; i++)
		{
			if(i >= len)
			{
				throw new ArrayIndexOutOfBoundsException("index out of bound");
			}
			else
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int arr[] = new int[10];
		
		Throw_with_RuntimeException t = new Throw_with_RuntimeException();
		try
		{
			t.isPass(arr);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}



