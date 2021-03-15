package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/2/4-18:32
 */
public class TextDemo1 extends JFrame {

    public static void main(String[] args) {
        new TextDemo1();
    }

    public TextDemo1(){
        Container container = getContentPane();

        JTextField textField1 = new JTextField("hello");
        JTextField textField2 = new JTextField("world");

        this.add(textField1,BorderLayout.NORTH);
        this.add(textField2,BorderLayout.CENTER);
        this.pack();
//        this.setSize(300,160);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
