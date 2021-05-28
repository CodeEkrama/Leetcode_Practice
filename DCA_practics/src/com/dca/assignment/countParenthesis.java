package com.dca.assignment;

public class countParenthesis {
	//number of parenthesis possible 
	static long binomialCoef(int n, int r) {
		long numerator=1;
		long deno1=1;
		long deno2=1;
		for(int i=n;i>=1;i--) {
			numerator=numerator*i;
		}
		for(int i=r;i>=1;i--) {
			deno1=deno1*i;
		}
		for(int i=n-r;i>=1;i--) {
			deno2=deno2*i;
		}
		return numerator/(deno1*deno2);
	}
	static long catalan(int n){
		long coef= binomialCoef((2*n),n);
		return coef/(n+1);
	}
	public static void main(String[] args) {
		int n=6;
		long result=catalan(n/2);
		System.out.println("Number of possible parenthesis is : "+result);
	}
}
