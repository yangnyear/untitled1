package reflection;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by 羊荣毅_L on 2017/3/20.
 * 了解Java反射機制
 */
public class Reflect {



    public static void main(String[] args) {
//
//        Student student = new Student();
//        student.fun();
        String s = "reflection.Student";
        String funName = "fun";
        // 创建对象
        Class<?> clazz = null;
        try {
            clazz = Class.forName(s);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Object student = null;
        try {
            student = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        // 调用方法
        Method method = null;
        try {
            method = clazz.getMethod(funName);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            method.invoke(student);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }


}
