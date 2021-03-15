package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/2/1-22:54
 */
public class TestJFrame {
    public static void main(String[] args) {
        new MyJFrame().init();
    }
}
class MyJFrame extends JFrame{
    public void init(){
        this.setVisible(true);
        this.setBounds(200,200,400,300);

        //设置字体
        JLabel jLabel = new JLabel("hello JFrame!");

        this.add(jLabel);

        //设置label文本居中
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);


        //获得一个容器，
        Container contentPane = this.getContentPane();
        contentPane.setBackground(Color.green);

        //关闭事件(默认是HIDE_ON_CLOSE)
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}