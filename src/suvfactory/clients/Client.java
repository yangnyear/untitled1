package suvfactory.clients;

import suvfactory.factory.AudiCreatFactory;
import suvfactory.factory.AudiFactory;
import suvfactory.products.AudiQ3;
import suvfactory.products.NewSUV;

/**
 * Created by 羊荣毅_L on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        AudiFactory factory=new AudiCreatFactory();
        AudiQ3 q3=factory.creatAudicar(AudiQ3.class);
        q3.drive();
        q3.selfNavigation();
        NewSUV suv=factory.creatAudicar(NewSUV.class);
        suv.drive();
        suv.selfNavigation();
        suv.stop();
        suv.comfort();
    }
}
