package com.dca.assignment;

public class alternateFlowersTwo {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int result = 0;
		
        // left limit check eg: [0,0,...]
        int count = (1^(flowerbed[0])); 
        
		// traverse the array
        for (int i=1; i<flowerbed.length; i++){
		
			// if two consecutive 0s are found, increment count
            if((flowerbed[i-1]^flowerbed[i])==0){
                count++;
            }
			
			// if we have found a 1 during traversal, update our result and refresh the count to track consecutive zero
            else{
                result += (count/2);
                count=0;
            }
        }
        
        //right limit check eg: [...,0,0]
        count += (1^(flowerbed[flowerbed.length-1]));
        result += (count/2);

        return (result>=n);
    }
    public static void main(String[] args) {
    	int[] a=new int[] {0,0,1,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,1,0,0,0,1,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0};
		int n=17;
		System.out.println(canPlaceFlowers(a,n));
	}
}
