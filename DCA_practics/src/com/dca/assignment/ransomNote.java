package com.dca.assignment;

public class ransomNote {
	public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.compareTo("")==0 && magazine.compareTo("")==0){
            return true;
        }
        else if(ransomNote.compareTo("")==0){
            return true;
        }
        else if(magazine.compareTo("")==0){
            return false;
        }
        else{
        String each[]=ransomNote.split("");
        int flag=0;
        for(int i=0;i<each.length;i++){
            if(magazine.contains(each[i])){
                magazine=removeCharacter(magazine,each[i]);
                flag++;
            }
        }
        if(flag!=ransomNote.length()){
            return false;
        }
        else{
            return true;
        }
        }
    }
    static String removeCharacter(String s,String c){
        String r="";
        int count=0;
        
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)+"").compareTo(c)==0 && count<1){
                count++; 
            }
            else{
                r+=s.charAt(i);
            }
        }
        
        return r;
    }
	    public static void main(String[] args) {
	    	String a="abababa";
			String b="abababac";
	    	System.out.println(canConstruct(a,b));
		}
}
