package com.xdu.javacoretech_1.demo8;

import java.lang.reflect.Field;
import java.util.Comparator;

/**
 * 泛型的测试
 * 泛型提供了一个功能叫做参数类型
 * 在没有泛型之前类都是通过obj数组进行实现的
 * 需要进行强制类型转换
 * 编译时检查不到错误
 *
 *
 * 使用泛型之后，使得代码阅读更加方便
 * 同时在编译的时候就能检查出错误
 *
 *
 * 下面定义一个泛型类
 * 可以有一个或多个泛型变量的类
 *
 * 泛型变量<>指定方法的返回类型，字段和局部变量的类型
 *也可以具体的类型<string>
 *泛型类相当于普通类的工厂
 *
 *
 * 泛型方法：类型变量放在修饰符的后边，返回值的前面
 * 注意泛型方法可在普通类中，也可放在泛型类中
 *
 *
 * 有时需要对泛型的类加以限制
 * <T extends Boundingtype>
 *例如<T extends Comparable>
 *   泛型T必须是实现comparable接口的类
 *
 *
 *   虚拟机没有泛型类的对象，只有普通类的对象
 所以泛型在编译时才会起作用，在运行时会自动擦除类型变量


 编译器会自动的插入相关的强制类型转换
会用合成桥方法来保持多态
 知道有这个东西就行


 泛型的限制：
 不能使用基本类型来代替类型参数（得使用包装类）
 运行类型查询时只用于原始类型（当我们使用a instanceof FanXin<T,T>只能判断a是否属性FanXin类）
 不能创建带参数化类型的数组（不能new FanXin《String》【10】），但可以声明变量


 不能实例化泛型对象和泛型数组
 泛型变量不能用static修饰
 不能捕获和抛出泛型类的异常


无论S和T有什么关系，通常Pair《S》和Pair《T》都没有关系
 所以Pair《Employee》p并不能接收


 泛型通配符<? extend Employee>
 表示任何泛型Pair类型，他的类型参数是Employee的子类
 例如（Pair<? extend Employee> p）
 注意Pair《Maneger》是Pair《？ extend Employee》的子类型


 通配符还可以使用super表示是超类型的限定（? super Manager）


泛型中的反射

 */

public class FanXinTest  {

    public static void main(String[] args) throws NoSuchFieldException {
        Fanxin<String, String> stringStringFanxin = new Fanxin<>();
        Class<Fanxin> name = Fanxin.class;
        Field firsts = name.getField("first");
        firsts.setAccessible(true);
        Class<?> type = firsts.getType();
        System.out.println(type);
        //System.out.println(first.getType());

        System.out.println(name);
    }

}
class Fanxin<T,U> implements Comparable {
    public          T first;
    private  U second;
    //...是可变参数的意思，实际上相当于一个数组

    public static <D> String getD(D ... d){
        return  d.toString();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
