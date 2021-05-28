package com.dca.assignment;

public class EqualSumThreeParts {
	public static boolean canThreePartsEqualSum(int[] arr) {
        //store sum at each index
        //create a cumulative array sums[]
        //[0,2,3,-3,3,-4,5,6,8,8,9]
        // 0 1 2  3 4  5 6 7 8 9 10
        //sums[i]=2
        
        //creating cumulative sum
        int sum=0;
        int cumulative[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            cumulative[i]=sum;
        }
        for(int i=0;i<cumulative.length;i++){
            for(int j=i+1;j<cumulative.length;j++){
                if(cumulative[i]==cumulative[j]-cumulative[i]){
                        if(cumulative[i]==cumulative[cumulative.length-1]-cumulative[j] && (cumulative.length-1) !=j){
                            return true;
                }
            }
        }
    }
        return false;
}
	public static void main(String[] args) {
		int a[]=new int[] {1,1,1,1};
		int b[]=new int[] {0,2,1,-6,6,7,9,-1,2,0,1};
		int c[]=new int[] {1,-1,1,-1};
		System.out.println(canThreePartsEqualSum(c));
	}
}
