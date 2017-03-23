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
            if (father.right==null){
                father.right=node;
            }else father.left=node;
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

    public static void main(String[] args) {
        Solution tree = new Solution();
        for (int i = 0; i < 15; i++) {
//            TreeNode node = new TreeNode(i + 1);
            tree.insert(i);
        }
//        tree.insert(new TreeNode(7));
//        tree.insert(new TreeNode(2));
//        tree.insert(new TreeNode(3));
//        tree.insert(new TreeNode(5));
//        tree.insert(new TreeNode(8));
//        tree.insert(new TreeNode(77));
//        tree.insert(new TreeNode(10));
        tree.printAll(tree.root);
        System.out.println();
        System.out.println("***************************************");
        System.out.println(tree.TreeDepth(tree.root));
        System.out.println("***************************************");
        System.out.print(tree.IsBalanced_Solution(tree.root));
    }
}