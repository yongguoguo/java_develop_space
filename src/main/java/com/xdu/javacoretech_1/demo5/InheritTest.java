package com.xdu.javacoretech_1.demo5;

/**
 * 在继承中子类可以使用父类的方法，但是父类不能使用子类的方法
 * 但是父类的字段是使用的private字段,使用时要用父类的get方法
 * super.get
 * 注意这里的super和this不一样
 * super不是一个对象的引用
 * 当时this是当前对象的引用
 *
 * 当父类的方法在子类中不合适时，子类可以重写父类的方法 override
 *
 *父类的对象引用即可以引用父类对象，也可以引用子类对象
 * 这种方法就叫做多态(对象变量是多态的)
 *
 * 他们能在程序运行时，自动的选择相关的方法，叫做动态绑定
 *
 * is-a是一种替换规则，超类对象可以用子类对象进行替换
 *
 *
 */
public class InheritTest extends Inherit{

    private int c;

    public int getC() {
        return c;
    }
//重写父类的方法
    @Override
    public int getA() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public InheritTest(int a, int b, int c) {
        super(a,b);
        //因为我们在父类中显式的创建了有参数的构造器
        //所以在子类中必须调用显式的构造器，要不然编译器会进行报错

        this.c = c;


       // var intg = new Inherit [2];
       // intg[0] = new Inherit(0,0);
       // intg[1] = new InheritTest(0,0,1);
       // System.out.println();
        //注意下面的那条语句编译通不过，虽然intg[1]存的是子类，但是数组的类型是父类的类型
        //想要使用子类特有的方法，需要强制类型转换
        //System.out.println(intg[1].getC);
        //这里的getA，会通过重写的方法得到

      //  for (Inherit aa:intg
      //       ) {
      //      aa.getA();
      //  }
        //同样也不能把超类的引用赋给子类
    }

    public static void main(String[] args) {
       // InheritTest[] intt = new InheritTest[2];
      //  Inherit[] aaaa = intt;
      //  aaaa[0] = new InheritTest(1,1,1);
       // aaaa[1] = new Inherit(2,2);
        //intt数组中存入了一个Inherit数组，innt的引用是父类类型，也就是说父类可以调用一个不存在的实例字段
        //下面的代码编译通过了，但是运行的时候会报.ArrayStoreException异常
       // intt[1].getC();
        Inherit i = new Inherit(2, 2);
        //当超类赋给子类时，进行强制类型转换时（必须转换成正确的子类），否则会报错
        //ClassCastException
        //所以避免出现异常，用instanceof进行判断
        System.out.println(i instanceof InheritTest);
        InheritTest inheritTest = (InheritTest) i;

        /**
       总结，动态绑定永远和继承绑在一起使用，动态绑定的是父类和子类共有的方法，或者重写的方法
         */


    }
}
class Inherit{
        private int a;
        private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Inherit(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
