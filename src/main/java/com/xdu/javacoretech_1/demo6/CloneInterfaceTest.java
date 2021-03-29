package com.xdu.javacoretech_1.demo6;

/**
 * 包含对象变量的引用在建立副本时，会和副本一起引用同一个对象
 *所以我们需要他们引用各自的对象，这时就需要clone方法
 *
 *
 * 但是有一个问题就是如果这个类有其他类的对象实例时，并不会拷贝这些对象引用
 * 所以说默认的克隆是浅拷贝
 *
 *
 * 如果这个对象实例是不可变的。例如string，则这样的共享是安全的
 * 但是大多数情况下子对象都是可变的
 * 克隆时要让子类的对象实现cloneable接口（重写了clone方法）
 * 我们需要重新定义一个clone方法进行深拷贝，同时将方法写成public
 *
 *
 * 注意重写clone方法和实现克隆接口并没有关系
 * cloneable只是一个标记接口（可以使用instanceof），并没有方法
 *
 *
 * 注意克隆并没有这么常用，标准库中用了5%
 *
 */
public class CloneInterfaceTest implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
        //下面对子类对象进行克隆

    }
}
