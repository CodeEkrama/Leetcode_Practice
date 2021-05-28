package com.dca.assignment;

import java.util.HashSet;
import java.util.Set;

public class twoNumbers {
    public static int[] twoSum(int[] nums, int target) {
        Set<Integer> indices=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                	int s=nums[i]+nums[j];
                	if(s==target){
                		indices.add(i);
                		indices.add(j);
                	}
                }
            }
        }
        int[] c=indices.stream()
        .mapToInt(Integer::intValue)
        .toArray();
        return c;
    }
    public static void main(String[] args) {
    	int[] a1= {2,7,11,15};
    	int[] r=twoSum(a1,9);
    	for(int i=0;i<r.length;i++) {
    		System.out.println(r[i]);
    	}
	}
}
