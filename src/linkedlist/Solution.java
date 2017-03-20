package linkedlist;

/**
 * Created by 羊荣毅_L on 2017/3/20.
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class Solution {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    private ListNode root;
    private int size;

    public void put(int val) {
        insert(size - 1, val);
    }

    public void printAll() {
        ListNode p = root;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
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

    public ListNode deleteDuplication(ListNode pHead) {
        pHead = root;
        ListNode p = root;
        p = p.next;
        p = p.next;
        while (p != null) {
            if (pHead.next.val == p.val) {
                pHead.next = p;
                p = p.next;
                if (pHead.next.val != p.val){
                    pHead.next = p;
                    p = p.next;
                }
            } else {
                p = p.next;
                pHead = pHead.next;
            }
        }
        return pHead;
    }
    public ListNode get(ListNode pHead){
        if (pHead == null) return null;
        ListNode p = pHead;
        ListNode root = new ListNode(0);
        ListNode pre = root;
        root.next = pHead;
        boolean flag = false;
        while (p != null) {
            ListNode q = p.next;
            if (q == null) break;
            if (q.val == p.val) {
                while (q != null && q.val == p.val) {
                    q = q.next;
                }
                pre.next = q;
                p = q;
            } else {
                if (!flag) {
                    root.next = p;
                    flag = true;
                }
                pre = p;
                p = q;
            }
        }
        return root.next;
    }


    public static void main(String[] args) {
        Solution list=new Solution();
        list.put(1);
        list.put(1);
        list.put(1);
        list.put(3);
        list.put(3);
        list.put(4);
        list.put(4);
        list.put(5);
        list.printAll();
        System.out.println("*************************************");
          ListNode returnroot=list.deleteDuplication(new ListNode(0));
        System.out.println("根节点是:");
        System.out.println(returnroot.val);
        System.out.println("1 2 5");
        list.printAll();
    }

}


