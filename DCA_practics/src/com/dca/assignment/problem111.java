package com.dca.assignment;

public class problem111 {
    public static String reformat(String s) {
        //lower letters and digits
        //no letter is followed by another letter 
        //no two digits are adjecent
        String d="",c="",res="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)))
                d+=s.charAt(i);
            if(Character.isLetter(s.charAt(i)))
                c+=s.charAt(i);
        }
        //digits and chars seperated
        int ld=d.length();
        int lc=c.length();
        String start="",end="";
        if(ld>lc) {
            start=d;
            end=c;
        }
        else if(ld<lc){
            start=c;
            end=d;
        }
        else{
            start=d;
            end=c;
        }
        if(ld==0|| lc==0) return "";
        int i1=0,i2=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0 && i1<start.length()){
                res+=start.charAt(i1);
                i1++;
            }
            else if(i%2==1 && i2<end.length()){
                res+=end.charAt(i2);
                i2++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
		System.out.println(reformat("covid2019"));
	}
}
