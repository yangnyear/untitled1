package linkedlist;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by 羊荣毅_L on 2017/3/19.
 * 丢手帕问题
 */
public class JosePluse {
    public static void main(String[] args) {
        pass(20,4);
    }
    public static void pass(int m, int n)
    {
        int i, j, mPrime, numLeft;
        ArrayList<Integer> L = new ArrayList<Integer>();
        for (i=1; i<=n; i++)
            L.add(i);
        ListIterator<Integer> iter = L.listIterator();
        Integer item=0;
        numLeft = n;
        mPrime = m % n;//找到要出去的那个child
        for (i=0; i<n; i++)
        {
            mPrime = m % numLeft;//重新计算要出去的child
            if (mPrime <= numLeft/2)//二分,当要找的那个在前一半时
            {
                if (iter.hasNext())
                    item = iter.next();
                for (j=0; j<mPrime; j++)
                {
                    if (!iter.hasNext())
                        iter = L.listIterator();//从头开始循环到要出去的那个child
                    item = iter.next();
                }
            }
            else//如果在后一半
            {
                for (j=0; j<numLeft-mPrime; j++)
                {
                    if (!iter.hasPrevious())
                        iter = L.listIterator(L.size());//从尾部开始循环到要出去的那个child
                    item = iter.previous();
                }
            }
            System.out.print("Removed " + item + " ");
            iter.remove();//将该child移除
            if (!iter.hasNext())
                iter = L.listIterator();//重新初始化
            System.out.println();
            for (Integer x:L)
                System.out.print(x + " ");
            System.out.println();
            numLeft--;//改变总人数
        }
        System.out.println();
    }
}
