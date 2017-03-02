package abstractandinterface;

/**
 * Created by 羊荣毅_L on 2017/3/2.
 * know for interface and abstract class
 */
public class AbstractAndInterfaceText {
    private childOfInterface mChildOfInterface;
    private childOfabstract mChildOfabstract;

    /*
    build abstract class and interface by 'new'
     */

    //    private abstractclass mAbstractclass=new abstractclass() {
//        @Override
//        public void thisisabstractclass() {
//            System.out.println(".....................");
//        }
//    };
//    private interfaceclass mInterfaceclass=new interfaceclass() {
//        @Override
//        public void thisisinterfaceclass() {
//            System.out.println("////////////////////");
//        }
//    };
    public AbstractAndInterfaceText(childOfabstract childOfabstract, childOfInterface childOfInterface) {
        mChildOfabstract = childOfabstract;
        mChildOfInterface = childOfInterface;
    }



    public static void main(String[] args) {
        childOfInterface MchildOfInterface = new childOfInterface();
        childOfabstract MchildOfabstract = new childOfabstract();
        AbstractAndInterfaceText mabstractandinterface = new AbstractAndInterfaceText(MchildOfabstract,MchildOfInterface);
        mabstractandinterface.mChildOfInterface.thisisinterfaceclass();
        mabstractandinterface.mChildOfabstract.thisisabstractclass();
//        mabstractandinterface.mAbstractclass.thisisabstractclass();
//        mabstractandinterface.mInterfaceclass.thisisinterfaceclass();
    }
}
abstract class abstractclass {
    public abstract void thisisabstractclass();
}

interface interfaceclass {
    public void thisisinterfaceclass();
}


class childOfabstract extends abstractclass {

    @Override
    public void thisisabstractclass() {
        System.out.println(".....................");
    }
}

class childOfInterface implements interfaceclass {

    @Override
    public void thisisinterfaceclass() {
        System.out.println("////////////////////");
    }
}