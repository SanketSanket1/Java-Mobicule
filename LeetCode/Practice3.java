package LeetCode;

import java.util.*;
class Solution11 
{
    public int[] productExceptSelf(int[] nums) 
    {
       int arr1[] = new int[nums.length+1];
       int arr2[] = new int[nums.length+1];
       int arr3[] = new int[nums.length];

       arr1[0] = 1;
       arr2[nums.length-1] = 1;
       int mul = 1;
       for(int  i = 0 ; i < nums.length ; i++)
       {
            mul = mul * nums[i];
            arr1[i+1] = mul;
       }
        mul = 1;
        for(int i = nums.length-1 ; i >= 0 ; i--)
       {
            mul = mul * nums[i];
            arr2[i] = mul;
       }

       for(int i = 0 ; i < nums.length ; i++)
       {
            arr3[i] = arr1[i] * arr2[i+1]; 
       }
       return arr3;
    }
    
}


public class Practice3 
{
	public static void main(String[] args) 
	{
		int nums[] = new int[]{1,2,3,4};
		int res[] = new int[nums.length];
		Solution11 s = new Solution11();
		res = s.productExceptSelf(nums);
		
		for(int i = 0 ; i < res.length ; i++)
		{
			System.out.println(res[i]);
		}
	}
}
