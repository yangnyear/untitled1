package hair;

/**
 * Created by 羊荣毅_L on 2017/3/1.
 */
public class TextClient {
    public static void main(String[] args) {
//        HairInterface hair=new LeftHair();
//        hair.draw();
        HairFactory factory=new HairFactory();
        HairInterface hair=factory.gethair("Right");
        if (hair!=null){
            hair.draw();
        }else
            System.out.println("Hair不存在");

    }
}
