package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author Elke
 * @Description checkbox多选框
 * @date 2021/2/4-17:50
 */
public class JButtonDemo3 extends JFrame {
    public static void main(String[] args) {
        new JButtonDemo3();
    }


    public JButtonDemo3() {

        Container container = getContentPane();
        container.setLayout(new GridLayout(2, 3));

        //多选框
        JCheckBox checkBox1 = new JCheckBox("checkBox1");
        JCheckBox checkBox2 = new JCheckBox("checkBox2");
        JCheckBox checkBox3 = new JCheckBox("checkBox3");
        JCheckBox checkBox4 = new JCheckBox("checkBox4");
        JCheckBox checkBox5 = new JCheckBox("checkBox5");
        JCheckBox checkBox6 = new JCheckBox("checkBox6");

        container.add(checkBox1);
        container.add(checkBox2);
        container.add(checkBox3);
        container.add(checkBox4);
        container.add(checkBox5);
        container.add(checkBox6);


        this.setSize(400, 300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
