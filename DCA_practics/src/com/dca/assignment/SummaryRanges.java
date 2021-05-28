package com.dca.assignment;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	public static List<String> summaryRanges(int[] nums) {
        //store first elem in string range and add "->"
        //traverse array
        //check if(next- curr != 1)? (add current to range) : continue
        //add range to list and empty range
        //set i = next 
        
        String range="";
        String visited="";
        List<String> vis=new ArrayList<>();
        visited=nums[0]+"";
        vis.add(visited);
        List<String> result=new ArrayList<>();
        if(nums.length==0)
            return new ArrayList<String>();
        range=nums[0]+"";
        if(nums.length==1){
            result.add(range);
            return result;
        }
        //[0,2,3,4,6,8,9,10]
        //l=7
        //i=4
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length && nums[i+1]-nums[i]!=1){
                if(!(nums[i]+"").equals(range)) {
                	visited=""+nums[i];
                	vis.add(visited);
                	range+="->"+nums[i];
                }
                    
            }
            else if(i+1==nums.length-1 && nums[i+1]-nums[i]==1) {
            	range+="->"+nums[i+1];
            	visited=""+nums[i+1];
            	vis.add(visited);
            }
            	
            else if(i+1==nums.length && !(vis).contains(nums[i]+"")){
            }
            else
                continue;
            result.add(range);
            if(i+1<nums.length)
                range=nums[i+1]+"";
        }
        
        return result;
    }
	//["0","2->4","6","8->9","9"]
	public static void main(String[] args) {
		int[] a=new int[] {0,2,3,4,6,8,9,11};
		System.out.println(summaryRanges(a));
	}
}
