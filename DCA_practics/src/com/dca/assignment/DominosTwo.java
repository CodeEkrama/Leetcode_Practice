package com.dca.assignment;

import java.util.HashSet;
import java.util.Set;

public class DominosTwo {
	public static int minDominoRotations(int[] a, int[] b) {
        //swap until set.size()==1 approach
		int bb[]=new int[b.length];
		int aa[]=new int[a.length];
        Set<Integer> setA=new HashSet<>();
        Set<Integer> setB=new HashSet<>();
        for(int i=0;i<a.length;i++){
            setA.add(a[i]);
            setB.add(b[i]);
            bb[i]=b[i]; //cacheing b
            aa[i]=a[i];
        }
        //set A and B created
        int lenA=setA.size();
        int lenB=setB.size();
        int countA=0,countB=0;
        for(int i=0;i<a.length;i++){
            int temp=a[i];
            a[i]=b[i];
            b[i]=temp;
            
            int t2=aa[i];
            aa[i]=bb[i];
            bb[i]=t2;
            if(checkSetSize(bb)>=lenB) {
            	t2=aa[i];
                aa[i]=bb[i];
                bb[i]=t2;
            }
            else {
            	lenB=checkSetSize(bb);
                countB++;
            }
            if(checkSetSize(a)>=lenA)
            {
                temp=a[i];
                a[i]=b[i];
                b[i]=temp;
            }            
            else{
            	lenA=checkSetSize(a);
                countA++;
            }
        }
        if(lenA==1 && lenB==1)
        	return Math.min( countA, countB);
        else if(lenA==1 && lenB!=1)
        	return countA;
        else if(lenA!=1 && lenB==1)
        	return countB;
        else
        	return -1;
    }
    static int checkSetSize(int a[]){
        Set<Integer> set=new HashSet<>();
        for(int ele : a)
            set.add(ele);
        return set.size();
    }
    /*
     * [2,1,2,4,2,2]
[5,2,6,2,3,2]
[3,5,1,2,3]
[3,6,3,3,4]
     */
    public static void main(String[] args) {
		int a[]=new int[] {2,1,2,4,2,2};
		int b[]=new int[] {5,2,6,2,3,2};
		System.out.println(minDominoRotations(a,b));
	}
}
