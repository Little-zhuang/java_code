package com.GUI.AWT.FrameAndLayout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 布局管理器~东西南北中布局（环绕型布局）
 * 注意：该布局一般需设置布局位置（即位置在东、西、南、北还是中间）
 * @author Elke
 * @Description TODO
 * @date 2021/1/29-21:53
 */
public class TestBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("MyBorderLayout");

        Button east = new Button("East");
        Button west = new Button("West");
        Button south = new Button("South");
        Button north = new Button("North");
        Button center = new Button("Center");

        frame.setBounds(200,200,500,500);

        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(north,BorderLayout.NORTH);
        frame.add(center,BorderLayout.CENTER);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
