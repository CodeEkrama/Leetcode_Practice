package com.dca.assignment;

import java.util.*;

public class PascalII {
    public static List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> temp=new ArrayList<List<Integer>>();
        List<Integer> res=new ArrayList<>();
        res.add(1);
        temp.add(res);
        if(rowIndex==0) return res;
        res=new ArrayList<>();
        res.add(1);
        res.add(1);
        temp.add(res);
        if(rowIndex==1) return res;
        for(int i=2;i<=rowIndex;i++){ //for 3
            res=new ArrayList<>();
            List<Integer> t=temp.get(i-1); //1 1
            res.add(1);   //1
            int l=t.size();
            for(int j=0;j<t.size();j++){  //2 times
                if(j+1<t.size())
                    res.add(t.get(j)+t.get(j+1));
            }
            res.add(1);
            temp.add(res);
                
            }
        return temp.get(temp.size()-1);
    }
    public static void main(String[] args) {
		System.out.println(getRow(3));
	}
}
