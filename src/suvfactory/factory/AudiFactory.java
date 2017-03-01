package suvfactory.factory;

import suvfactory.products.AudiCar;

/**
 * Created by 羊荣毅_L on 2017/3/1.
 */
public abstract class AudiFactory {
    public abstract <T > T creatAudicar(Class<T> c1);
}
