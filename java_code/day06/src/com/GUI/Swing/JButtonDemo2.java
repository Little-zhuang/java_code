package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author Elke
 * @Description radiobutton单选按钮
 * @date 2021/2/4-12:33
 */
public class JButtonDemo2 extends JFrame {
    public static void main(String[] args) {
        new JButtonDemo2();
    }
    public JButtonDemo2() {
        Container container = getContentPane();

        //单选框
        JRadioButton radioButton1 = new JRadioButton("radioButton1");
        JRadioButton radioButton2 = new JRadioButton("radioButton2");
        JRadioButton radioButton3 = new JRadioButton("radioButton3");

        //放在一个按钮组里面,一个组里面只能选择一个
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        this.add(radioButton1,BorderLayout.NORTH);
        this.add(radioButton2,BorderLayout.CENTER);
        this.add(radioButton3,BorderLayout.SOUTH);
        this.setSize(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
