package regularexpression;

import java.util.Scanner;

/**
 * Created by 羊荣毅_L on 2017/3/27.
 * 编写一个程序，将输入字符串中的字符按如下规则排序。
 规则1：英文字母从A到Z排列，不区分大小写。
 如，输入：Type 输出：epTy
 规则2：同一个英文字母的大小写同时存在时，按照输入顺序排列。
 如，输入：BabA 输出：aABb
 规则3：非英文字母的其它字符保持原来的位置。
 如，输入：By?e 输出：Be?y
 样例：
 输入：
 A Famous Saying: Much Ado About Nothing(2012/8).
 输出：
 A aaAAbc dFgghh: iimM nNn oooos Sttuuuy (2012/8).
 */
public class Stringsort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String s=input.nextLine();
            String r=sort(s);
            System.out.println(r);
        }
    }
    public static String sort(String s){
        if(s.length()<=0){
            return null;
        }
        char[] c=s.toCharArray();
        StringBuffer sb=new StringBuffer();
        //对字母进行排序的思想是：将每一字符与'a'-'z'或'A'-'Z'做比较，并添加到字符缓冲中，经过此步骤完成了
        //不同字母按递增顺序排序，同一字母（不区分大小写）按原来顺序排列。
        for(int i=0;i<26;i++){
            for(int j=0;j<c.length;j++){
                if(c[j]=='a'+i||c[j]=='A'+i){
                    sb.append(c[j]);
                }
            }
        }
        StringBuffer res=new StringBuffer();
        int flag=0;
        for(int i=0;i<c.length;i++){
            if(isChar(c[i])){
                res.append(sb.charAt(flag));
                flag++;
            }else{
                res.append(c[i]);
            }
        }
        return res.toString();
    }
    //判断某一字符是否为字母
    public static boolean isChar(char c){
        if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
            return true;
        }else{
            return false;
        }
    }
}
