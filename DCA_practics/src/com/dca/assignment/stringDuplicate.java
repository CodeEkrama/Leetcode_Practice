package com.dca.assignment;

import java.util.ArrayList;
import java.util.List;

public class stringDuplicate {
    public static int lengthOfLongestSubstring(String s) {
        String str="";
        int index=0;
        int l;
        List<Integer> lengths=new ArrayList<>();
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i);
            
            if(!str.contains(c+"")){
                str=str+c;
                i++;
            }
            else{
            	index++;
                lengths.add(str.length());
                str="";
                l=lengths.get(index-1);
                i=i-l+1;
//                i--;
            }
        }
        lengths.add(str.length());
        Integer max=lengths.stream().max((o1,o2)->(o1>o2)?1:(o1<o2)?-1:0).get();
        
        return max;
    }
    public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("aab"));
	}
}
