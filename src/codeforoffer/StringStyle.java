package codeforoffer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 羊荣毅_L on 2017/3/23.
 */
public class StringStyle {
    public static int getType(ArrayList<String> stringlist) {
        int a = 0, b = 0, count=0;
        for (int i = 0; i < stringlist.size(); i++) {
            if (i < stringlist.size() - 1) {
                a = stringlist.get(i).compareTo(stringlist.get(i = 1));
            } else if (i == stringlist.size()) {
                b = stringlist.get(i).compareTo(stringlist.get(0));

            }
            if (a==b) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int listsize = in.nextInt();
        ArrayList<String> stringlist = new ArrayList<String>();
        for (int i = 0; i < listsize; i++) {
            String node = in.nextLine();
            stringlist.add(node);
        }
        System.out.println(getType(stringlist));
    }
}
