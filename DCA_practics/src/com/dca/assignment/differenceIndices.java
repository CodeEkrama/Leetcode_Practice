package com.dca.assignment;

import java.util.HashMap;
import java.util.Map;

public class differenceIndices {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(i - map.get(nums[i])) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        
        return false;
    }
    public static void main(String[] args) {
		int a[]=new int[] {1,0,1,1};
		int k=1;
		System.out.println(containsNearbyDuplicate(a,k));
	}
}
