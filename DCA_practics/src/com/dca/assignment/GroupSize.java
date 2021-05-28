package com.dca.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupSize {
	 public static boolean hasGroupsSizeX(int[] deck) {
	        //each grp has X cards
	        //all cards in each grp has same cards
	        Arrays.sort(deck);
	        int e1=0,e2=0;
	        int primes[]=new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};        
	        List<Integer> trimmed=new ArrayList<>();
	        List<Integer> ee=new ArrayList<>();
	        boolean error=false;
	        int index[]=new int[10000];
	        for(int i=0;i<deck.length;i++){
	            index[deck[i]]++;
	        }
	        for(int i=0;i<index.length;i++){
	            if(index[i]!=0){
	                trimmed.add(index[i]);
	            }
	        }
	        if(trimmed.size()==1 && ( trimmed.get(0)%2==0 ||trimmed.get(0)%3==0))
	            return true;
	        else if(trimmed.size()==1 && ( trimmed.get(0)%2!=0 ||trimmed.get(0)%3!=0))
	            return false;
	        if(trimmed.size()>=2){
	             int max=trimmed.stream().max((o1,o2)->(o1<o2)?-1:(o1>o2)?1:0).get();
	        	for(int i=0;i<max;i++) {	
	            for(Integer element: trimmed){
	                if(element%primes[i]==0)
	                    e1++;
	            }
	            ee.add(e1);
	            e1=0;
	        	}
	            if(ee.contains(trimmed.size()))
	                return true;
	        }
	        return false;
	    }
	    static boolean sameElements(List<Integer> a){
	        int c=0;
	        for(int i=0;i<a.size();i++){
	            if(i+1<a.size() && a.get(i)==a.get(i+1)){
	                c++;
	            }
	        }
	        if(c==a.size()-1)
	            return true;
	        else
	            return false;
	    }
	    public static void main(String[] args) {
	    	//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
	    	//[1,1,1,1,2,2,2,2,2,2]
	    	//[0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,4,4,5,5,5,5,5,5,6,6,6,6,6,7,7,8,8,8,9,10,11,12]
			int d[]=new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,4,4,5,5,5,5,5,5,6,6,6,6,6,7,7,8,8,8,9,10,11,12};
			System.out.println(hasGroupsSizeX(d));
		}
}
