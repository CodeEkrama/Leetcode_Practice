package com.dca.assignment;

import java.util.*;;

public class DivisorGameClass {
    public static boolean divisorGame(int n) {
        int dp[]=new int[n]; //n=4 and x=2
        int index=0;
        for(int x=n-1;x>0;x--){ //Aalice choice 
            if(n%x==0){
            	
                dp[index]=x; //{0,1,1}
                index++;
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<dp.length;i++){
            if(dp[i]!=0)
                list.add(i);
        }
        if(list.size()%2==0)
            return false;
        else
            return true;
        
    }
    public static void main(String[] args) {
		System.out.println(divisorGame(3));
	}
}
/*
 * n=3
 * 
*/
