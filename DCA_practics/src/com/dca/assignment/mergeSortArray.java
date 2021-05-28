package com.dca.assignment;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mergeSortArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[i-m];
        }
        Integer[] nn = Arrays.stream( nums1 ).boxed().toArray( Integer[]::new );
        List<Integer> list=Stream.of(nn).sorted().collect(Collectors.toList());
        Iterator<Integer> it=list.iterator();
        int index=0;
        while(it.hasNext()) {
        	Integer k=it.next();
        	int a=k.intValue();
        	nums1[index]=a;
        	index++;
        }
    }
	public static void main(String[] args) {
		int n1[]=new int[] {1,3,2,0,0,0};
		int n2[]=new int[] {0,9,2};
		merge(n1,3,n2,3);
	}
}
