package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author Elke
 * @Description imageIcon图标
 * @date 2021/2/4-12:23
 */
public class JButtonDemo1 extends JFrame {
    public static void main(String[] args) {
        new JButtonDemo1();
    }

    public JButtonDemo1(){
        Container container = getContentPane();

        //将一个图片变为图标
        URL resource = JButtonDemo1.class.getResource("tx.jpg");
        Icon icon = new ImageIcon(resource);

        //将图标放在按钮上
        JButton button = new JButton();
        button.setIcon(icon);
        //提示文字
        button.setToolTipText("图标按钮");

        //add
        this.add(button);
        this.setSize(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
