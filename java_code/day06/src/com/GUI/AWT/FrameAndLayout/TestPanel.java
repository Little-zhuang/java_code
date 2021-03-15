package com.GUI.AWT.FrameAndLayout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/1/29-21:05
 */
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame("MyFrame+panel!");
        Panel panel = new Panel();

        //设置布局
        frame.setLayout(null);

        //窗口(frame)大小位置设置
        frame.setBounds(300,300,500,500);

        //窗口(frame)背景颜色设置
        frame.setBackground(new Color(0, 255, 0));

        //面板(panel)位置大小设置(位置是相对于frame)
        panel.setBounds(50,60,400,400);

        //panel背景颜色设置
        panel.setBackground(new Color(103, 239, 239));

        //设置窗口不可拉伸(默认是true可拉伸)
        frame.setResizable(false);

        //将面板(panel)添加到窗口(frame)中
        frame.add(panel);

        //设置窗口可见
        frame.setVisible(true);

        //添加窗口监听事件，点击关闭可以关闭窗口
        //适配其模式：只选择需要的方法重写( new WindowAdapter() )
        frame.addWindowListener(new WindowAdapter() {
            //窗口点击关闭的时候需要做的事情
            @Override
            public void windowClosing(WindowEvent e) {
                //关闭程序 System.exit(0)
                System.exit(0);
            }
        });
    }
}
