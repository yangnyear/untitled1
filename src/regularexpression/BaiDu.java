package regularexpression;

/**
 * Created by 羊荣毅_L on 2017/3/25.
 */
import java.util.*;

class BaiDu
{
    public static void main(String[] args)
    {
        TreeSet<String> tr = new TreeSet<String>();
        String[] s ={"aa","bb","bb","cc","cc","dd"};
        System.out.print("====处理前=======");
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
            tr.add(s[i]);

        }
        String[] s2= new String[tr.size()];
        System.out.println("=====处理后======");
        for(int i=0;i<s2.length;i++){
            s2[i]=tr.pollFirst();//从TreeSet中取出元素重新赋给数组
            System.out.print(s2[i]+" ");
        }
    }
}
