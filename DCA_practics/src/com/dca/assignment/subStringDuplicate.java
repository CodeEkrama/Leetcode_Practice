package com.dca.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class subStringDuplicate {
//	 public static boolean repeatedSubstringPattern(String s) {
//	        String check="";
//	        String sub="";
//	        int l=s.length()/2;
//	        List<String> subs=new ArrayList<>();
//	        if(s.length()%2==0){
//	            for(int i=0;i<s.length();i++){
//	                char c=s.charAt(i);
//	                if(!check.contains(c+"")){
//	                    check+=c;
//	                }
//	                else{
//	                    //check contains ab
//	                    subs.add(check);
//	                    check="";
//	                }
//	            }
//	            Set<String> setSub=new HashSet<>();
//	            for(String string: subs){
//	                setSub.add(string);
//	            }
//	            if(setSub.size()==1){
//	                return true;
//	            }
//	            else{
//	                return false;
//	            }
//	        }
//	        else
//	            return false;
//	    }
    public static boolean repeatedSubstringPattern(String s) {

        	return (s.substring(1) + s.substring(0, s.length() - 1)).contains(s);
    }
	 public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("abcabcabcabc"));
	}
}
