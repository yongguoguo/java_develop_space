package com.xdu.javacoretech_1.demo6;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;

/**
 *之前java都是值传递，不能将代码块当成参数进行传递，需要将代码写入类中通过对象进行传递
 *
 * 而lambda表达式可以
 *
 * 函数式接口，对于只有一个抽象方法的接口，需要这种接口的对象的时候，就可以提供一个lambda表达式
 *
 * 方法引用：这一章有点问题
 *
 */
public class LambdaTest {


    public static void main(String[] args) {
        String[] strings ={};
        //lambda表达式，编译器可以通过上下文
        Arrays.sort(strings,(String first,String second) -> first.length()-second.length());
    }
}
