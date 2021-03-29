package com.xdu.javacoretech_1.demo6;

import java.util.Arrays;
import java.util.Comparator;

/**
 ** comparetor接口
 *   有些我们使用的类已经实现了compareable接口，但是我们想要不同的比较方式
 *   (比如我们实现按照长度进行比较)
 *   这时就需要我们实现  Comparator的compare方法
 *   这个方法并不是在String上调用的，而是在ComparetorTest（我们创建的比较器进行调用）
 *
 *
 */
public class ComparetorTest implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }

    public static void main(String[] args) {
        String[] a={};
        //Arrays可以传入一个比较器
        Arrays.sort(a,new ComparetorTest());
    }
}
