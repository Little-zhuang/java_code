package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author Elke
 * @Description 密码框
 * @date 2021/2/4-18:39
 */
public class PasswordDemo extends JFrame {

    public static void main(String[] args) {
        new PasswordDemo();
    }

    public PasswordDemo(){
        Container container = getContentPane();

        JPasswordField passwordField = new JPasswordField();

        this.add(passwordField);
        this.setSize(200,100);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
