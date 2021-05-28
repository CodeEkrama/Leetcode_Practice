package com.dca.assignment;
import java.util.*;
public class ShortestSubArray {
	public static int findShortestSubArray(int[] nums) {
        //finding the degree
        List<Integer> frequency=new ArrayList<>();
        int maxIndex=0;
        for(int i=0;i<nums.length;i++)
            frequency.add(freq(nums[i],nums));
        int degree=degreeFinder(frequency,nums); //degree
        return degree;
    }
	static int degreeFinder(List<Integer> frequency,int[] nums){
        int degree=frequency.get(0);
        int index=0;
        for(int i=0;i<frequency.size();i++){
            if(i+1<frequency.size() && degree<frequency.get(i+1)) {
            	index=i+1;
            	degree=frequency.get(i+1);
            }  
        }
        int numAtIndex=nums[index];
        int start=0,end=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==numAtIndex){
                start=i;
                break;
            }
        }
        // [1,2,2,3,1,4,2,3,6]  i-> 0 to 8 
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==numAtIndex){
                end=i;
                break;
            }
        }
        //6-1 -> 5
        return end-start+1;
    }
	static int freq(int n,int nums[]){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(n==nums[i])
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
    	int a[]=new int[] {1,2,2,3,1};
		System.out.println(findShortestSubArray(a));
	}
}
