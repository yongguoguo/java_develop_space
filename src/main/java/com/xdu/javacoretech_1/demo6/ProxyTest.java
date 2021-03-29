package com.xdu.javacoretech_1.demo6;

/**
 * 代理类
 * 可以在运行时创建一组给定接口的新类（运行时创建的新类实现指定的接口）
 * 代理类包括
 * 指定接口所需要的全部方法
 * obj类的全部方法
 *
 *
 * 无论何时调用代理对象的方法，调用处理器的invoke方法都会被调用
 * invoke中实现新的方法
 *
 *
 * 创建代理对象需要使用Proxy的newProxyinstance
 * 参数三个
 * 1.类加载器
 * Class对象接口;每个元素对应实现的各个接口
 * 一个调用处理器
 *
 *
 * 代理类是在程序运行过程中动态创建的
 * 一个代理类只有一个实例字段，即调用处理器（是一个类）
 * 完成代理工作需要的额外的类都存储在调用处理器中
 *
 *
 * 所以代理类覆盖了obj的tostring，equals，hashcode方法
 *
 */
public class ProxyTest {
}
