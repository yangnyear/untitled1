package dataandmathod;

/**
 * Created by 羊荣毅_L on 2017/4/22.
 * 求一个数组中出现次数超过一半的数
 */
public class FastSort {
    public static int getCand(int[] a) {
        int cade = 0;
        int times = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                cade = a[i];
            } else if (a[i] == cade && times != 0) {
                times++;
            } else if (a[i] != cade && times == 0) {
                times--;
                if (times == 0) {
                    cade = 0;
                }
            }
        }
        return cade;
    }

    public static boolean isResult(int[] a, int cade) {
        int time = 0;
        for (int i = 0; i < a.length; i++) {
            if (cade == a[i]) {
                time++;
            }
        }
        if (time >= (a.length / 2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 1, 1, 4, 5, 2, 3, 1, 1, 1, 1, 1};
        int a = FastSort.getCand(data);
        if (FastSort.isResult(data, a)) {
            System.out.print(a + "是data里面出现次数超过一半的数");
        } else {
            System.out.print("data里面没有出现次数超过一半的数");
        }

    }

}
