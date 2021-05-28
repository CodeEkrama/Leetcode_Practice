package com.dca.assignment;

import java.util.ArrayList;
import java.util.List;

public class addToArrayFormClass {
	   public static List<Integer> addToArrayForm(int[] num, int k) {
	       int sum=0,carry=0,digit; 
	       List<Integer> addition=new ArrayList<>();
	       List<Integer> resultadd=new ArrayList<>();
	       int ind=0,ind2=0;
	        int kar[]=numToArray(k);
	        int m=Math.max(kar.length, num.length);
	        int y[]=new int[kar.length];
	        int result[]=new int[m];
	       int kar2[]=new int[num.length];
	        if(kar.length>num.length) {
	 	       for(int i=0;i<kar.length;i++){
		           if(i<kar.length-num.length){
		               y[i]=0;
		           }
		           else{
		               y[i]=num[ind2];
		               ind2++;
		           }
		       }
	 	       num=y;
	 	       kar2=kar;
	        }
	        else {
	       for(int i=0;i<num.length;i++){
	           if(i<num.length-(k+"").length()){
	               kar2[i]=0;
	           }
	           else{
	               kar2[i]=kar[ind];
	               ind++;
	           }
	       }
	       
	        }
	        
	       for(int i=m-1;i>=0;i--){
	           sum=num[i]+kar2[i]+carry;
	           carry=sum/10;
	           digit=sum-(carry*10);
	           result[i]=digit;
	           addition.add(digit);
	           if(i==0 && carry!=0) {
	        	   addition.add(carry);
	           }
	       }
	       for(int i=addition.size()-1;i>=0;i--){
	           resultadd.add(addition.get(i));
	       }
	       return resultadd;
	    }
	    static int[] numToArray(int k){
	        String s=""+k;
	        int l=s.length();
	        int arr[]=new int[l];
	        int c=1;
	        while(k>0){
	            int a=k/10;
	            int b=a*10;
	            int d=k-b;
	            arr[l-c]=d;
	            c++;
	            k=a;
	        }
	        return arr;
	    }
    public static void main(String[] args) {
		int in[]=new int[] {2,1};
		int k=23;
		System.out.println(addToArrayForm(in,k));
	}
}
