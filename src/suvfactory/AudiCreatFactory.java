package suvfactory;

/**
 * Created by 羊荣毅_L on 2017/3/1.
 */
public class AudiCreatFactory extends AudiFactory {
    @Override
    public <T extends AudiCar> T creatAudicar(Class<T> c1) {
        AudiCar mCar=null;
        try {
             mCar = (AudiCar) Class.forName(c1.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) mCar;
    }
}
