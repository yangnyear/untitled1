package codeforoffer;

import java.util.ArrayList;

/**
 * Created by 羊荣毅_L on 2017/3/21.
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 */
public class ArrayListSolution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if (sum == 1) return list;
        int n = (int) (Math.ceil((Math.sqrt(8 * sum + 1) - 1) / 2));
        int tmp = 0;
        int num = 0;
        for (int i = n; i > 1; i--) {
            tmp = (i + 1) * i / 2;
            if ((sum - tmp) % i == 0) {
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                num = (sum - tmp) / i;
                for (int a = 1; a <= i; a++) {
                    arrayList.add(num + a);
                }
                list.add(arrayList);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayListSolution arrayListSolution=new ArrayListSolution();
        int sum = 100;
        ArrayList<ArrayList<Integer>> list=arrayListSolution.FindContinuousSequence(sum);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
