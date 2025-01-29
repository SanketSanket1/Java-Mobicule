package LeetCode;

import java.util.*;

class Solution 
{
	public int countPrimes(int n) 
	{
		int count = 0;

		boolean arr[] = new boolean[n];
		Arrays.fill(arr,false);
		
		arr[0] = arr[1] = true;

		for(int i = 2; i * i < n ; i++)
		{
			if(arr[i] == false)                            
			{
				for(int j = i * i ; j < n ; j += i)
				{
					arr[j] = true;
				}
			}
		}
		for(int i = 0 ; i < n ; i++)
		{
			if(arr[i] == false)
			{
				count++;
			}
		}
		return count;   
	}
}

public class Practice 
{
	public static void main(String[] args) 
	{
		Solution s = new Solution();
		System.out.println(s.countPrimes(0));
		System.out.println(s.countPrimes(1));
		System.out.println(s.countPrimes(499979));
	}
}
