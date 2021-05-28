package com.dca.assignment;
import java.util.*;
public class ReorderLogs {
	public static String[] reorderLogFiles(String[] logs) {
        List<String> left=new ArrayList<>();
        List<String> right=new ArrayList<>();
        for(int i=0;i<logs.length;i++){
            String s=logs[i];
            String each[]=s.split(" ");
            //each[0] is identifier

            if(Character.isDigit(each[1].toCharArray()[0])){
                //digit
                right.add(s);
            }
            else{
                //alphabetical
                //contents are not same
                    String a[]=new String[each.length-1];
                    for(int j=1;j<each.length;j++){
                        a[j-1]=each[j];
                    } //only logs
                    if(contentSame(a)){
                        Arrays.sort(each);
                    }
                else{
                    Arrays.sort(a);
                    for(int j=0;j<a.length;j++)
                        each[j+1]=a[j];
                }
                    String x="";
                    for(String e: each)
                    	x+=e+" ";
                    left.add(x.trim());
            }    
        }
        String[] result=new String[logs.length];
        for(int i=0;i<result.length;i++){
            if(i<left.size())
                result[i]=left.get(i);
            else
                result[i]=right.get(i-left.size());
        }
        return result;
    }
	static boolean contentSame(String a[]){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(i+1<a.length && a[i].equals(a[i+1]))
                count++;
        }
        return count==a.length-1;
    }
	public static void main(String[] args) {
		String s[]=new String[] {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
		String []res=reorderLogFiles(s);
		for(String ele: res) {
			System.out.println(ele);
		}
		
	}
}
