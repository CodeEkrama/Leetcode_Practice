package com.dca.assignment;

public class canPlaceFlowersClass {
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        //1,0,0,0,0,0,0,0
        //5length->3 ones
        //5 len-> 2 ones
        //6 length -> 3 ones
        //8 len-> 4 ones
        
        int l=flowerbed.length;
        int countOne=0,insert=0;
        for(int each: flowerbed){
            if(each==1)
                countOne++;
            //number of ones stored
        }
        int max=0;
        if(l%2==0)
            max=l/2;
        else
        {
            if(flowerbed[0]==1 || flowerbed[l-1]==1 || flowerbed[l/2]==1)
                max=l/2+1;
            else if(l==1 && flowerbed[0]==0)
            	max=1;
            else
                max=l/2;
        }
        if(max-countOne==n)
            return true;
        else
            return false;
        
    }
	public static void main(String[] args) {
		int a[]=new int[] {0};
		System.out.println(canPlaceFlowers(a,1));
	}
}
