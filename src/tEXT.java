/*
简单加密
**/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by 羊荣毅_L on 2017/1/13.
 */
public class tEXT {
    private int[] a;
    private int s[];
    private int[] k;
    private int key;
    private BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args){
        tEXT tEXT=new tEXT();
        try {
            int n= Integer.parseInt(tEXT.bufferedReader.readLine());
            tEXT.atter(n);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("输入密码：");
        try {
            tEXT.key= Integer.parseInt(tEXT.bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("加密后的数组：");
        tEXT.change();
        System.out.println();
        System.out.println("解密后的数组：");
        tEXT.changeback();
    }
    //获得数组
    private void atter(int m){
        int i;
         a = new int[m];
        for (i=0;i<m;i++){
            try {
                a[i] = Integer.parseInt(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    private void  change(){
      s=new int[a.length];
        int i;
        for (i=0;i<s.length;i++){
            s[i]=a[i]^key;
            System.out.print(s[i]+" ");
        }
    }
    private void changeback(){
        k=new int[s.length];
        int i;
        for (i=0;i<k.length;i++){
            k[i]=s[i]^key;
            System.out.print(k[i]+" ");
        }
    }
}
