package regularexpression;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 羊荣毅_L on 2017/3/26.
 * 小易有n块砖块，每一块砖块有一个高度。小易希望利用这些砖块堆砌两座相同高度的塔。
 * 为了让问题简单，砖块堆砌就是简单的高度相加，某一块砖只能使用在一座塔中一次。
 * 小易现在让能够堆砌出来的两座塔的高度尽量高，小易能否完成呢。
 * 输入描述:
 * 输入包括两行：
 * 第一行为整数n(1 ≤ n ≤ 50)，即一共有n块砖块
 * 第二行为n个整数，表示每一块砖块的高度height[i] (1 ≤ height[i] ≤ 500000)
 * 输出描述:
 * 如果小易能堆砌出两座高度相同的塔，输出最高能拼凑的高度，如果不能则输出-1.
 * 保证答案不大于500000。
 */
public class DuiTa {
    public int getHeirht(int[] heights) {
        int sum = 0;
        int sum1 = 0;
        Arrays.sort(heights);
        int[] normalSum = new int[heights.length];
        int[] unNormalSum = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
            normalSum[i] = sum;
        }
        for (int i = heights.length - 1; i >= 0; i--) {
            sum1 += heights[i];
            unNormalSum[i] = sum1;
        }
        for (int i = 0; i < normalSum.length; i++) {
            for (int j = 0; j < unNormalSum.length; j++) {
                if (normalSum[i]>((normalSum[normalSum.length-1]/2)+1)){
                    return -1;
                }else if (normalSum[i]==unNormalSum[j]){
                    return normalSum[i];
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        DuiTa duita = new DuiTa();
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = in.nextInt();
        }
        System.out.println(duita.getHeirht(heights));
    }
}
