package myarraylist;

import java.util.Scanner;

/**
 * Created by 羊荣毅_L on 2017/4/8.
 * 求一个数组的最大子数组和
 * 这是一种"卧槽!老子真的想不到"的方法
 */
public class ChuildSum {
    public static int getMaxSum(int[] array) {
        if (array.length == 0) {
            return 0;
        } else {
            int cat = array[0], result = array[0];
            for (int i = 1; i < array.length - 1; i++) {
                cat += array[i];
                result = cat > result ? cat : result;
                if (cat<0){
                    cat=0;
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        //如果需要手动输入则可以再次简化,将两个循环简化为一个
        int lenth;
        Scanner in=new Scanner(System.in);
        lenth=in.nextInt();
        int[]array=new int[lenth];
        for (int i = 0; i < lenth; i++) {
            array[i]=in.nextInt();
        }
        System.out.println(getMaxSum(array));

    }
}
