package com.xdu.leetcode.tree;

import java.util.*;

/**
 * 剑指offer32：从上到下打印二叉树3
 *请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右到左的顺序打印，
 * 第三行再按照从左到右的顺序打印，其他行以此类推
 */
public class JZ_offer_32_LevelOrder3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> listsres = new ArrayList<>();
        //用来记录遍历到了那一层
        //int cout = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            //用双端队列来进行解决
            LinkedList<Integer> linkedList = new LinkedList<>();

            for(int i = queue.size(); i > 0; i--) {
                TreeNode poll = queue.poll();

                if(listsres.size()%2 == 0){
                    linkedList.addLast(poll.val);
                }
                else {
                    linkedList.addFirst(poll.val);
                }

                if(poll.left != null) queue.add(poll.left);
                if(poll.right != null) queue.add(poll.right);
            }
            listsres.add(linkedList);
        }

        return listsres;



    }
    public List<List<Integer>> levelOrder1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null) queue.add(root);
        while(!queue.isEmpty()) {
            LinkedList<Integer> tmp = new LinkedList<>();
            for(int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if(res.size() % 2 == 0) tmp.addLast(node.val); // 偶数层 -> 队列头部
                else tmp.addFirst(node.val); // 奇数层 -> 队列尾部
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            res.add(tmp);
        }
        return res;
    }


}
