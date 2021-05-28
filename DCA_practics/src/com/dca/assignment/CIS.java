package com.dca.assignment;
//continuous increment series 

public class CIS {
    public static int findLengthOfLCIS(int[] nums) {
        int ans = 0, anchor = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i > 0 && nums[i-1] >= nums[i]) anchor = i;
            ans = Math.max(ans, i - anchor + 1);
        }
        return ans;
    }
	/*
	 * 1,3,5,7
	 */
	public static void main(String[] args) {
		int n[]=new int[] {1,3,5,7};
		System.out.println(findLengthOfLCIS(n));
	}
}
