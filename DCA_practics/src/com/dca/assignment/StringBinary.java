package com.dca.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringBinary {
	//returns triplets
	static List<String> questionOne(String str,int n){
		//101011110100101
		//n=3
		int l=str.length();
		List<String> triplets=new ArrayList<>();
		for(int i=0;i<l;i=i+n) {
			triplets.add(str.substring(i,i+n));
		}
		return triplets;
	}
	static List<Integer> counter(List<String> triplet) {
		int count=0;
		Iterator<String> it=triplet.iterator();
		List<Integer> countList=new ArrayList<>();
		while(it.hasNext()) {
			String s=it.next();
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='1') {
					count++;
				}
			}
			countList.add(count);
			count=0;
		}
		return countList;
	}
	//return max number of 1s
	static int maxOnes(List<Integer> counts) {
		Integer m=counts.stream()
				.max((o1,o2)->(o1>o2)?1:(o1<o2)?-1:0)
				.get();
		return m;
	}
	public static void main(String[] args) {
		String s="ekrama";
		boolean v=false;
		if(s.contains('e'+"")) {
			v=true;
		}
		Integer result=maxOnes(counter(questionOne("101011110100111",3)));
		System.out.println("Max number of Ones is: "+result);
		System.out.println("Result :"+v);
	}
}
