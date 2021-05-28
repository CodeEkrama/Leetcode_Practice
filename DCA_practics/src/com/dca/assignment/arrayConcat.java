package com.dca.assignment;

import java.util.ArrayList;
import java.util.HashSet;

public class arrayConcat {
	 public static boolean canFormArray(int[] arr, int[][] pieces) {
	        int l=arr.length;
	        int counts=0;
	        String s1="",s2="";
	        HashSet<Integer> set=new HashSet<>();
	        ArrayList<Integer> list=new ArrayList<>();
	        String ss="";
	        
	        for(int ele:arr){
	            list.add(ele);
	            set.add(ele);
	            ss+=ele+"@@";
	        }
	        for(int i=0;i<pieces.length;i++){
	            int a[]=pieces[i];
	            if(a.length==1){ //index 0 is valid
	                for(int j=0;j<arr.length;j++){
	                    if(set.contains(a[0])){
	                        set.remove(a[0]);
	                    }
	                }
	            }
	        }
	        if(set.isEmpty())
	            return true;
	        else
	        {

	        for(int i=0;i<pieces.length;i++){
	            int a1[]=pieces[i];
	            int ll=a1.length;
	            if(ll!=1){ 
	                if(counts==0){
	                for(int j=0;j<arr.length;j++){
	                    if(set.contains(arr[j])){
	                        s1+=arr[j]+"@@";
	                    }
	                }
	                counts++;
	                }
	                s2="";
	                for(int j=0;j<ll;j++){
	                    s2+=a1[j]+"@@";
	                }
	                if(s1.length()>=s2.length() && s1.contains(s2) && ss.contains(s2)){
	                    //remove s2 from s1 and check if s1 is empty?
	                    //if yes then return true
	                    //else
	                    //check if s1.length()>=s2.length()
	                    //true? -> 
	                    int ind=s1.indexOf(s2);
	                //1, (2,3,5) ,5 
	                s1=s1.substring(0,ind)+s1.substring(ind+s2.length());
	                if(s1.equals(""))
	                    return true;
	                }
	            }
	        }
	    }
	return false;
	}
	    //array of same length
	    static boolean compare(int a[],int b[]){
	        int count=0;
	        for(int i=0;i<a.length;i++){
	            if(a[i]==b[i])
	                count++;
	        }
	        if(count==a.length)
	            return true;
	        else
	            return false;
	    }
	    public static void main(String[] args) {
	    	 int []arr = new int[] {26,21,74,64,13,29,46,56,38,11,71,51,43,99,80,25,91,27,17,7,82,70,34,87,48,66,2,77,79,84,41,97,42,18,92,44,20,30,73,93,22,76,95,52,19,6,78,8,14,12,58,15,86,4,9,32,90,75,60,57,50,39,3,1,16,24,89,72,49,40,37,55,36,69,5,83,85,67,88,98,54,65,10,68,31,62,45,63,100,61,96,23,81,33}; 
	    	 int [][]pieces = new int[][] {{14},{58},{96},{82,70,34,87},{51},{45},{44},{38,11,71},{72},{78},{63},{99},{17},{7},{1},{74,64},{33},{69},{50},{18,92},{61},{49,40},{65},{37,55},{13},{43},{42},{5,83},{8},{4},{10},{77,79},{66,2},{90},{86},{75},{39,3},{6},{9},{36},{48},{85},{100},{15},{19},{76},{68},{12},{26,21},{29,46},{60,57},{88,98,54},{30},{24},{31,62},{84},{56},{73,93},{97},{81},{95,52},{23},{22},{89},{41},{80,25,91,27},{20},{32},{67},{16}};
	    	 System.out.println(canFormArray(arr,pieces));
		}
}
