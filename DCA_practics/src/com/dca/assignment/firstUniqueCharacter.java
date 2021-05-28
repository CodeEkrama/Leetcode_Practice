package com.dca.assignment;

public class firstUniqueCharacter {
	public static int firstUniqChar(String s) {
        int out=-1;
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            count=0;
            for(int j=0;j<s.length();j++){
                if(i!=j){
                    if(c==s.charAt(j)){
                        count++;
                    }
                }
            }
            if(count==0){
                out=i;
                break;
            }
            else{
                continue;
            }
        }
        return out;
    }
	public static void main(String[] args) {
		System.out.println(firstUniqChar("loveleetcode"));
	}
}
