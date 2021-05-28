package com.dca.assignment;

import java.util.ArrayList;
import java.util.List;

public class LondSubNoRepeat {
	public static int lengthOfLongestSubstring(String s) {
        //using brute force
		if(s=="")
			return 0;
        String st="";
        List<String> selected=new ArrayList<>();
        List<Integer> len=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i!=j && i<j){
                st=s.substring(i,j);
                    if(!containsDuplicate(st) && !selected.contains(st)){
                        selected.add(st);
                        len.add(st.length());
                    }
                }
            }
        }
        int m=len.stream().max((o1,o2)->(o1<o2)?-1:(o1>o2)?1:0).get();
        return m;
    }
    static boolean containsDuplicate(String str){
        boolean duplicate=false;
        int a[]=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            a[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(a[i]!=0){
                if(a[i]>=2)
                    duplicate=true;
            }
        }
        if(duplicate)
            return true;
        else
            return false;
        //---------------------------------------------------------
           
    }
    public static void main(String[] args) {
    	System.out.println(lengthOfLongestSubstring(""));   
	}
}
