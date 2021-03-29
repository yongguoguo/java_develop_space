package com.xdu.javacoretech_1.demo7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * java所有的异常对象都派生于Throwable类
 * 1.Error：系统内部错误和资源耗尽错误
 *
 * 2.excpetion
 * 2.1runtimeexception（非检查性异常）
 * 编译性错误
 * 错误的强制类型转换
 * null
 * 2.2IOexcpetion（检查性异常）
 * 其他异常
 * 文件不存在错误
 *
 *
 *注意父类如果没有抛出检查性异常，那个继承的子类也不能抛出相关的检查性异常
 * 子类可以进行捕获
 *
 *
 *
 *有时候标准的异常类并不能描述清楚问题，我们可以创建自己的异常类需要继承exception超类
 *
 *
 *捕获异常很容易，但是一直没有人对异常进行处理的话，那么程序最终会终止
 * 所以我们需要try，catch语句对异常进行处理
 * 如果try语句块中抛出了catch中声明的异常，
 * 1.程序会跳过try中剩余的代码
 * 2.执行catch中的代码
 *
 *
 *finally语句
 * 因为一旦捕获了异常，代码块就会终止，但是可能之前已经分配了资源
 * 需要将这些资源进行释放
 * 所以不管是否有异常，finally中的语句都会被执行
 * 注意：finally语句的作用是用来清理资源。不能在finally中使用控制流语句
 *
 *
 * java7提供了一个新的try语法
 * try with resource
 *
 * try（res）
 * //res需要继承autoclose接口
 * {
 *     res work
 * }
 * 结束后自动调用close方法
 *同样，可以有catch
 * 和finally语句在资源关闭之后进行调用
 *
 *
 *
 */


public class ExceptionTest extends Throwable {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("a");
        } catch (FileNotFoundException e) {
            var e1= new ExceptionTest("sss");
            e1.printStackTrace();
        }

    }

    public ExceptionTest(){

    }
    public ExceptionTest(String s){
        System.out.println(s);
    }


}
