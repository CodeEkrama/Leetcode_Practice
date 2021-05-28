package com.dca.assignment;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class duplicateToTrim {
	public static int removeDuplicates(int[] nums) {
	    // if (nums.length == 0) return 0;
	    // int i = 0;
	    // for (int j = 1; j < nums.length; j++) {
	    //     if (nums[j] != nums[i]) {
	    //         i++;
	    //         nums[i] = nums[j];
	    //     }
	    // }
	    // return i + 1;
	    TreeSet<Integer> set=new TreeSet<>();
	    for(int n:nums){
	        set.add(n);
	    }
	    int index=0;
	    for(int num : set){
	        nums[index]=num;
	        index++;
	    }
	    return set.size();
	}
	//[-3,-1,0,0,0,3,3]
	public static void main(String[] args) {
		int n[]=new int[]{-3,-1,0,0,0,3,3};
		System.out.println(removeDuplicates(n));
	}
}
