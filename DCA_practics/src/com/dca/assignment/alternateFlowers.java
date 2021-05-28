package com.dca.assignment;

import java.util.ArrayList;
import java.util.List;

public class alternateFlowers {
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        //1,0,0,0,0,0,0,0
        //5length->3 ones
        //5 len-> 2 ones
        //6 length -> 3 ones
        //8 len-> 4 ones
        if(n==0)
            return true;
        int max=0,even=0,odd=0,loc=0;
        int l=flowerbed.length;
        int countOne=0;
        List<Integer> pos=new ArrayList<>();
        for(int i=0;i<l;i++){
            if(flowerbed[i]==1) {
            	countOne++;
            	pos.add(i);
            }
                
            //number of ones stored
            
        }
        int x=3;
        if(pos.size()==0){
            //no ones present
            if(l%2==0){
                max=l/2;
                loc=2;
            }
            else{
                max=l/2+1;
                loc=1;
            }
            x=2;
        }
        for(int i=0;i<pos.size();i++){
            if(pos.get(i)%2==1){
                even++; //even==size90 => pos is even
            }
            else if(pos.get(i)%2==0){
                odd++;
            }
        }
        if(even==pos.size() && x!=2)
            loc=2;
        else if(odd==pos.size() && x!=2)
            loc=1;
        
        if(loc%2==0 && l%2==0){ //even pos even length
            //0,1,0,1
            max=l/2;
        }
        else if(loc%2==0 && l%2==1){ //even pos odd length
            //0 1 0 1 0 1 0
            max=l/2;
        } 
        else if(loc%2==1 && l%2==0){ //odd pos even length
            //1,0,1,0
            max=l/2;
        }
        else if(loc%2==1 && l%2==1){ //odd pos odd len
            //1 0 1 0 1 0 1
            max=l/2+1;
        }
        
        if(n<=max-countOne)
            return true;
        else
            return false;
        
    }
	//[0,0,1,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,1,0,0,0,1,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0]
	//17
	public static void main(String[] args) {
		int[] a=new int[] {0,0,1,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,1,0,0,0,1,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0};
		int n=17;
		System.out.println(canPlaceFlowers(a,n));
	}
}
