import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 羊荣毅_L on 2017/1/14.
 */
public class MylistNode {
    private int atter[][];
    private int lenth;
    private int bagin;
    private  int i,j;
    private BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        MylistNode mylistNode=new MylistNode();
        mylistNode.getatter();
        if (mylistNode.Solution_1(5))
            System.out.println("5在矩阵中");
        else
            System.out.println("5不在矩阵中");
    }
    //获得一个行列递增的矩阵
    private void getatter(){
        try {
            System.out.println("输入递增矩阵大小");
            lenth= Integer.parseInt(bufferedReader.readLine());
            System.out.println("输入递增矩阵起始量");
            bagin= Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        atter=new int[lenth][lenth];
        for (i=0;i<lenth;i++){
            for (j=0;j<lenth;j++){
                atter[i][j]=i+j+bagin;
            }
        }
        for (i=0;i<lenth;i++){
            for (j=0;j<lenth;j++){
                System.out.print(atter[i][j]+" ");
                if (j==lenth-1)
                    System.out.println();
            }
        }
        System.out.println("atter.lenth="+atter.length+" atter[0].lenth="+atter[0].length);

    }
//    输入一个值判断是否在该矩阵中
    private Boolean Solution(int a){
        for (i=0;i<lenth;i++){
            for (j=0;j<lenth;j++){
                if (a==atter[i][j])
                    break;
            }
        }
        return  true;
    }
    //时间浮渣度O(n)，从右上角开始
    private boolean Solution_1(int a){
        int row=0;
        int col=atter[0].length-1;
        int nor=atter.length;
        while(row<nor&&col>=0){
            if (atter[row][col]>a)
                col--;
            else if (atter[row][col]<a)
                row++;
            else return true;
        }
        return false;
    }
}
