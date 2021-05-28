package com.dca.assignment;

import java.util.HashMap;
import java.util.Stack;

public class validParenthesis {
    public static boolean isValid(String s) {
    	String[] each=s.split("");
        HashMap<String,String> map=new HashMap<>();
        map.put("(", ")");
        map.put("[", "]");
        map.put("{", "}");
        Stack<String> stack=new Stack<>();
        for(int i=0;i<each.length;i++){
            
                if(map.keySet().contains(each[i])){
                	stack.push(each[i]);
                }
                else if(map.values().contains(each[i])) {
                	if( !stack.empty() && (map.get(stack.peek()).compareTo(each[i])==0)){
                        stack.pop();
                }
                	else return false;
                }
        }
     return  stack.empty();  
    }
    public static void main(String[] args) {
		System.out.println(isValid("{{{{[[[[}}}}]]]]"));
	}
}
