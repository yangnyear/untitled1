package regularexpression;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by 羊荣毅_L on 2017/3/25.
 */
public class TuQiPan {
    public int getnum(String[] s) {
        int sum = 0;
        int lenth = 0;
        for (int i = 0; i < s.length; i++) {
            lenth = s[i].length();
            sum += lenth * lenth;
        }
        return sum;
    }
//去掉重复
    public String[] checkdanci(String[] s) {
        TreeSet<String> tr = new TreeSet<String>();
        for (int i = 0; i < s.length; i++) {
            if (s[i]!=null){
                tr.add(s[i]);
            }
        }
        String[] s2 = new String[tr.size()];
        for (int i = 0; i < s2.length; i++) {
            s2[i] = tr.pollFirst();
        }
        return s2;
    }
//找出正确的
    public String[] getTruewords(String[] s, String[] s1) {
        String[] newstring = new String[s1.length];
        int k = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s1.length; j++) {
                if (s[i].equals(s1[j])) {
                    newstring[k] = s[i];
                    k+=1;
                }
            }
        }
        return newstring;
    }

    public static void main(String[] args) {
        TuQiPan tuQiPan = new TuQiPan();
        int n, m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        String[] s = new String[n];
        String[] s1 = new String[m];
            for (int i = 0; i < n; i++) {
                s[i] = scanner.next();
            }
            for (int i = 0; i < m; i++) {
                s1[i] = scanner.next();
            }
        String[] trues = tuQiPan.getTruewords(s, s1);
        String[] singleString = tuQiPan.checkdanci(trues);
        System.out.println(tuQiPan.getnum(singleString));
    }
}
