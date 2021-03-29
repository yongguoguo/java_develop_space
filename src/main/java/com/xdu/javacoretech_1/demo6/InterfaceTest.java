package com.xdu.javacoretech_1.demo6;

/**
 * 接口不是类，所以没有实例（new ）
 * 接口也不能有实例字段
 * 但是接口变量可以引用实现接口的类对象
 *接口可以有常量
 *
 *
 * 接口中的所有方法自动为public
 * 因此可以将接口看成没有实例字段的抽象类
 * 字段自动为public static final
 *
 *
 *当我们要使用数组的sort方法进行排序的时候，相关对象数组的类要实现compare接口
 * 那为什么相关的类不能自己写一个compareto方法呢？
 * 因为java是强引用类型的语言，在调用方法时，要检查方法是否实现，当是实现compare接口之后
 * 方法肯定实现了
 *
 * 接口可以实现多个
 *
 *
 *java8允许接口中写入静态方法
 *java9允许接口写入私有方法
 *
 *

 */
public interface InterfaceTest {
    default InterfaceTest getname(){
        //在接口中也可以这么调用,this关键字
        return this;
    }

}

