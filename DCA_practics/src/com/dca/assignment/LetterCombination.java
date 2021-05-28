package com.dca.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {
    public static List<String> letterCombinations(String digits) {
        Map<String,String> map=new HashMap<>();
        if(digits.length()==0)
            return new ArrayList<String>();
        
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        
        List<String> res=new ArrayList<>();
        List<String> alpha=new ArrayList<>();
        for(int i=0;i<digits.length();i++){
            String s1=map.get(digits.charAt(i)+"");
            alpha.add(s1);
        }
        //"abc" "mno" "def" "pqrs"
        String s="";
        if(alpha.size()==1)
        {
            for(char c : alpha.get(0).toCharArray()){
                res.add(c+"");
            }
            return res;
        }
            String ss1[]=alpha.get(0).split("");   //a,b,c
            String ss2[]=alpha.get(1).split(""); //d,e,f
            for(int j=0;j<ss1.length;j++){
                for(int k=0;k<ss2.length;k++){
                    s=ss1[j]+ss2[k];
                    if(alpha.size()>2){
                        String ss3[]=alpha.get(2).split("");
                        for(int l=0;l<ss3.length;l++){
                            s+=ss3[l];
                            if(alpha.size()>3){
                                String ss4[]=alpha.get(3).split("");
                                for(int m=0;m<ss4.length;m++){
                                    s+=ss4[m];
                                    res.add(s);
                                }
                            }
                            else
                                res.add(s);
                        }
                    }
                    else
                        res.add(s);
                }
                
            }
        return res;
    }
    public static void main(String[] args) {
		String d="23";
		System.out.println(letterCombinations(d));
	}
}
