package regularexpression;

import java.util.Scanner;

/**
 * Created by 羊荣毅_L on 2017/3/25.
 * 网易春招编程第一题,奇怪的双杀表达式
 * 不考虑计算优先级
 * 我好想打自己
 */
public class MyMath {
    private char[] mChars;
    public int getResult(String express) {
        mChars=express.toCharArray();
        int  result=mChars[0]-48;
        for (int i = 1; i < mChars.length; i++) {
         String s= String.valueOf(mChars[i]);
            if (s.equals("+")){
                result+=(mChars[i+1]-48);
            }else if (s.equals("-")){
                result-=(mChars[i+1]-48);
            }else if (s.equals("*")){
                result*=(mChars[i+1]-48);
            }else if (s.equals("/")){
                result/=(mChars[i+1]-48);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MyMath myMath=new MyMath();
        Scanner scanner=new Scanner(System.in);
        String expression=scanner.nextLine();
        System.out.println(myMath.getResult(expression));
    }
}
