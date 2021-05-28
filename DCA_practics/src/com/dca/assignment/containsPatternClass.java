package com.dca.assignment;


public class containsPatternClass {
	 public static boolean containsPattern(int[] arr, int m, int k) {
	        int n = arr.length;
	        if (n<m*k) return false;
	        loop:for (int i=0;i<=n-m*k;i++){
	            for (int j=0;j<m;j++){
	                for (int x=1;x<k;x++){
	                    if (arr[i+j]!=arr[i+j+m*x]) continue loop;
	                }
	            }
	            return true;
	        }
	        return false;
	    }
    /*
[3,2,2,1,2,2,1,1,1,2,3,2,2]
3
2
     */
    public static void main(String[] args) {
		int a[]=new int[] {3,2,2,1,2,2,1,1,1,2,3,2,2};
		int m=3;
		int k=2;
		System.out.println(containsPattern(a,m,k));
	}
}
