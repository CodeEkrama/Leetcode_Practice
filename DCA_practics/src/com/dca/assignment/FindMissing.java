package com.dca.assignment;
import java.util.*;
public class FindMissing {
    public static int findKthPositive(int[] arr, int k) {
        int index=0;
        List<Integer> missing=new ArrayList<>(); //len=k
        for(int i=1;i<=arr[arr.length-1]+k;i++){
        	if(index<arr.length&&arr[index]==i) {
        		index++;
        	}
        	else if(index<arr.length && arr[index]!=i){
                missing.add(i);
            }
            else if(index>=arr.length)
                missing.add(i);
        }
        return missing.get(k-1);
    }
    public static void main(String[] args) {
    	int[] arr=new int[] {2,3,4,7,11};

    	int k=5;
		System.out.println(findKthPositive(arr,k));
	}
}
