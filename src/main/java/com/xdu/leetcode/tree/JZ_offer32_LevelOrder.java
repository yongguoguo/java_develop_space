package com.xdu.leetcode.tree;
/**
 *
 */

import java.util.*;

public class JZ_offer32_LevelOrder {
    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        int[] res;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }
        //重点是将list数组转换成Integer数组

        Integer[] arr = list.toArray(new Integer[list.size()]);
        res = new int[arr.length];
        for(int i = 0; i < arr.length; i ++)
            res[i] = arr[i];
        return res;
    }
}
