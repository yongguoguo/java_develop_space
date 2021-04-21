package com.xdu.leetcode.tree;

/**
 * 剑指offer：二叉树的后续遍历验证
 * 难度：中等
 * 后序遍历的最后一个节点是根节点
 * 由搜索二叉树的特性得到：第一个大于根节点树为左右子树的分界点
 * 二叉树的特点：先判断二叉树为二叉搜索树，然后再判断左右子树为二叉搜索树
 *
 *
 *
 *
 *
 *
 */
public class JZ_offer33_VerifyPostorder {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder,0,postorder.length-1);
    }
   boolean recur(int[] postorder ,int start ,int end){
        //递归的终止条件：当所有节点判断完成

        if( start>=end){
            return true;
        }
        //通过二叉树的特性，拿到根节点的值

        int root = postorder[end];
        //需要计算左字树的节点
        int left = start;
        while (postorder[left]<postorder[end]) left++;
        //计算右子树的节点
        int right = left;
        while (postorder[right]>postorder[end]) right++;
        return right == end && recur(postorder,start,left-1)&&recur(postorder,left,right-1);
    }


}
