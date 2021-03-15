package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/2/1-23:32
 */

//主窗口
public class Dialog extends JFrame {

    public static void main(String[] args) {
        new Dialog();
    }
    public Dialog(){
        this.setVisible(true);
        this.setBounds(300,200,500,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        //JFrame容器，放东西,     获得这个容器
        Container container = this.getContentPane();
        //绝对布局
        container.setLayout(null);

        JButton button = new JButton("点击打开一个新窗口！");
        button.setBounds(30,30,120,20);
        this.add(button);

        //监听按钮，新打开一个弹窗
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //弹窗
                new MyDialog();
            }
        });
    }

}
//写一个弹窗

class MyDialog extends JDialog{
    public MyDialog() {
        this.setVisible(true);
        this.setLayout(null);
        this.setBounds(20,30,200,100);

        Container container = new Container();
        container.add(new JLabel("Diala"));
    }
}

