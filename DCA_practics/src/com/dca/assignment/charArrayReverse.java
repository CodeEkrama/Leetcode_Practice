package com.dca.assignment;

public class charArrayReverse {
    public static char[] reverseString(char[] s) {
        StringBuilder sb=new StringBuilder();
        for(char c: s){
            sb.append(c);
        }
        sb.reverse();
        String st=sb.toString();
        s=st.toCharArray();
        return s;
    }
    public static void main(String[] args) {
    	char[] c= {'h','e','l','l','o'};
    	c=reverseString(c);
    	for(char ch:c) {
    		System.out.println(ch);
    	}
	}
}
