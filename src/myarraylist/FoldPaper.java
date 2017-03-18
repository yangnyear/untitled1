package myarraylist;

import java.util.ArrayList;

/**
 * Created by 羊荣毅_L on 2017/3/11.
 */
public class FoldPaper {
    public Node mNode;


    public FoldPaper(Node node) {
        mNode = node;

    }

    public void onCreatTree(int gradFather, int valuse, boolean isLeftChild) {
        if (isLeftChild) {
            mNode.leftFoldPaper = new Node(valuse, true);
            mNode.rightFoldPaper = new Node(0, false);
        } else {
            mNode.leftFoldPaper = new Node(valuse, true);
            mNode.rightFoldPaper = new Node(gradFather ^ 1, false);
        }
    }

    public static void main(String[] args) {
        int root = 0;
        Node node = new Node(root, false);
        Node left = node;
        ArrayList<Node> treeNode = new ArrayList<Node>();
//        node.leftFoldPaper = new Node(0, true);
//        node.rightFoldPaper = new Node(1, false);
        FoldPaper foldPaper = new FoldPaper(node);
        foldPaper.onCreatTree(0, 0, false);
        treeNode.add(foldPaper.mNode);
        if (treeNode.get(treeNode.size()).equals(left)){
            for (int i=0;i<treeNode.size();i++){
                System.out.println(treeNode.get(i).valueFoldPaper);
            }
        }else {
            treeNode.add(foldPaper.mNode.rightFoldPaper);
            treeNode.add(foldPaper.mNode.rightFoldPaper);
        }
        left=node.leftFoldPaper;
    }
}

class Node {
    public int valueFoldPaper;
    public boolean isLeftChild;
    public Node leftFoldPaper;
    public Node rightFoldPaper;

    public Node(int valueFoldPaper, boolean isLeftChild) {
        this.valueFoldPaper = valueFoldPaper;
        this.isLeftChild = isLeftChild;
        this.leftFoldPaper = null;
        this.rightFoldPaper = null;
    }
}