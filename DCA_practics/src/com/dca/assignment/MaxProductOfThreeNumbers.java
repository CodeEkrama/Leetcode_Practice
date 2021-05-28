package com.dca.assignment;

import java.util.Arrays;

public class MaxProductOfThreeNumbers {
	public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);   //O(nlog n) 
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
	/*
	 * [1,2,3]
[1,2,3,4]
[-1,-2,-3]
	 */
	public static void main(String[] args) {
		int a[]=new int[] {-1,-2,-3,1,2,3,4};
		System.out.println(maximumProduct(a));
	}
}
