package LeetCode;

import java.util.*;
class Solution1 
{
    public int findKthLargest(int[] nums, int k) 
    {
        Arrays.sort(nums);

        return nums[nums.length-k];
    }
}

public class practice2 
{
	public static void main(String[] args) 
	{
		int nums1[] = new int[]{1,4,2,3,6,5};
		int k = 6;
		Solution1 s = new Solution1();
		System.out.println(s.findKthLargest(nums1, k));
	}
}
