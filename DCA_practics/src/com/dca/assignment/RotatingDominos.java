package com.dca.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RotatingDominos {
	public static int minDominoRotations(int[] A, int[] B) {
        /*
        create set for A and B
        
        
        */
		int a[]=new int[A.length];
		int b[]=new int[B.length];
		int index=0;
        int rotationsA=0,rotationsB=0;
        List<Integer> freqA=new ArrayList<>();
        List<Integer> freqB=new ArrayList<>();
        Set<Integer> setA=new HashSet<>();
        Set<Integer> setB=new HashSet<>();
        for(int ar:A){
        	a[index]=ar;
            setA.add(ar);
            freqA.add(duplicateCounter(ar,A));
            index++;
        }
        index=0;
        for(int br:B){
            setB.add(br);
            freqB.add(duplicateCounter(br,B));
            b[index]=br;
            index++;
        }
        //find the max freq
        int maxA=freqA.get(0);
        int maxIndexA=0;
        int maxB=freqB.get(0);
        int maxIndexB=0;
        for(int i=0;i<freqA.size();i++){
            if(i+1<freqA.size() && maxA<freqA.get(i+1)){
                maxA=freqA.get(i+1);
                maxIndexA=i+1;
            }
        }
        for(int i=0;i<freqB.size();i++){
            if(i+1<freqB.size() && maxB<freqB.get(i+1)){
                maxB=freqB.get(i+1);
                maxIndexB=i+1;
            }
        }
        for(int i=0;i<A.length;i++){
            if(A[i]!=A[maxIndexA]){
                int temp=A[i];
                A[i]=B[i];
                B[i]=temp;
                rotationsA++;
            }
        }
        if(!allAreSame(A))
            rotationsA=0;
         
        //swap
//            for(int i=0;i<A.length;i++){
//            if(A[i]!=A[maxIndexA]){
//                int temp=A[i];
//                A[i]=B[i];
//                B[i]=temp;
//            }
//        }

        // if(allAreSame(B))
        //     return Math.min(rotationsB,rotationsA);
        for(int i=0;i<b.length;i++){
            if(b[i]!=b[maxIndexB]){
                int temp=a[i];
                a[i]=b[i];
                b[i]=temp;
                rotationsB++;
            }
        }
        int xx=rotationsA | rotationsB;
        if((allAreSame(b) && allAreSame(A) ) && (rotationsA | rotationsB)!=0)
            return Math.min(rotationsB,rotationsA);
        else if(allAreSame(b))
        	return rotationsB;
        else if(allAreSame(A))
        	return rotationsA;
        return -1;
    }
	static int duplicateCounter(int val,int[]a){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==val)
                count++;
        }
    return count;
    }
    static boolean allAreSame(int a[]){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(i+1<a.length && a[i]==a[i+1])
                count++;
        }
        if(count==a.length-1)
            return true;
        else
            return false;
    }
    /*
[1,2,1,1,1,2,2,2]
[2,1,2,2,2,2,2,2]
     */
    public static void main(String[] args) {
    	int a[]=new int[] {1,2,1,1,1,2,2,2};
    	int b[]=new int[] {2,1,2,2,2,2,2,2};
		System.out.println(minDominoRotations(a,b));
	}
}
