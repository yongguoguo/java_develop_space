package com.xdu.leetcode.tree;

/**
 *输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 难度：中等
 * 递归的解法：不要思考递归的细节，要想每个节点应该干嘛
 *
 * 思考根节点可以做什么：
 * 确定根节点的值，把根节点做出来，然后递归左右子树即可
 * 找到根节点是很简单的，前序遍历的第一个值preorder[0]就是根节点的值，
 * 关键在于如何通过根节点的值，将preorder和postorder数组划分成两半，构造根节点的左右子树？
 */
public class JZ_offer07_BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    TreeNode build(int[] preorder,int[] inorder,int prestart,int preend,int instart,int inend){
        if(prestart>preend){
            return null;
        }
        //根节点的值
        int rootval = preorder[prestart];
        //根节点在中序遍历中的值
        int index = 0;
        for(int i=0;i<inorder.length;i++) {
            if (inorder[i] == rootval) {
                index = i;
                break;
            }
        }

        TreeNode root = new TreeNode(rootval);
            /*递归时相当于在子树上进行同样的操作
            但是在子树上的索引需要重新进行计算   */
            int leftsize = index-instart;
            root.left = build(preorder,inorder,prestart+1,prestart+leftsize,instart,index-1);
            root.right = build(preorder,inorder,prestart+leftsize+1,preend,index+1,inend);
            return root;
        }



}
