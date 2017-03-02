package adaptertext;

/**
 * Created by 羊荣毅_L on 2017/3/2.
 */
public class TwoPlugAdapter implements  TreePlug {
    private GBTwoPlug mGBTwoPlug;
    public TwoPlugAdapter(GBTwoPlug gbTwoPlug){
        mGBTwoPlug=gbTwoPlug;
    }
    @Override
    public void pwerWithTree() {
        System.out.println("通过转换使用两相电充电");
        mGBTwoPlug.powerWithtwo();

    }
}
