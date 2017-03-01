package suvfactory.products;

import suvfactory.products.AudiCar;

/**
 * Created by 羊荣毅_L on 2017/3/1.
 */
public class AudiQ3 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("汽车开始跑");
    }

    @Override
    public void selfNavigation() {
        System.out.println("汽车开始自动导航");
    }
}
