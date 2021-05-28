package com.alphabets;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringOperations {
	public static boolean testString(String s) {
		boolean r=false;
		String reg= "[a-zA-Z]";
		Pattern p2=Pattern.compile(reg);
		Set<String> str=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			String c=s.charAt(i)+"";
			Matcher m=p2.matcher(c);
			if(m.find()) {
				str.add(c);
			}
		}
		if(str.size()==26) {
			r=true;
		}
		return r;
	}
	public static void main(String[] args) {
		System.out.println(testString("bcdefghijklAmnoqrstuvwxyzc"));
	}
}
