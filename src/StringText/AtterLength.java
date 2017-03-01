package StringText;

/**
 * Created by 羊荣毅_L on 2017/1/14.
 */
public class AtterLength {
    private int atter[][];
    public static void main(String[] args) {
//        StringText.AtterLength atterLength=new StringText.AtterLength();
////        atterLength.getatter();
//        atterLength.text();

//        String str1 = "java";
//        String str2 = "java";
//        System.out.println(str1==str2);
//        System.out.print(str1.equals(str2));

//        String str1 = new String("java");
//        String str2 = new String("java");
//        System.out.print(str1==str2);

        String str1 = "java";
        String str2 = "blog";
        String s = str1+str2;
        System.out.print(s=="javablog");

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
    private void text(){
        String str1 = "java";
        String str2 = "java";
        System.out.print(str1==str2);
    }
}
