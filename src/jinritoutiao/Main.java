package jinritoutiao;

import com.sun.webpane.webkit.dom.HTMLIFrameElementImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 羊荣毅_L on 2017/3/30.
 */
public class Main {

    public static int getMaxNumb(int[] attr, int key) {
        int numb = 0;
        for (int i = 0; i < attr.length; i++) {
            if (attr[i] >= key) {
                numb++;
            }
        }
        return numb;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, q;
        int j = 0;
        n = scanner.nextInt();
        q = scanner.nextInt();
        int[] numb1 = new int[n];
        int[] numb2 = new int[n];
        for (int i = 0; i < n; i++) {
            numb1[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            numb2[i]=scanner.nextInt();
        }
        List<int[]> attrs = new ArrayList<>();
        while (j < q) {
            int[] attr1 = new int[2];
            for (int i = 0; i < 2; i++) {
                attr1[i] = scanner.nextInt();
            }
            attrs.add(attr1);
            j++;
        }
      int[] result1=new int[attrs.size()];
        for (int i = 0; i < result1.length; i++) {
            result1[i]= getMaxNumb(numb1,attrs.get(i)[0]);
        }
        int[] result2=new int[attrs.size()];
        for (int i = 0; i < result2.length; i++) {
            result2[i]= getMaxNumb(numb2,attrs.get(i)[1]);
        }
        for (int i = 0; i < result1.length; i++) {
                if (result1[i]<=result2[i]){
                    System.out.println(result1[i]);
                }else if (result2[i]<=result1[i]){
                    System.out.println(result2[i]);
                }

        }
    }
}
