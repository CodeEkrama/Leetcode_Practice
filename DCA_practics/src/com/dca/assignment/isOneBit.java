package com.dca.assignment;

public class isOneBit {
	 public static boolean isOneBitCharacter(int[] bits) {
	        if(bits.length==0 || bits==null){
	            return false;
	        }
	        int pos = bits.length-1;
	        int count = 0;
	        while(pos>0){
	            pos--;
	            if(bits[pos]==1){
	                count++;
	            }
	            else
	            {
	                break;
	            }
	        }
	        return count%2==0;
	    }
	public static void main(String[] args) {
		int[] a=new int[] {1,1,0};
		System.out.println(isOneBitCharacter(a)); 
	}
}
