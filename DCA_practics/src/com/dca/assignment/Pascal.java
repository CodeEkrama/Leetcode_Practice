package com.dca.assignment;

import java.util.ArrayList;
import java.util.List;

public class Pascal {
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> sublist=new ArrayList<>();
        int sum=0;
        if(numRows<=30 && numRows>=1){
            //valid numRows
            for(int i=0;i<numRows;i++){
                //row loop
            	if(i>1)
            		sublist.add(1);
                for(int j=0;j<=i;j++){ //each list creation
                    if(i==0||i==1)
                        sublist.add(1);
                    else if(j+1<i){
                        List<Integer> x=result.get(i-1);
                        sum=x.get(j)+x.get(j+1);
                        sublist.add(sum);
                        sum=0;
                    }
                }
                if(i>1)
                	sublist.add(1);
                result.add(sublist);
                
                sublist=new ArrayList<>(); //clears the list
                
            }
        }
        return result;
    }
	public static void main(String[] args) {
		System.out.println(generate(6));
	}
}
