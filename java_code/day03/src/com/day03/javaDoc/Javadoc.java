package com.day03.javaDoc;

/**
 * 参数说明:
 * 快捷键 输入/** +enter
 * @author 作者名
 * @version 版本号
 * @since 指明最早需要使用的Java版本
 * @param 参数名
 * @return 返回值
 * @throws 异常抛出情况
 *
 *
 * @author zhuang
 * @version 1.0
 * @since 1.8
 */
public class Javadoc {
    String name;

    /**
     *
     * @param name
     * @return
     */
    public String test(String name){
        return name;
    }

    /**
     *
     * @param a
     * @return
     * @throws Exception
     */
    public int demo(int a) throws Exception{
        return a;
    }
}
/**
 * 生成javadoc命令
 * 在cmd中找到Java文件路径，输入javadoc -encoding UTF－8　－charset　UTF－8　Java文件.Java
 */