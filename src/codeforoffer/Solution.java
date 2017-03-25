package codeforoffer;

import hair.RightHair;
import sun.reflect.generics.tree.Tree;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.net.SocketPermission;

/**
 * Created by 羊荣毅_L on 2017/3/21.
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度
 */
public class Solution {
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    private TreeNode root;

    public void insert(TreeNode node) {
        if (root == null) {
            root = node;
        } else {
            TreeNode treeNode = root;
            TreeNode father = null;
            while (treeNode != null) {
                if (node.val > root.val) {
                    father = treeNode;
                    treeNode = treeNode.right;
                } else if (node.val < root.val) {
                    father = treeNode;
                    treeNode = treeNode.left;
                }
            }
            if (node.val > father.val) {
                father.right = node;
            } else
                father.left = node;
        }
    }

    public void insert(int val) {
        TreeNode node = new TreeNode(val);
        if (root == null) {
            root = node;
        } else {
            TreeNode treeNode = root;
            TreeNode father = null;
            while (treeNode != null) {
                if (treeNode.right != null && treeNode.left != null) {
                    father = treeNode;
                    treeNode = treeNode.right;
                } else if (treeNode.right == null || treeNode.left == null) {
                    return;
                }
            }
            if (father.right == null) {
                father.right = node;
            } else father.left = node;
        }
    }

    public void printAll(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            printAll(root.left);
            printAll(root.right);
        }
    }

    //  输入一棵二叉树，判断是否为平衡二叉树
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) return true;
        int rightHeight = TreeDepth(root.right);
        int leftHeight = TreeDepth(root.left);
        if (Math.abs(rightHeight - leftHeight) <= 1)
            return true;
        return false;
    }

    //  输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度
    public int TreeDepth(TreeNode root) {
        if (root == null) return 0;
        int rightHeight = TreeDepth(root.right);
        int leftHeight = TreeDepth(root.left);
        return rightHeight > leftHeight ? rightHeight + 1 : leftHeight + 1;
    }

    public ListNode getTreeLevel(TreeNode root, int dep) {

        if (root == null && dep <= 0) {
            return null;
        }
        ListNode rootLs = new ListNode(root.val);
        if (dep == 1) {
            return rootLs;
        }
        ListNode p = rootLs;
        if (root.left != null) {
            ListNode left = getTreeLevel(root.left, dep - 1);
            p.next = left;
            while (p.next != null) {
                p = p.next;
            }

        }
        if (root.right != null) {
            ListNode right = getTreeLevel(root.right, dep - 1);
            p.next = right;
            while (p.next != null) {
                p = p.next;
            }
        }
        if (dep>1){
            System.out.println(rootLs.val);
        }else
            System.out.println(rootLs.next.val);
        return rootLs.next;

    }

    public static void main(String[] args) {
        Solution tree = new Solution();
//        for (int i = 0; i < 15; i++) {
////            TreeNode node = new TreeNode(i + 1);
//            tree.insert(i);
//        }
        tree.insert(new TreeNode(7));
        tree.insert(new TreeNode(2));
        tree.insert(new TreeNode(3));
        tree.insert(new TreeNode(5));
        tree.insert(new TreeNode(8));
        tree.insert(new TreeNode(77));
        tree.insert(new TreeNode(10));
        tree.insert(new TreeNode(14));
        tree.insert(new TreeNode(24));
        tree.insert(new TreeNode(34));
        tree.insert(new TreeNode(54));
        tree.insert(new TreeNode(27));
        tree.insert(new TreeNode(45));
        tree.insert(new TreeNode(74));
        tree.insert(new TreeNode(64));
        tree.insert(new TreeNode(52));
        tree.insert(new TreeNode(38));
        tree.insert(new TreeNode(97));
        tree.insert(new TreeNode(35));
        tree.insert(new TreeNode(40));
        tree.printAll(tree.root);
        System.out.println();
        System.out.println("***************************************");
        System.out.println(tree.TreeDepth(tree.root));
        System.out.println("***************************************");
        System.out.print(tree.IsBalanced_Solution(tree.root));
        System.out.println("***************************************");
        tree.getTreeLevel(tree.root,4);
    }
}