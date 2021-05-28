package com.dca.assignment;

import java.util.ArrayList;
import java.util.List;

public class buddyStringClassApproachTwo {
	public static boolean swapTwoLetters(String a, String b) {
		List<Integer> indexes=new ArrayList<>();
		String[] each=a.split("");
		for(int i=0;i<a.length();i++) {
			char x=a.charAt(i);
			char y=b.charAt(i);
			if(x!=y || (sameString(a) && sameString(b) && a.equals(b))) {
				indexes.add(i);
			}
		}
		if(indexes.size()==2) {
			String temp=each[indexes.get(0)];
			each[indexes.get(0)]=each[indexes.get(1)];
			each[indexes.get(1)]=temp;
		
		String r="";
		for(String e : each) {
			r+=e;
		}
		if(r.equals(b)) {
			return true;
		}
		}
		return false;
	}
	static boolean sameString(String s) {
		boolean same=true;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)!=s.charAt(i+1)) {
				same=false;
			}
		}
		return same;
	}
	public static void main(String[] args) {
		System.out.println(swapTwoLetters("aa","aa"));
	}
}
