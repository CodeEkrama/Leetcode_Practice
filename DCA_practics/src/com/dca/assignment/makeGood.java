package com.dca.assignment;

public class makeGood {
    public static String makeGood(String s) {
        if(s.length()<=1) return s;
        int first=0,sec=1;
        String res=s;
        return recurse(first,sec,res);
    }
    static String recurse(int first, int second, String result){
        if(second>=result.length()) return result;
        if(Math.max(result.toCharArray()[first],result.toCharArray()[second])-Math.min(result.toCharArray()[first],result.toCharArray()[second])==32) {
                result=result.substring(0,first)+result.substring(second+1); //cC
                first=-1;
                second=0;
            //1 
        }
        return recurse(first+1,second+1,result);
    }
    public static void main(String[] args) {
		System.out.println(makeGood("acA").length()==0 ? "Nothing" : makeGood("acA"));
	}
}
