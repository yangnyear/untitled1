package suvfactory.products;

/**
 * Created by 羊荣毅_L on 2017/3/1.
 */
public class NewSUV extends AudiCar {
    @Override
    public void drive() {
        System.out.println("汽车开始跑");
    }

    @Override
    public void selfNavigation() {
        System.out.println("汽车开始自动导航");
    }
    public void stop(){
        System.out.println("SUV可以停下");
    }
    public void comfort(){
        System.out.println("SUV很熟服");
    }
}
