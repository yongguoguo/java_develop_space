package com.xdu.javacoretech_1.demo5;
/**
 * tostring可以很快的打印出对象的信息
 * 但是数组只是继承了object的tostring方法，并没有重写
 *
 *所以我们在打印数组的时候，我们要使用静态方法，Arrays.tostring
 *强烈建议为自定义的类添加tostring方法
 *
 *
 *数组泛型ArrayList<>
 * 可以进行自动扩容的数组
 * get
 * set（i，x）替换
 * add添加
 * 注意当ArrayList没有指定泛型类时，返回的OBJ，需要强制类型转换
 * 同样在没有指定泛型类的时候，add，和set方法会接收任何对象类型的值
 *
 *
 *
 *

 */
public class ToStringTest {

}
