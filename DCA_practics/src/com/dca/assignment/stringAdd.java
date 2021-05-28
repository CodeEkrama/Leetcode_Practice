package com.dca.assignment;

public class stringAdd {
	public static int[] plusOne(int[] digits) {
	String s="";
    for(int n: digits){
        s+=n;
    }
    int carry=0;
    int sum=0;
    int val=0;
    StringBuilder r=new StringBuilder();
    for(int j=s.length()-1;j>=0;j--){
        int c=Integer.parseInt(s.charAt(j)+"");
        if(j==s.length()-1)
        sum=c+1+carry;
        else
            sum=c+carry;
        carry=sum/10;
        val=sum%10;
        r.append(val);
        if(j==0) {
        	r.append(carry);
        }
    }
    r.reverse();
    String result=r.toString();
    int a[]=new int[result.length()];
    for(int i=0;i<result.length();i++){
        a[i]=Integer.parseInt(result.charAt(i)+"");
    }
    return a;
}
	public static void main(String[] args) {
		int a[]=new int[] {9};
		int[] b=plusOne(a);
		for(int ele:b) {
			System.out.println(ele);
		}
		
	}
}