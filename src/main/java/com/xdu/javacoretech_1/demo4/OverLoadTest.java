package com.xdu.javacoretech_1.demo4;

/**
 * 重载，相同的方法名，不同的参数，返回值相同
 * java允许重载任何方法
 * 字段如果没有进行初始化，则会有默认值，但是局部变量不进行初始化，则会报错
 *   Java会为每个类提供一个默认的无参构造器，但是当我们定了我们自己的构造器
 *   默认的无参构造器就会消失
 *   如果想要使用，需要我们自己定义无参构造器
 *  注意this关键字可以调用构造器方法
 *

 */
public class OverLoadTest {
    private int anInt;
    private boolean aBoolean;

    public OverLoadTest(int anInt){
        this.anInt = anInt;
    }
    //构造器的第一行调用了第一个构造器，则基于提供的参数构造第二个构造器
    //否则，1初始化为默认值

    //2.按照初始化块（包括对象初始化块和静态初始化块）或者声明中已经初始化的参数
    //3、然后才执行构造器主题代码


    public OverLoadTest(int anInt,boolean aBoolean){
        this(2);
        this.aBoolean = aBoolean;
    }
    //如果是静态字段，我们可以使用静态初始化块
    //在类第一次加载的时候，会对类静态字段进行初始化话
    static
    { 
        //进行初始化

    }

}
