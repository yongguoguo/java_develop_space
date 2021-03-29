package com.xdu.javacoretech_1.demo4;

/**
 * java方法参数都是按值传递的方式进行调用
 * 也就说方法得到的所有参数值都是一个副本,不能修改参数的内容
 * 但是对于引用类型的参数，对象的属性可以进行修改
 * 因为传递的对象引用产生了一个新的副本， 当时副本和参数引用的都是同一个对象
 * 方法不能让一个对象参数引用一个新的对象
 */
public class CallByValueTest {
    public static void te(int x){
        x=x*3;
    }
    public static void main(String[] args) {
        int x=3;
        CallByValueTest.te(x);
        System.out.println(x );
    }
}
