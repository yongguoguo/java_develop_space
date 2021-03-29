package com.xdu.javacoretech_1.demo7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 日志API（解决我们经常使用sout方法，用来测试）
 *   很多应用会使用其他日志框架
 *   log4j 2.0
 *   logback
 *
 *
 * 通过编辑配置文件来修改日志系统的各个属性
 * 日志部分东西太多
 * 用的时候再看吧
 *
 */
public class LogTest {
    private static final Logger logger = Logger.getLogger("com.xdu.demo7");
    public static void main(String[] args) {
        //基本日志1
        Logger.getGlobal().info("rizhi");
        logger.log(Level.WARNING,"2222");
        logger.config("123");
    }
}
