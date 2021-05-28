package com.dca.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TypingMistake {
	public static boolean isLongPressedName(String name, String typed) {
	       char t[]=typed.toCharArray();
	        char n[]=name.toCharArray();
	        int type[]=new int[26];
	        for(int i=0;i<t.length;i++){
	            type[t[i]-'a']++;
	        }
	        for(int i=0;i<name.length();i++){
	            type[n[i]-'a']--;
	        }
	        boolean flag=false;
	        for(int e:type){
	            if(e<0)
	                flag=true;
	        }
	        // if(flag)
	        //     return false;
	        // else
	        //     return true;
	        if(flag)
	            return false;
	        else{
	        	if(deduce(name).equals(deduce(typed)))
	        		return true;
	        	else
	        		return false;
//	            if(deduce(name,typed))
//	                return true;
//	            else
//	                return false;
	        }
	                
	    }
//	    static boolean orderCheck(String a, String b){
//	        List<Integer> indices=new ArrayList<>();
//	        int c=0;
//	        for(int i=0;i<a.length();i++){
//	            char ch=a.charAt(i);
//	            for(int j=0;j<b.length();j++){
//	                char chb=b.charAt(j);
//	                if(ch==chb)
//	                {
//	                    indices.add(j);
//	                }
//	            }
//	        }
//	        for(int i=0;i<indices.size();i++){
//	            if(i+1<indices.size() && indices.get(i)<indices.get(i+1))
//	                c++;
//	        }
//	        if(c==indices.size()-1)
//	            return true;
//	        else
//	            return false;
//	        
//	    }
	static String deduce(String a) {
		String r="";
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(i+1<a.length() && ch!=a.charAt(i+1)) {
				r+=ch;
			}
		}
		return r;
	}
	static HashMap<Character,Integer> createMap(String a) {
		int c=1;
		HashMap<Character,Integer> map=new HashMap<>();
			for(int i=0;i<a.length();i++) {
		
			char ch=a.charAt(i);
			if(i+1<a.length() && ch==a.charAt(i+1)) {
				c++;
			}
			else if(i+1<a.length() && ch!=a.charAt(i+1)) {
				map.put(ch, c);
				c=1;
			}
			}
			
		return map;
	}
//	"kpufanyrqqmtgxhyycltlnusyeyyqygwupcaagtkuqkwamvdsi"
//	"kpuufaanyrqqqmttggxxhyyyycclttllnusyeyqqyggwuuppccaaaggtkkuuqkwwamvvddsii"
	    public static void main(String[] args) {
	    	
	    	String a="kpufanyrqqmtgxhyycltlnusyeyyqygwupcaagtkuqkwamvdsi";
	    	String b="kpuufaanyrqqqmttggxxhyyyycclttllnusyeyqqyggwuuppccaaaggtkkuuqkwwamvvddsii";
	    	String d1=deduce(a);
	    	String d2=deduce(b);
	    	HashMap<Character,Integer> map1=createMap(a);
			System.out.println(isLongPressedName(a,b));
		}
}
