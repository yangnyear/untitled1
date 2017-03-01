package suvfactory;

/**
 * Created by 羊荣毅_L on 2017/3/1.
 */
public class Client {
    public static void main(String[] args) {
        AudiFactory factory=new AudiCreatFactory();
        AudiQ3 q3=factory.creatAudicar(AudiQ3.class);
        q3.drive();
        q3.selfNavigation();
    }
}
