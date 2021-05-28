package com.dca.assignment;

import java.util.ArrayList;
import java.util.List;

public class numberOfWords {
	public static int countSegments(String s) {
		List<String> result=new ArrayList<>();
        if(s.compareTo("")==0)
            return 0;
        else{
            String[] a=s.split(" ");
            for(String str: a) {
            	if(str.compareTo("")!=0) {
            		result.add(str);
            	}
            }
            return result.size();
             }
    }
	public static void main(String[] args) {
		System.out.println(countSegments(", , , ,        a, eaefa"));
	}
}
