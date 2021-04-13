package com.xdu.leetcode.tree;

/**
 * 难度：easy
 *
 * 判断树是不是平衡二叉树
 *思路：平衡二叉树的概念，左右字数的深度不超过-1，所以可以想到之前做的求树的深度的问题，
 */
public class JZ_offer55_Isbanced {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(Math.abs(getHigh(root.left)-getHigh(root.right))<=1){
            return isBalanced(root.left)&&isBalanced(root.right);
        }
        return false;
    }

    private int getHigh(TreeNode root){
        if(root==null) return 0;
        return Math.max(getHigh(root.left),getHigh(root.right))+1;
    }

}
