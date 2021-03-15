package com.GUI.AWT.Monitor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Elke
 * @Description 按钮事件监听
 * @date 2021/1/30-11:35
 */
public class TestActionEvent1 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button = new Button();

        frame.setBounds(200,200,500,500);
        frame.setBackground(new Color(0, 255, 255));

        frame.setVisible(true);
        frame.add(button,BorderLayout.CENTER);
        WindowClosed(frame);

        //需要一个按钮事件监听
        //自己写一个
        MyAction1 myAction = new MyAction1();
        button.addActionListener(myAction);
    }

    //关闭窗口的方法
    public static void WindowClosed(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

//事件监听
//内容自己写
class MyAction1 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("点击了一下按钮！");
    }
}

