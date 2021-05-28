package com.dca.assignment;

import java.util.HashMap;
import java.util.Map.Entry;

public class romanToNumber {
    public static int romanToInt(String s) {
        HashMap<String,Integer> romanRegister=new HashMap<>();
        romanRegister.put("I", 1);
        romanRegister.put("V", 5);
        romanRegister.put("X", 10);
        romanRegister.put("L", 50);
        romanRegister.put("C", 100);
        romanRegister.put("D", 500);
        romanRegister.put("M", 1000);
        //XXIV
        String[] splitted=s.split("");
        int res=0;
        for(int i=0;i<s.length();i++) {
        	int s1=romanRegister.get(splitted[i]);
        	if(i+1<s.length()) {
        		int s2=romanRegister.get(splitted[i+1]);
        		if(s1>=s2) {
        			res=res+s1;
        		}
        		else {
        			res=res+s2-s1;
        			i++;
        		}
        	}
        	else {
        		res=res+s1;
        	}
        }
        return res;
    }
    public static void main(String[] args) {
    	System.out.println(romanToInt("XXXIV"));
	}
}
