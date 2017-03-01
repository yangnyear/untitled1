package hair;

/**
 * Created by 羊荣毅_L on 2017/3/1.
 */
public class HairFactory {
    public HairInterface gethair(String key){
        HairInterface hair;
        if ("Left".equals(key)){
             hair=new LeftHair();
            return hair;
        }else if ("Right".equals(key)){
            hair=new RightHair();
            return  hair;
        }
        return null;
    }
}
