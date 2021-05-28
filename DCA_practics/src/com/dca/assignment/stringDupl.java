package com.dca.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class stringDupl {
	public static List<List<Integer>> largeGroupPositions(String s) {
        int start=0,end=0;
        String str="";
        int max;
        String sBack="";
        List<Integer> indices=new ArrayList<>();
        List<Integer> lengths=new ArrayList<>();
        List<String> words=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Set<String> set=new HashSet<>();
        set.add(s);
        int l=s.length();
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            if(i>=1 && s.charAt(i-1)!=c){
                lengths.add(str.length());
                words.add(str);
                str="";
            }
            else{
                if(i!=0)
                    str+=c;
            }      
        }
        lengths.add(str.length());
        words.add(str);
        for(int i=0;i<lengths.size();i++){
            if(lengths.get(i)>=2){
                indices.add(i);
                }
            }
        if(indices.size()==0)
            return result;
        else{
            for(int i=0;i<indices.size();i++){
                int index=indices.get(i);
                String st=words.get(index)+words.get(index).charAt(0);
                start=s.indexOf(st);
                if(i!=0)
                	start+=sBack.length();
                sBack=sBack+s.substring(0,st.length());
                s=s.substring(st.length());
                end=start+st.length()-1;
                List<Integer> list=new ArrayList<>();
                list.add(start);
                list.add(end);
                result.add(list);
            }
        }
        return result;
        
    }
	public static void main(String[] args) {
		System.out.println(largeGroupPositions("nnnhaaannnm"));
	}
}
