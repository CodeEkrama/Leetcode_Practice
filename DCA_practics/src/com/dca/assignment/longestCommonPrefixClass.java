package com.dca.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class longestCommonPrefixClass {
    public static String longestCommonPrefix(String[] strs) {
    	
    		
    	boolean error=false;
        String common="";
        int index=0;
        String s="";
        //sorting lengthwise and getting the min length
        if(strs.length!=0) {
        String least=Stream.of(strs).min((o1,o2)->o2.compareTo(o1)).get();
        int minLength=least.length();
        //stores min length of strings
        while(index<minLength) {
        	s="";
        for(int i=0;i<strs.length;i++){
        	String[] each=strs[i].split("");
        	if(each[index]=="") {
        		error=true;
        		break;
        	}
        	s=s+each[index];
        	//store all elements at index 
        }
        if(allCharactersAreSame(s) && s.length()!=0 && !error) {
        	common+=s.charAt(0);
        }
        else {
        	break;
        }
        index++;
        }    
    	}
        else {
        	common="";
        }
		return common;
    }
    static boolean allCharactersAreSame(String s) {
    	boolean error=false;
    	for(int i=0;i<s.length();i++) {
    		if(i+1<s.length()) {
    			if(s.charAt(i)!=s.charAt(i+1)) {
    				error=true;
    			}
    		}
    	}
    	return !error;
    }
    public static void main(String[] args) {
    	String[] s= {"b",""};
		System.out.println(longestCommonPrefix(s));
	}
}
