package codeforoffer;

import java.util.Scanner;

/**
 * Created by 羊荣毅_L on 2017/3/23.
 *
 */
public class Main {
    public static int getnum(int a, int b, int c) {
        int count = 0;
        if (a<-58||b>58){
            return count;
        }else if (a>b){
            return count;
        }else if(c<1||c>1000){
            return count;
        } if (a<=b){
            for (int i = a; i <= b; i++) {
                if (i % c == 0)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(getnum(a, b, c));
    }
}
