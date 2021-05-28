package com.dca.assignment;

import java.util.HashMap;

public class firstUniqueCharacterTwo {
	 public static int firstUniqChar(String s) {
	        int out=-1;
	        HashMap<Character,Integer> map=new HashMap<>();
	        int a[]=new int[26];
	        for(char c: s.toCharArray()){
	            a[c-97]++;
	        }
	        for(int i=0;i<s.length();i++) {
	        	map.put(s.charAt(i), a[s.charAt(i)-97]);
	        }
	        for(int i=0;i<s.length();i++) {
	        	char c=s.charAt(i);
	        	if(map.get(c)==1) {
	        		out=i;
	        		break;
	        	}
	        }
	        return out;
	 }
	 public static void main(String[] args) {
		System.out.println(firstUniqChar("loveleetcode"));
	}
	        
}
