package adaptertext;

/**
 * Created by 羊荣毅_L on 2017/3/2.
 */
public class TwoPlugAdapter2 extends GBTwoPlug implements TreePlug {
    @Override
    public void pwerWithTree() {
        System.out.println("...........................");
        this.powerWithtwo();
    }
}
