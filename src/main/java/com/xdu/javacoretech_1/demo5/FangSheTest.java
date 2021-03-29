package com.xdu.javacoretech_1.demo5;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 能够分析类能力的程序叫做反射
 * 1.在运行时分析类的能力
 * 反射包中有三个类Field，Method，Constructor分别用来表述类的字段，类的方法，类的构造器
 *
 * 2.在运行时检查对象，如编写一个适用于所有类的tostring方法
 * 通过Field方法可以拿到字段的名称及内容，所以可以写一个适合于所有类的tostring，参数用obj接收
 *
 *
 * 3.实现泛型数组操作代码
 * 用Array也可以通过反射找到相关的数组类型
 *
 *
 *
 * 4.利用Method对象
 *反射中通过Method类的invoke方法，可以调用类的相关的方法
 *
 *
 * Class类，java在运行时始终为所有系统维护一个运行时类型标志
 * 保存这些类名的类就叫Class
 * obj的getclass方法，会返回一个class类的实例，
 * 也可以使用静态方法forname
 * 也可以使用类名.class创建Class类对象
 * 然后就可以创建相关类的对象
 *
 *
 */
public class FangSheTest {
    private int a = 1;
    public String invo(){
        return "invoke 调用";
    }



    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        Class aClass = Class.forName("com.xdu.javacoretech_1.demo5.FangSheTest");
        Class<FangSheTest> fangSheTestClass = FangSheTest.class;
        FangSheTest fangSheTest = fangSheTestClass.getConstructor().newInstance();
        Field field = aClass.getDeclaredField("a");
        //可以通过反射，拿到私有属性,也可以设置属性
        //所以在系统中尽量不要将重要数据写死在方法中
        field.set(fangSheTest, 2);
        System.out.println(field.get(fangSheTest));
        //通过method调用方法invo
        //如果是调用构造器方法，则使用construction方法
        Method invo = fangSheTestClass.getDeclaredMethod("invo");
        //如果是一个静态方法时，第一个参数对象参数fangSheTest可以省略
        System.out.println(invo.invoke(fangSheTest));
    }
}
