package com.alphabets;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayOp {
	public static Integer arrayOperations(int n,Integer [] array,int lastn) {
		ArrayList<Integer> l=new ArrayList<>();
		l=(ArrayList<Integer>) Stream.of(array)
				.sorted((o1,o2)-> (o1<o2)?-1:(o1>o2)?1:0)
				.collect(Collectors.toList());
		return l.get(lastn-1);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Integer a[]=new Integer[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		int last=scan.nextInt();
		System.out.println(arrayOperations(n,a,last));
	}
}