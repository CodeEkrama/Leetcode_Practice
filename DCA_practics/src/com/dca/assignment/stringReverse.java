package com.dca.assignment;

import java.util.ArrayList;
import java.util.List;

public class stringReverse {
	 public static String reverseStr(String s, int k) {
	        int l=s.length();
	        int count=0;
	        String r="";
	        String temp,temp2;
	        String result="";
	        String t="";
	        List<String> str=new ArrayList<>();
	        List<String> str2=new ArrayList<>();
	        for(int i=0;i<l;i=i+2*k){
	            while(count<2*k && i+count<l){
	                r+=s.charAt(i+count);
	                count++;
	            }
	            str.add(r);
	            r="";
	            count=0;
	        }
	        for(String st : str){
	            if(st.length()>=k){
	                temp=st.charAt(0)+"";
	                temp2=st.charAt(1)+"";
	                t=temp2+temp+st.substring(2);
	            }
	            str2.add(t);
	            t="";
	        }
	        for(String ss : str2){
	            result+=ss;
	        }
	        return result;
	    }
	 public static void main(String[] args) {
		System.out.println(reverseStr("abcdefg",2));
	}
}
