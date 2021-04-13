package com.xdu.leetcode.tree;

/**
 * 搜素二叉树的最近祖先问题
 * 由于是二叉搜索树所以可以使用迭代的方式进行
 *
 *同样也能使用递归方式，比普通的二叉树要简单
 *
 * public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
 *         if(root.val < p.val && root.val < q.val)
 *             return lowestCommonAncestor(root.right, p, q);
 *         if(root.val > p.val && root.val > q.val)
 *             return lowestCommonAncestor(root.left, p, q);
 *         return root;
 *     }
 *
 */
public class LowestCommonAncestor_2 {
//迭代的方式进行树的遍历

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null) {
            if(root.val < p.val && root.val < q.val) // p,q 都在 root 的右子树中
                root = root.right; // 遍历至右子节点
            else if(root.val > p.val && root.val > q.val) // p,q 都在 root 的左子树中
                root = root.left; // 遍历至左子节点
            else break;
        }
        return root;
    }




}
