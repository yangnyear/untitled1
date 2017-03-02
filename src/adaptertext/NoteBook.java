package adaptertext;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by 羊荣毅_L on 2017/3/2.
 */
public class NoteBook {
    private TreePlug mPlug;

    public NoteBook(TreePlug mPlug) {
        this.mPlug = mPlug;
    }

    public void charge() {
        mPlug.pwerWithTree();
    }

    public static void main(String[] args) {
        GBTwoPlug gbTwoPlug = new GBTwoPlug();
        TreePlug mPlug = new TwoPlugAdapter(gbTwoPlug);
        NoteBook noteBook = new NoteBook(mPlug);
        noteBook.charge();

        TreePlug mPlug2 = new TwoPlugAdapter2();
        noteBook = new NoteBook(mPlug2);
        noteBook.charge();

    }
}
