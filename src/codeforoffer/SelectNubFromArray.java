package codeforoffer;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by 羊荣毅_L on 2017/3/21.
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * num1,num2分别为长度为1的数组。传出参数
 * 将num1[0],num2[0]设置为返回结果
 */
public class SelectNubFromArray {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array.length < 2) return;
        int myxor = 0;
        int flag = 1;
        for (int i = 0; i < array.length; ++i)
            myxor ^= array[i];
        while ((myxor & flag) == 0) flag <<= 1;
        // num1[0] = myxor;
        //num2[0] = myxor;
        for (int i = 0; i < array.length; ++i) {
            if ((flag & array[i]) == 0) num2[0] ^= array[i];
            else num1[0] ^= array[i];
        }
    }

    public static void main(String[] args) {
        SelectNubFromArray selectNubFromArray=new SelectNubFromArray();
        int[] arry = {1, 1, 1, 2, 3, 4, 4, 5, 5};
        int[] num1={0};
        int[] num2={0};
        selectNubFromArray.FindNumsAppearOnce(arry,num1,num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }
}
