package suvfactory;

/**
 * Created by 羊荣毅_L on 2017/3/1.
 */
public abstract class AudiFactory {
    public abstract <T extends AudiCar> T creatAudicar(Class<T> c1);
}
