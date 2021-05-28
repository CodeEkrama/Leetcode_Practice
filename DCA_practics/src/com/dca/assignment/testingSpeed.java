package com.dca.assignment;

public class testingSpeed {
public static void main(String[] args) {
	int a=10,b=9;
	long start=System.currentTimeMillis();
	int c=Math.max(a,b);
	long end=System.currentTimeMillis();
	System.out.println((long)end-start);
}
}
