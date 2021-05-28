package com.dca.assignment;

public class stringAddition {
	public static String addStrings(String num1, String num2) {
        String final1="";
        int l=0;
        int ln1=num1.length();
        int ln2=num2.length();
        if(ln1>=ln2){
            l=num1.length();
            for(int j=0;j<ln1-ln2;j++){
                num2="0"+num2;
            }
        }
        else
        {
            l=num2.length();
            for(int j=0;j<ln2-ln1;j++){
                num1="0"+num1;
            }
        }
        int sum=0,carry=0,right=0;
        
        String[] a=num1.split("");
        String[] b=num2.split("");
        for(int i=l-1;i>=0;i--){
            sum=Integer.parseInt(a[i])+Integer.parseInt(b[i])+carry;
            right=sum%10;
            carry=(sum-right)/10;
            if(i!=0)
            final1=right+final1;
            else{
                final1=sum+final1;
            }
        }
        return final1;
    }
	public static void main(String[] args) {
		System.out.println(addStrings("9133","111266"));
	}
}
