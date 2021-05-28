package com.dca.assignment;

public class MaxIntoTwo {
	public static int dominantIndex(int[] nums) {
        //find largest and store its index
        //traverse through each element and check if (element *2 > largest) ? return -1 : count++;
        //if(count==len-1)? return maxIndex : -1
        //O(n) solution
    
        int len=nums.length;
        if(len==1)
            return 0;
        
        //base case 
        //find max
        int maxIndex;
        int max=nums[0];
        maxIndex=0;
        //3,2,4
        for(int i=0;i<len;i++){
            if(i+1<len && max<nums[i+1])
            {
                max=nums[i+1];
                maxIndex=i+1;
            }  
        }
        int count=0;
        for(int i=0;i<len;i++){
            if(i!=maxIndex && nums[i]*2 > max)
                return -1;
            else if(i!=maxIndex)
                count++;
        }
        if(count==len-1)
            return maxIndex;
        else
            return -1;
    }
	//[3,6,1,0]
	public static void main(String[] args) {
		int a[]=new int[] {3,6,1,0};
		System.out.println(dominantIndex(a));
	}
}
