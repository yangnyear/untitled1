package textcode;

import com.sun.xml.internal.bind.v2.model.core.ArrayInfo;
import com.sun.xml.internal.ws.addressing.v200408.MemberSubmissionWsaClientTube;

import java.util.Scanner;

/**
 *
 * Created by 羊荣毅_L on 2017/3/7.
 */
public class Main {
    public static void main(String[] args) {
        int mainSize = 0;
        int maxSize = 0;
        int fishNo = 0;
        int safeNo = 0;

        Scanner sc = new Scanner(System.in);
        mainSize = sc.nextInt();
        maxSize = sc.nextInt();
        fishNo = sc.nextInt();
        int[] fishsize=new int[fishNo];
        for (int i = 0; i < fishNo; i++) {
            fishsize[i] = sc.nextInt();

        }
        for (int j=mainSize;j<=maxSize;j++){
            for (int i=0;i<fishNo;i++){
                double z=j/fishsize[i],f=fishsize[i]/j;
                if (z>=2&&z<=10){
                    break;
                } else  if(f>=2&&f<=10){
                    break;
                }else
                    safeNo++;
            }
        }
        System.out.println(safeNo);
    }

}
