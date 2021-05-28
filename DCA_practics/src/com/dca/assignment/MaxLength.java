package com.dca.assignment;

import java.util.ArrayList;
import java.util.List;

public class MaxLength {
	public static int maxLength(List<String> arr) {
        List<Integer> len=new ArrayList<>();
        List<Integer> length=new ArrayList<>();
        List<String> perm=new ArrayList<>();
        List<String> s1=new ArrayList<>();
        String s="",ss="";
        String prev="";
        String st="",str="";
        int max=0;
        if(arr.size()==1){
            return arr.get(0).length();
        }
    	//["ab","cd","cde","cdef","efg","fgh","abxyz"]
        
//        for(int i=2;i<arr.size();i++){
//        	s=arr.get(i);
//        	ss=arr.get(i);
//            for(int j=0;j<arr.size();j++){
//                if(i!=j){
//                	st=ss+arr.get(j);
//                	if(!containsDuplicate(st)) {
//                		ss=st;
//                		perm.add(st);
//                	}
//                	prev=s;
//                	s+=arr.get(j); //aabc, ad
//                    if(containsDuplicate(s)){
//                        s=prev;
//                    }
//                }
//            }
//            perm.add(s);
//            s="";
//        }
        List<String> result=listRecur(arr);
        
//        for(int i=0;i<perm.size();i++){
//            String test=perm.get(i);
//            if(!containsDuplicate(test)){
//                len.add(test.length());
//            }
//        }
        for(String s2 : result)
        	length.add(s2.length());
        if(len.size()!=0)
            max=length.stream().max((o1,o2)->(o1<o2)?-1:(o1>o2)?1:0).get();
        return max;
    }
    static List<String> listRecur(List<String> list){
    	
        String s="",st="";
        List<String> l=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        for(int i=0;i<list.size();i++){
        	s=list.get(i);
            for(int j=0;j<list.size();j++){
                if(i!=j){
                    st=s+list.get(j);
                    if(!containsDuplicate(st)){
                        l.add(st);
                    }
                }
            }
        }
        if(l.size()==0)
        	
        listRecur(l);
		return l;
    }
    static boolean containsDuplicate(String str){
        boolean duplicate=false;
        int a[]=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            a[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(a[i]!=0){
                if(a[i]>=2)
                    duplicate=true;
            }
        }
        if(duplicate)
            return true;
        else
            return false;
        //---------------------------------------------------------
           
    }
    public static void main(String[] args) {
    	List<String> arr=new ArrayList<>();
    	//{"un","iq","ue"}
/*
 * ["un","iq","ue"]
["cha","r","act","ers"]
["abcdefghijklmnopqrstuvwxyz"]
["a", "abc", "d", "de", "def"]
["jnfbyktlrqumowxd","mvhgcpxnjzrdei"]
["ab","cd","cde","cdef","efg","fgh","abxyz"]  cdefghabxyz
 */
    	arr.add("ab");
    	arr.add("cd");
    	arr.add("cde");
    	arr.add("cdef");
    	arr.add("efg");
    	arr.add("fgh");
    	arr.add("abxyz");
    	
		System.out.println(maxLength(arr));
	}
}
