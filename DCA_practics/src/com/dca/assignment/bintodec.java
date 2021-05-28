package com.dca.assignment;

import java.util.ArrayList;
import java.util.List;

public class bintodec {
    public static List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> li = new ArrayList<>();
         int val=0;
         for(int i=0;i<A.length;i++)
         {
             val = 2*val + A[i];
             if(val%5==0)
               li.add(true);
             else
                 li.add(false);
             val=val%5;
         }
         return li;
     }
    public static void main(String[] args) {
		int a[]=new int[] {1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};
		System.out.println(prefixesDivBy5(a));
	}
}
