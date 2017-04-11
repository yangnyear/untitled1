package myarraylist;

import java.util.LinkedList;

/**
 * Created by 羊荣毅_L on 2017/4/11.
 * 两个队列实现栈
 * use double list to mack a stak
 * 两个队列实现一个栈的效果,重点在于当两个队列之间倒换时剩下最后一个数然后返回
 */
public class DoubleListToStack {
    private LinkedList<Integer> mList1;
    private LinkedList<Integer> mList2;

    public DoubleListToStack() {
        mList1 = new LinkedList<>();
        mList2 = new LinkedList<>();
    }

    //从队列1倒换到队列2
    private int popFormList1() {
        if (mList1.size() == 0) {
            throw new NullPointerException("mList1 is a null point");
        } else {
            while (mList1.size() > 1) {
                inputList2(outPutList1());
            }
        }
        return mList1.removeLast();
    }

    //从队列2倒换到队列1
    private int popFomeList2() {
        if (mList2.size() == 0) {
            throw new NullPointerException("mList2 is a null point");
        } else {
            while (mList2.size() > 1) {
                inputList1(outPutList2());
            }
        }
        return mList2.removeLast();
    }

    private void pop() {
        int re = 0;
        while (mList1.size() !=0) {
            re = popFormList1();
            System.out.print(re + " ");
            if (mList2.size()!=0){
                re = popFomeList2();
                System.out.print(re + " ");
            }
        }
    }

    public void push(int o) {
        inputList1(o);
    }

    //限制队列为单端操作,只能在对头加入,队尾出队
    private void inputList1(int o) {
        mList1.addFirst(o);
    }

    private void inputList2(int o) {
        mList2.addFirst(o);
    }

    private int outPutList1() {
        return mList1.removeLast();
    }

    private int outPutList2() {
        return mList2.removeLast();
    }

    public static void main(String[] args) {
        DoubleListToStack stack=new DoubleListToStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
    }

}

