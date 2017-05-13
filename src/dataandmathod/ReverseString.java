package dataandmathod;


import java.io.Console;
import java.security.PrivateKey;

/**
 * Created by 羊荣毅_L on 2017/4/23.
 * Java中的继承与实现
 */
public class ReverseString {
    public static void main(String[] args) {

    }
}

interface MyInterface {
    String abc="this is static numb";//接口中的常量不需要static 修饰便是静态常量,注意借口中不能定义成员变量
    public void method1();
}

abstract class MyAbstractClass implements MyInterface {
    @Override
    public void method1() {
    }
}

abstract class ChildAbstractClass extends MyAbstractClass {
    @Override
    public abstract void method1();
}