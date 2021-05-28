package com.dca.DFS;
/*
 * Time complexity : \mathcal{O}(N)O(N), where N is a number of nodes in the tree,
 *  since one visits each node exactly once.

Space complexity : \mathcal{O}(\log(N))O(log(N)) in the best case of completely balanced tree 
and \mathcal{O}(N)O(N) in the worst case of completely unbalanced tree, to keep a recursion stack.

 */
public class TreeEquality {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p ==null && q ==null) return true;
        if(p ==null || q ==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.right,q.right) && isSameTree(p.left,q.left);
        
    }
    public static boolean isSymmetric(TreeNode root) {

        if(checkEqual(root.left,root.right))
            return true;
        else return false;
    }
    static boolean checkEqual(TreeNode a, TreeNode b){
        if(a==null && b==null) return true;
        if(a==null || b==null) return false;
        return (a.val==b.val) && checkEqual(a.left,b.right) && checkEqual(a.right,b.left);
    }
    public static void main(String[] args) {
		TreeNode p=new TreeNode(1,new TreeNode(2),new TreeNode(4));
		TreeNode q=new TreeNode(1,new TreeNode(2),new TreeNode(4));
		isSameTree(p,q);
		System.out.println(isSameTree(p,q));
		System.out.println(isSymmetric(p));
	}
}
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