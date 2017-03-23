package codeforoffer;

import com.sun.org.apache.xml.internal.security.Init;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by 羊荣毅_L on 2017/3/21.
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 *
 * java.lang.Math.sqrt(double a) 返回正确舍入的一个double值的正平方根。特殊情况：
 如果参数是NaN或小于为零，那么结果是NaN.
 如果参数是正无穷大，那么结果为正无穷大.
 如果参数是正零或负零，那么结果是一样的参数.
 否则，其结果是最接近真正的数学平方根的参数值的double值。

 java.lang.Math.ceil(double a) 返回最小的（最接近负无穷大）double值，大于或相等于参数，并相等于一个整数。特殊情况：
 如果参数值已经等于某个整数，那么结果是一样的参数。
 如果参数是NaN或无穷大或正零或负零，那么结果是一样的参数。
 如果参数值小于零，但是大于-1.0，那么结果是负零。
 请注意，Math.ceil（x）的值是完全相同的值，Math.floor（-X）。
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
    /**写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
    * */

    public int Add(int num1,int num2) {
        BigInteger bi1=new BigInteger(String.valueOf(num1));
        BigInteger bi2=new BigInteger(String.valueOf(num2));
        return bi1.add(bi2).intValue();
    }
//    public int Add(int a, int b) {
//        if(b == 0) return a;
//        int c = a ^ b;
//        int d = (a & b) << 1;
//        System.out.println(a+"%"+b+"="+(a & b));
//        return Add(c, d);
//    }
    /**
     * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字是重复的。
     * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
     * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是重复的数字2或者3
     * */

public boolean duplicate(int numbers[],int length,int [] duplication) {
    int temp;
    if(length<=1)
        return false;
    for(int i=0;i<length;i++) {
        while(numbers[i]!=i) {
            if(numbers[numbers[i]]!=numbers[i]) {
                temp=numbers[numbers[i]];

                numbers[numbers[i]]=numbers[i];
                numbers[i]=temp;
            }
            else {
                duplication[0]=numbers[i];
                return true;
            }

        }


    }
    return false;

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
        System.out.println("****************************************");
        int a=10,b=12;
       System.out.println( arrayListSolution.Add(a,b));

    }
}
