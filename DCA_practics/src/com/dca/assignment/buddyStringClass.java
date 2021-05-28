package com.dca.assignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class buddyStringClass {
	public static boolean buddyStrings(String a, String b) {
        String[] each=a.split("");
        String s="";
        String temp="";
        if(each.length==0 || b.length()==0 || each.length!=b.length()){
            return false;
        }
        //01 10
        HashMap<Integer,Integer> map=new HashMap<>();
        Set<Integer> visited=new HashSet<>();
        for(int i=0;i<a.length();i++){
            for(int j=0;j<a.length();j++){
                if(i!=j && !map.containsValue(i) && !map.containsKey(j)){
                    temp=each[i];
                    each[i]=each[j];
                    each[j]=temp;
                    //0-----1  1-----0
                    map.put(i, j);
                    
                    visited.add(i);
                    visited.add(j);
                    for(String st: each){
                        s+=st;
                    }
                    if(s.equals(b)){
                        
                        return true;
                    }
                    else {
                    	temp=each[i];
                        each[i]=each[j];
                        each[j]=temp;
                    }
                    s="";
                }
            }
        }
        return false;
    }
	public static void main(String[] args) {
		System.out.println(buddyStrings("abedc","abcde"));
	}
}
