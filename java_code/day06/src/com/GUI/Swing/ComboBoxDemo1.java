package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author Elke
 * @Description ComboBox下拉框
 * @date 2021/2/4-18:06
 */
public class ComboBoxDemo1 extends JFrame {

    public static void main(String[] args) {
        new ComboBoxDemo1();
    }

    public ComboBoxDemo1(){
        super("下拉框");
        Container container = getContentPane();

        JComboBox status = new JComboBox();

        status.addItem("环太平洋2");
        status.addItem("送你一朵小红花");
        status.addItem("急先锋");
        status.addItem("大闹天宫");
        status.addItem("唐人街探案3");
        status.addItem("变形金刚");

        this.add(status);

        this.setSize(300,100);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
/**
 * 地区选项按钮等，选中哪个地区，只显示选中地区的内容
 */