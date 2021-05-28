package com.dca.assignment;

public class subString {
    public static int maxRepeating(String sequence, String word) {
        int count=0;
        String test="";
        //ababc  & ba
        String seq=sequence;
        while(seq.contains(word)){
            count++;
            seq=removeString(seq,word);  //abc
        }
        while(count!=0) {
        	test="";
        for(int i=1;i<=count;i++) {
        	test+=word;
        }
        if(sequence.contains(test))
        	break;
        count--;
        }
        return count;
    }
    static String removeString(String s,String rem){
        //remove ab from ababc
        int index=s.indexOf(rem);
        String sub=s.substring(0,index)+s.substring(index+rem.length());
        return sub;
    }
    public static void main(String[] args) {
    	String a="aaabaaaabaaabaaaabaaaabaaaabaaaaba";
    	String b="aaaba";
    	System.out.println(maxRepeating(a,b));
	}
}
