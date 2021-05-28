package com.dca.assignment;

public class gcdOfStringsClass {
    public static String gcdOfStrings(String str1, String str2) {
        String s="";
        return isRepeating(str1,str2);
    }
    static String isRepeating(String s,String s2){
        String str="";
        String rep="";
        String rep2="";
        for(int i=0;i<s.length();i++){
            String ss=s.charAt(i)+"";
            if(!str.contains(ss))
                str+=ss;
            else if(ss.charAt(0)==str.charAt(i-1))
            	str+=ss;
            else
              break;
        }
        if(str.length()==0) return "";
        int l=s.length();
        if(l%str.length()!=0) return "";
        if(s2.length()%str.length()!=0) return "";
        for(int i=0;i<l/str.length();i++)
            rep+=str;
        for(int i=0;i<s2.length()/str.length();i++)
            rep2+=str;
        if(rep.equals(s) && rep2.equals(s2)) return str;
        return "";
    }
    public static void main(String[] args) {
    	/*"TAUXXTAUXXTAUXXTAUXXTAUXX"
"TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"*/
		System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX","TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
	}
}
