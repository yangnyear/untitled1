package linkedlist;


import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.org.apache.bcel.internal.generic.NEW;
import treetext.Node;

import java.util.LinkedList;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by 羊荣毅_L on 2017/3/18.
 */
public class MyList {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;
    private int size;

    public void put(int val) {
        insert(size - 1, val);
    }

    public void insert(int index, int val) {
        if (root == null) {
            root = new Node(val);
            size = 1;
            return;
        }
        Node p = root;
        int i = 0;
        while (i < index) {
            p = p.next;
            i++;
        }
        if (p == null) return;
        Node node = new Node(val);
        Node next = p.next;
        p.next = node;
        node.next = next;
        size++;
    }


    public void printAll() {
        Node p = root;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    public boolean contans(int a) {
        Node p = root;
        while (p != null) {
            if (p.val != a) {
                p = p.next;
            } else if (p.val == a) {
                return true;
            }
        }
        return false;
    }

    public static void intersection(MyList listA, MyList listB) {
        System.out.println("开始");
        Node a = listA.root;
        Node b=listB.root;
        int maxOfA=0,maxofB=0;
        int j=0,k=0;
        int[] valusesOfA=new int[listA.size];
        int[] valusesOfB=new int[listB.size];
        while (a != null) {
            valusesOfA[j]=a.val;
            j++;
            if (a.next==null) maxOfA=a.val;
            a = a.next;

        }
        System.out.println("a完成");
        while (b != null) {
            valusesOfB[k]=b.val;
            k++;
            if (b.next==null) maxofB=b.val;
            b = b.next;

        }
        System.out.println("b完成");
        int max=maxOfA>maxofB? maxOfA:maxofB;
        int[] attr=new int[max];
        for (int i = 0; i < max; i++) {
           attr[i]=0;
            System.out.print(attr[i]);
        }
        System.out.println("数组创建完成");
        a = listA.root;
        b=listB.root;
//        while (a!=null){
//            while (b!=null){
//                if (a.val== b.val){
//                    attr[a.val]=1;
//                }
//            }
//        }
        for (int i = 0; i < valusesOfA.length; i++) {
            for (int l = 0; l < valusesOfB.length; l++) {
                if (valusesOfA[i]==valusesOfB[l])
                    attr[valusesOfA[i]]=1;
            }
        }
        System.out.println("交集是:");
        for (int i = 0; i < max; i++) {
            if (attr[i]==1){
                System.out.print(" "+i);
            }
        }

    }

    public static void main(String[] args) {
        MyList list = new MyList();
        MyList list2 = new MyList();
        for (int i = 0; i < 10; i++) {
            list.put(i);
            list2.put(i+5);
        }
        list.printAll();
        list.insert(2, 666);
        list.printAll();
        System.out.println(list.contans(12));
        System.out.println(list.contans(3));
        intersection(list,list2);
    }

}
