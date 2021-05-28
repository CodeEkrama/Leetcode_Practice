package com.dca.assignment;

public class palindromeCheck {
	public static boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        String check="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isDigit(c) || Character.isLetter(c)){
                check+=c;
            }
        }
        //got the alphanumeric string check
        if(isPalindromeString(check)){
            return true;
        }
        else{
            return false;
        }
    }
    static boolean isPalindromeString(String s){
        int l=s.length();
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        if(l%2==0) {
            s1.append(s.substring(0,l/2));
            s2.append(s.substring(l/2,l));
        }
        else {
        	s1.append(s.substring(0,l/2));
            s2.append(s.substring(l/2+1,l));
        }
        s2.reverse();
        if(s1.compareTo(s2)==0 || s1.toString().equalsIgnoreCase(s2.toString())){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
		System.out.println(isPalindrome("ab.. , , a"));
	}
}
