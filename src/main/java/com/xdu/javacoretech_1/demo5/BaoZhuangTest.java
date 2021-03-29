package com.xdu.javacoretech_1.demo5;

/**
 * java 的包装类是不可改变的，一旦构造了包装器，就不允许改变包装里的值，
 * 同时包装类还是final，不允许继承
 *
 * 1.注意泛型不能是基本类型，所以只能用包装类型
 * 包装类虽然有自动拆箱和自动装箱的功能
 * 但是包装类型在比较大小的时候，不能直接用==来进行比较，包装类重写了equals方法
 * 要使用equals方法来进行判断
 *
 * 2.包装类是引用类型，所以也会出现空指针异常
 *
 * 3.当Interger和double包装类在一个条件表达式中进行操作时，Interger会转为double
 *
 * 4.装箱和拆箱是编译器完成的事情，不是虚拟机完成的事情
 *
 *
 *
 */

public class BaoZhuangTest {
    //这个方法类似于printf方法，可以定义多个参数

    public static double max(double ... value){
        double largest = Double.NEGATIVE_INFINITY;
        System.out.println(largest);
        for (double v : value
             ) {if(v>largest)
                 largest = v;

        }
        return largest;
    }
}
