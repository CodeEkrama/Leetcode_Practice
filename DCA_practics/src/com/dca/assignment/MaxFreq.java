package com.dca.assignment;

import java.util.ArrayList;
import java.util.List;

public class MaxFreq {
	 public static String mostCommonWord(String paragraph, String[] banned) {
	        List<Integer> frequencies=new ArrayList<>();
	        paragraph=paragraph.toLowerCase();
	        //extract words
	        String word="";
	        List<String> wordList=new ArrayList<>();
	        for(int i=0;i<paragraph.length();i++){
	            char c=paragraph.charAt(i);
	            if(i==paragraph.length()-1)
	            {
	            	if(!isPresentInBanned(word,banned) && !word.equals(""))
	                    wordList.add(word);
	                word="";
	            }
	            if(Character.isLetter(c)){
	                word+=c;
	            }
	            else{
	                if(!isPresentInBanned(word,banned) && !word.equals(""))
	                    wordList.add(word);
	                word="";
	            }
	        }
	        //wordList contains only those words which are not banned
	        for(int i=0;i<wordList.size();i++){
	            int f=calculateFrequency(wordList.get(i),wordList);
	            frequencies.add(f);
	            f=0;
	        }
	        if(frequencies.isEmpty())
	            return paragraph;
	        //wordList --> frequency
	        //finding max freq and storing index
	        
	        int maxFreq=frequencies.get(0);
	        int maxIndex=0;
	        for(int i=0;i<frequencies.size();i++){
	            if(maxFreq<frequencies.get(i)){
	                maxFreq=frequencies.get(i);
	                maxIndex=i;
	            }
	        }
	        //returning the word at maxIndex
	        return wordList.get(maxIndex);
	    }
	    
	    //checks if a word is present in banned string
	    
	   static boolean isPresentInBanned(String word,String[] banned){
	        boolean flag=false;
	        for(int i=0;i<banned.length;i++){
	            if(banned[i].equals(word))
	                flag=true;
	        }
	        return flag;
	    }
	    //calculates freq of any word
	   static int calculateFrequency(String word,List<String> wordList){
	        int count=0;
	        for(int i=0;i<wordList.size();i++){
	            if(wordList.get(i).equals(word))
	                count++;
	        }
	        return count;
	    }
	    /*
"Bob. hIt, baLl"
["bob", "hit"]
	     */
	    public static void main(String[] args) {
	    	String ban[]=new String[] {"bob", "hit"};
	    	String para="Bob. hIt, baLl";
			System.out.println(mostCommonWord(para,ban));
		}
}
