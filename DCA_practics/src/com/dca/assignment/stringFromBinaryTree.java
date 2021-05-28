package com.dca.assignment;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class stringFromBinaryTree {
    public String tree2str(TreeNode t) {
        if (t == null)
            return "";
        Stack< TreeNode > stack = new Stack < > ();
        stack.push(t);
        Set< TreeNode > visited = new HashSet<> ();
        StringBuilder s = new StringBuilder();
        while (!stack.isEmpty()) {
            t = stack.peek();
            if (visited.contains(t)) {
                stack.pop();
                s.append(")");
            } else {
                visited.add(t);
                s.append("(" + t.val);
                if (t.left == null && t.right != null)
                    s.append("()");
                if (t.right != null)
                    stack.push(t.right);
                if (t.left != null)
                    stack.push(t.left);
            }
        }
        return s.substring(1, s.length() - 1);
    }
	    public static void main(String[] args) {
	    	stringFromBinaryTree sbt=new stringFromBinaryTree();
	    	String result=sbt.tree2str(null);
	    	System.out.println(result);
		}
	
}
