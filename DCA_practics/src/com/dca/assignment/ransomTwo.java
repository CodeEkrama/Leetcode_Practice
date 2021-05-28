package com.dca.assignment;

import java.util.HashMap;

public class ransomTwo {
	public static boolean canConstruct(String ransomNote, String magazine) {
        int a[] = new int[26];
        for(int i=0;i<magazine.length();i++)
            a[magazine.charAt(i)-97]++;
       
        for(int i=0;i<ransomNote.length();i++){
            if(a[ransomNote.charAt(i)-97]--<=0){
                return false;
            }
        }
        return true;
    }
	 public static void main(String[] args) {
		System.out.println(canConstruct("bb","bhbd"));
	}
}
