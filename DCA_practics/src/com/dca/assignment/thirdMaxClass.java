package com.dca.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class thirdMaxClass {
	public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3){
            return nums[nums.length-1];
        }
        //1,2,2,3
        else
        {
            TreeSet<Integer> s=new TreeSet<>();
            for(int each: nums)
                s.add(each);
            List<Integer> rr=s.stream().collect(Collectors.toList());
            return rr.get(rr.size()-3);
        }
    }
}
