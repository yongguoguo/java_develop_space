package com.xdu.javacoretech_1.demo9;

import java.util.ArrayDeque;

/**
 * java中的集合类库也是采用接口与实现分离的方法
 *以队列来进行解释，队列的接口如下
 * public interface Queue《E》{
 *     void add（E ele）；
 *     。。。。
 * }
 * 队列的实现的方法一般有两个
 * 1.循环数组
 * 例如
 * CircularArrayQueue implement Queue
 *
 * 2.链表
 *
 * LinkedListQueue implement Queue
 *
 * 实际上上述的两个实现类都是举例
 * 如果需要一个循环数组队列
 * 使用ArrayQueue
 * 如果需要一个链表队列，我们可以使用LinkedList（因为其实现了Queue）
 *
 *
 * 优先级队列
 * 中的元素可以按照任意的顺序进行插入，但是检索时会按照有序的顺序进行检索
 * 但是并没有对所有的元素进行排序
 * 优先级队列采用的是一种堆的方式（heap），可以将最小或者最大元素移动到第一个位置
 *
 *
 * 
 *
 */
public class QueueTest {
    public static void main(String[] args) {
        ArrayDeque<Object> objects = new ArrayDeque<>();
    }
}
