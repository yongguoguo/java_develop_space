package com.xdu.javacoretech_1.demo9;

import java.util.*;

/**
     * 在java的类库中，集合类的基本接口是Collection接口
     *
 *collection有两个基本的方法
 * add（E e）；
 * Iterator<E> iterator();.....用于返回一个迭代器对象，，这个迭代器可以依次的
 * 访问集合中的元素
 *
 *
 * 迭代器的结构
 *通过反复的调用next方法，来遍历集中的变量
 * 同样编译器会将foreach转成迭代器使用
 * foreach可以处理实现了Iterator的类
 *
 * 注意Iterator中的next方法和remove方法调用有依赖关系，
 * remove方法必须在next方法之后进行调用，否则会跑错
 *
 *
 *在java中集合有两个基本的接口，Collection和Map接口（K,v）、
 * 为了避免链表实现随机访问的功能，java创建了一个标志接口RandomAccess
 *
 *
 * set接口等同于Collection接口，不过他的add方法不允许添加重复的元素
 * 在set的equals 方法在定义的时候要注意元素相同即可，不需要顺序相同
 * 同时hashcode要保证 两个相同的集，hashcode相同
 *
 *
 *  在java中所有的链表都是双向链接的
 *
 *
 *注意：防止迭代器在并发读写时，出现异常（只检查结构性异常get，remove，set方法没有改变结构），我们一般只定义一个可以同时读写
 * 迭代器，可以有多个只读迭代器
 *
 *
 * 注意：使用在链表中使用for循环是效率极低的方法
 *
 *
 *
 *
     */
public class CollectionTest {
        public static void main(String[] args) {
            LinkedList <String> linkedList = new LinkedList();
            linkedList.add("ss");
            linkedList.add("222");
            Iterator<String> iterator = linkedList.iterator();
            for (Iterator<String> it = iterator; it.hasNext(); ) {
                String s = it.next();
                System.out.println(s);

            }
            System.out.println(linkedList.get(1));

        }
}
