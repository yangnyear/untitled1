package myarraylist;

import javax.xml.bind.JAXBElement;

/**
 * Created by 羊荣毅_L on 2017/4/8.
 * 给定数组,求最长递增子序列长度
 * 一种"卧槽!老子真的想不到"的方法,时间复杂度O(n*log(n))
 */
public class ChildLenth {
    public static int getLongestLenth(int[] array) {
        int lenth = 0;
        if (array.length == 0) {
            return 0;
        } else {
            int[] help = new int[array.length];
            help[0] = array[0];
            for (int i = 1; i < array.length - 1; i++) {
                for (int j = 0; j < help.length - 1; j++) {
                    if (help[j] >= array[i]) {
                        help[j] = array[i];
                        break;
                    }else if (help[j]==0){
                        help[j]=array[i];
                        break;
                    }
                }

            }
            for (int i = 0; i < help.length - 1; i++) {
                if (help[i] != 0) {
                    lenth = i + 1;
                }
            }
        }
        return lenth;
    }

    public static void main(String[] args) {
        int [] array={ 1,2,3,7,5,1,3,6,8,9,10,2,5,3,2,1};
        System.out.println(getLongestLenth(array));
    }
}
