package com.dca.assignment;

import java.util.*;

public class testClass {
    public static int numDecodings(String s) {
    	String str="",ss="";
        Map<String,Character> map=new HashMap<>();
        for(int i=1;i<=26;i++)
            map.put(i+"",(char) ('A'+i-1));
        List<String> possibleWords=new ArrayList<>(); // answer = possibleWords.size();
        //created a hashmap
          String digits[]=s.split("");
          int count=0;
          /*
"AAJF" with the grouping (1 1 10 6)
"KJF" with the grouping (11 10 6)
           */
        for(int i=0;i<digits.length;i++) {
        	if(i+1<digits.length && digits[i+1].equals("0")) {
        		str+=map.get(digits[i]+digits[i+1]);
        		i++;
        		continue;
        	}
        	if(i+1<digits.length && Integer.parseInt( (digits[i]+digits[i+1]))<=26 ) {
        		ss+=map.get(digits[i]+digits[i+1]);
        		count++;
        	}
        	str+=map.get(digits[i]);
        }
        possibleWords.add(str);
        
        //str holds one result
        
        return count;
    }
    public static void main(String[] args) {
		System.out.println(numDecodings("11106"));
	}
}
