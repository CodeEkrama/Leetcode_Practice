package com.dca.DFS;


class TreeNode {
	 int val;
	 TreeNode left;
	 TreeNode right;
	 TreeNode() {}
	 TreeNode(int val) { this.val = val; }
	 TreeNode(int val, TreeNode left, TreeNode right) {
	 this.val = val;
	 this.left = left;
	 this.right = right;
	 }
}
public class MaxDepth {
	public static int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        int maxlength=Math.max(left, right) + 1;
        return maxlength;
    }
	//[3,9,20,null,null,15,7]
	public static void main(String[] args) {
		TreeNode root=new TreeNode(3,new TreeNode(9),new TreeNode(20));
		System.out.println(root.val+"    "+root.left.val+"   "+root.right.val);
		root.right=new TreeNode(20,new TreeNode(15),new TreeNode(7));
		System.out.println(root.right.val+"    "+root.right.left.val+"   "+root.right.right.val);
		root.left=null;
		System.out.println(maxDepth(root));
	}
}
