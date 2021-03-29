package com.xdu.javacoretech_1.demo5;

/**
 * java中除了基本的数据类型不是对象，其他类都继承了Object类
 *
 * equals方法比较一个对象和另一个对象是否相同
 * 不过一般都重写equal方法，比如String和Integer比较值
 *equals方法要满足
 * 1.自反性
 * 2.对称性
 * 3.传递性
 * 一致性
 *
 *hashcode是由对象导出的一个整形值，哈希吗是没有规律的
 *
 * String的hashcode相同是因为重写了hashcode，由内容产生
 *
 * Objective默认是从对象的存储地址得出散列码
 * 如果重新定义equals，就必须定义hashcode的值，让两个相同的对象能有一样的hashcode值
 *
 *基本类型的参数由其包装类提供hashcode方法
 *
 *
 */
public class ObjTest extends Obg{
    private static Integer anInt;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }



    public static void main(String[] args) {
        Integer s1 = 1;
        Integer s2 = 1;
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(1));
        System.out.println(new Obg() instanceof ObjTest);
        System.out.println(new ObjTest() instanceof Obg);
        System.out.println(s1.getClass());
        ObjTest.anInt.hashCode();
    }
}
class Obg{

}
