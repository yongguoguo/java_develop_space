package com.xdu.leetcode.tree;

/**
 * 剑指offer 28：对称二叉树问题
 * 难度：简单
 */
public class JZ_offer28_IsSymmetric {
    /*public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        else return recur(root.left,root.right);


    }
     boolean recur(TreeNode lefttree,TreeNode righttree){
        if(lefttree.val != righttree.val||lefttree == null||righttree == null)
            return false;
        if (lefttree.left.val == righttree.right.val&&lefttree.right.val == righttree.left.val)
            return true;
       return recur(lefttree.left,righttree.right);
    }*/
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : recur(root.left, root.right);
    }
    boolean recur(TreeNode L, TreeNode R) {
        if(L == null && R == null) return true;
        if(L == null || R == null || L.val != R.val) return false;
        return recur(L.left, R.right) && recur(L.right, R.left);
    }



}
