import javafx.stage.StageStyle;

import javax.swing.table.AbstractTableModel;

/**
 * Created by 羊荣毅_L on 2017/1/14.
 */
public class AtterLength {
    private int atter[][];
    public static void main(String[] args) {
        AtterLength atterLength=new AtterLength();
        atterLength.getatter();

    }
    //查看atter.length and atter[0].length
    private void getatter(){
        atter=new int[5][3];
        for (int i=0;i<5;i++){
            for (int j=0;j<3;j++){
                atter[i][j]=i+j+1;
                System.out.print(atter[i][j]);
                if (j==2)
                    System.out.println();
            }
        }
        System.out.println("atter.length="+atter.length);
        System.out.println("atter[0].length="+atter[0].length);
    }
}
