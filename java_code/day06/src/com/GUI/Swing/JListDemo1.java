package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * @author Elke
 * @Description 列表框
 * @date 2021/2/4-18:16
 */
public class JListDemo1 extends JFrame {
    public static void main(String[] args) {
        new JListDemo1();
    }

    public JListDemo1() {
        super("列表框");
        Container container = getContentPane();

        //1.静态添加内容
//        String[] contents = {"1", "2", "3"};

        //2.可实现动态添加内容
        Vector vector = new Vector();
        //需要呈现的内容
        JList list = new JList(vector);

        vector.add("张三");
        vector.add("李四");
        vector.add("王五");


        this.add(list);
        this.setSize(200, 150);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
/**
 * 一般用来展示信息，动态扩容
 */