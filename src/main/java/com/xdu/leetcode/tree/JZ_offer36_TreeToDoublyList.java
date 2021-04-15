package com.xdu.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。
 * 要求不能创建任何新的节点，只能调整树中节点指针的指向。
 * 难度中等
 *还是考虑第一个root节点应该怎么操作，思考：是否是如果是先序遍历时，则操作根节点的问题
 * 如果是中序遍历则操作第一个节点
 *
 *
 * 同时还有一种暴力的方式，将数据全部中序遍历出来，然后存在数组中
 *
 */
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}
public class JZ_offer36_TreeToDoublyList {

        private Node head;
        private Node preNode;
    List<Node> list = new ArrayList<>();
        public Node treeToDoublyList(Node root) {
            if (root == null) {
                return null;
            }

            dfs(root);
        /*
            后续处理：
                让 head的左子指针 指向 最后一个节点
                让 最后一个节点的右子指针 指向 head
            形成闭环
        */
            //preNode递归完成之后，会指向最后一个节点
            //同时head指向第一个节点

            head.left = preNode;
            preNode.right = head;
            return head;
        }

        private void dfs(Node curRoot) {
            if (curRoot == null) {
                return ;
            }

            dfs(curRoot.left);
        /*
            判断当前是否是第一个节点(最小节点)：
                若是，则让 head 指向 当前节点
                若不是，则让 前驱节点的右子指针 指向 当前节点
        */
            if (preNode == null) {
                head = curRoot;
            } else {
                preNode.right = curRoot;
            }
            curRoot.left = preNode; // 让 当前节点的左子指针 指向 前驱节点
            preNode = curRoot;  // 让 前驱节点 指向 当前节点
            dfs(curRoot.right);

        }
        ArrayList<Node> inorder (Node root){


            if(root == null){
                return new ArrayList<>();
            }
            inorder(root.left);
            list.add(root);
            inorder(root.right);
            return (ArrayList<Node>) list;
        }
    public Node treeToDoublyList1(Node root) {
            if(root == null){
                return root;
            }
        ArrayList<Node> inorder = this.inorder(root);
        head = inorder.get(0);
        preNode = inorder.get(inorder.size()-1);
        for(int i =0;i<inorder.size()-1;i++){
            inorder.get(i).right = inorder.get(i+1);
        }
        for (int j = inorder.size()-1;j>0;j--){
            inorder.get(j).left = inorder.get(j-1);
        }
        head.left = preNode;
        preNode.right = head;
        return head;
    }

    }






