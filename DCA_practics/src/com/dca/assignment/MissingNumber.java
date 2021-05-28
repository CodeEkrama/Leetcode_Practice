package com.dca.assignment;

import java.util.Arrays;

public class MissingNumber {
	 public static int missingNumber(int[] nums) {
	        int max=0,min=0;
	        for(int i=0;i<nums.length;i++){
	            max=Math.max(max,nums[i]);
	            min=Math.min(min,nums[i]);
	        }
	        if(max==min && max-min==nums.length-1) return max+1;
	        Arrays.sort(nums);
	        int index=0; //0,1,3     0,1,2,3
	        for(int i=min;i<=max;i++){
	            if(i!=nums[index]){
	                return i;
	            }
	            index++;
	        }
	        return max+1;
	    }
	 /*
	  * [3,0,1]
[0,1]
[9,6,4,2,3,5,7,0,1]
[0]
	  */
	 public static void main(String[] args) {
		int a[]=new int[] {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(a));
	}
}
