package suvfactory.factory;

import suvfactory.products.AudiCar;

/**
 * Created by 羊荣毅_L on 2017/3/1.
 */
public class AudiCreatFactory extends AudiFactory {
    @Override
    public <T > T creatAudicar(Class<T> c1) {
        T mCar=null;
        try {
             mCar = (T) Class.forName(c1.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mCar;
    }
}
