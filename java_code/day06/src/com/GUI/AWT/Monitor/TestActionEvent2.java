package com.GUI.AWT.Monitor;

import java.awt.*;
import java.awt.event.*;

/**
 * @author Elke
 * @Description 两个按钮共用一个事件监听
 * @date 2021/1/30-11:58
 */
public class TestActionEvent2 {
    public static void main(String[] args) {
        Frame frame = new Frame("开始-结束");
        Button btn1 = new Button("start");
        Button btn2 = new Button("stop");

        frame.setSize(200, 100);
        frame.setVisible(true);
        frame.add(btn1, BorderLayout.NORTH);
        frame.add(btn2, BorderLayout.SOUTH);
        frame.pack();

        MyAction2 action = new MyAction2();

        btn1.setActionCommand("btn-start");
        btn2.setActionCommand("btn-stop");

        btn1.addActionListener(action);
        btn2.addActionListener(action);

        WindowClosed(frame);
    }

    //关闭窗口的方法
    public static void WindowClosed(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyAction2 implements ActionListener {

    //按钮事件监听
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("btn-start")) {
            System.out.println("start按钮被点击了 => " + e.getActionCommand());
        } else {
            System.out.println("stop按钮被点击了 => " + e.getActionCommand());
        }
    }

}
/**
 * setActionCommand和 getActionCommand
 * 先者设置按钮参数
 * 后者获取按钮参数
 */
