package com.GUI.AWT.FrameAndLayout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 布局管理器~表格布局
 * 注意：该布局不需要设置布局位置，自动布局
 * @author Elke
 * @Description TODO
 * @date 2021/1/29-22:04
 */
public class TestGridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("MyGridLayout");

        Button btn1 = new Button("btn1");
        Button btn2 = new Button("btn2");
        Button btn3 = new Button("btn3");
        Button btn4 = new Button("btn4");
        Button btn5 = new Button("btn5");
        Button btn6 = new Button("btn6");

        //设置表格布局（几行几列）
        frame.setLayout(new GridLayout(2,3));
//        frame.setSize(500,500);

        //将按钮放进去会自动排列
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);

        frame.pack();//自动填充
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
