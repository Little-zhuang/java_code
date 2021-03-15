package com.GUI.AWT.FrameAndLayout;


import java.awt.*;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/1/29-16:17
 */
public class TestFrame {
    public static void main(String[] args) {
        //实例化Frame对象    标题
        Frame frame = new Frame("我的第一个Frame窗口！");

        //设置窗口可见性
        frame.setVisible(true);

        //窗口大小
        frame.setSize(400, 400);

        //窗口背景颜色
        frame.setBackground(new Color(57, 255, 247));

        //弹出的初始位置
        frame.setLocation(400, 400);

        //设置窗口不可拉伸
        frame.setResizable(false);

    }
}
