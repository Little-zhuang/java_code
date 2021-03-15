package com.GUI.AWT.FrameAndLayout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/1/29-22:16
 */
public class DemoLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("MyGridLayout");

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        Panel p4 = new Panel();

        frame.setSize(400,300);
        frame.setLocation(400,300);
        frame.setLayout(new GridLayout(2,1));
        frame.setVisible(true);

//      布局开始
        p1.setLayout(new BorderLayout());
        p2.setLayout(new GridLayout(2,1));
        p3.setLayout(new BorderLayout());
        p4.setLayout(new GridLayout(2,2));

//      填充内容
        p1.add(new Button("east"),BorderLayout.EAST);
        p1.add(new Button("west"),BorderLayout.WEST);
        p2.add(new Button("btn-1"));
        p2.add(new Button("btn-2"));
        p3.add(new Button("east"),BorderLayout.EAST);
        p3.add(new Button("west"),BorderLayout.WEST);
        for (int i = 0; i < 4; i++) {
            p4.add(new Button("for" + i));
        }

        p1.add(p2,BorderLayout.CENTER);
        p3.add(p4,BorderLayout.CENTER);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.add(p1);
        frame.add(p3);
    }
}
/**
 *布局思路：
 * 1.首先确定最大的底面（即窗口）分为上下两部分（两行一列）
 * 2.上半部分：
 *      1.设置两个面板分别采用流式布局和表格布局
 *      2.左右两边的采用流式布局，中间的采用表格布局（两行一列）
 * 3.下半部分：
 *      1.设置两个面板分别采用流式布局和表格布局
 *      2.左右两边的采用流式布局，中间的采用表格布局（两行两列）
 * 4.将按钮添加到面板上
 * 5.将面板添加到窗口上
 */
