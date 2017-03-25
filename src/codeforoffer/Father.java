package codeforoffer;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by 羊荣毅_L on 2017/3/23.
 * e二叉树
 */
public class Father {//提交记得把类名改为Main
    private ListNode root;
    private int size;

    /**
     * 链表
     */
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public void put(int val) {
        insert(size - 1, val);
    }

    public void insert(int index, int val) {
        if (root == null) {
            root = new ListNode(val);
            size = 1;
            return;
        }
        ListNode p = root;
        int i = 0;
        while (i < index) {
            p = p.next;
            i++;
        }
        if (p == null) return;
        ListNode node = new ListNode(val);
        ListNode next = p.next;
        p.next = node;
        node.next = next;
        size++;
    }

    /**
     * 树
     */
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public int checkTreeNode(TreeNode root) {
        int val = root.val;
        checkTreeNode(root.right);
        checkTreeNode(root.left);
        return val;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        while (scanner.hasNext()) {
            int node1 = scanner.nextInt();
            int node2 = scanner.nextInt();
            getFather(node1, node2);
        }
        scanner.close();
    }

    /**
     * 1
     * / \
     * 2   3
     * / \ / \
     * 4 5  6  7
     * /\ /\ /\ /\
     * 如上图所示，由正整数 1, 2, 3, ...组成了一棵无限大的二叉树。
     * 从某一个结点到根结点（编号是1的结点）都有一条唯一的路径，
     * 比如从5到根结点的路径是（5, 2, 1），从4到根结点的路径是（4, 2, 1），
     * 从根结点1到根结点的路径上只包含一个结点1，因此路径就是（1）。对于两个结点x和y，
     * 假设他们到根结点的路径分别是（x1, x2, ... ,1）和（y1, y2,...,1），那么必然存在两个正整数i和j，
     * 使得从xi 和yj 开始，有xi = yj，xi + 1 = yj + 1，xi + 2 = yj + 2，...
     * 现在的问题就是，给定x和y，要求他们的公共父节点，即xi（也就是 yj）。
     * <p>
     * 输入描述:
     * 输入包含多组数据，每组数据包含两个正整数x和y（1≤x, y≤2^31-1）。
     * <p>
     * 输出描述:
     * 对应每一组数据，输出一个正整数xi，即它们的首个公共父节点。
     */
    public static void getFather(int node1, int node2) {
        /*完全二叉树中当编号为连续正整数时子节点的编号除以2等于父节点编号
        * **/
        while (node1 != node2) {
            if (node1 > node2) {
                node1 /= 2;
            } else {
                node2 /= 2;
            }
        }
        System.out.println(node1);
    }

    /**
     * 对于一棵二叉树，请设计一个算法，创建含有某一深度上所有结点的链表。
     * 给定二叉树的根结点指针TreeNode* root，以及链表上结点的深度，
     * 请返回一个链表ListNode，代表该深度上所有结点的值，请按树上从左往右的顺序链接，
     * 保证深度不超过树的高度，树上结点的值为非负整数且不超过100000。
     */
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

        return rootLs.next;

    }
}
