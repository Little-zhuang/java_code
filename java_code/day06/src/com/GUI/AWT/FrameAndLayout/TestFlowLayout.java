package com.GUI.AWT.FrameAndLayout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 布局管理器~流式布局
 * 注意：该布局可以设置左中右三种布局位置，默认是中间
 * @author Elke
 * @Description TODO
 * @date 2021/1/29-21:37
 */
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("MyButton");
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

        //窗口(frame)的相关设置
        frame.setBounds(400,400,600,600);
        frame.setBackground(new Color(60, 245, 200));

        //按钮(button)的相关设置
        button1.setBackground(new Color(0, 254, 246));
        button2.setBackground(new Color(0, 254, 246));
        button3.setBackground(new Color(0, 254, 246));

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        //将窗口(frame)设置为流失布局(按钮有左中右三种布局)
        frame.setLayout(new FlowLayout());
//        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
//        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

        frame.setVisible(true);

        //窗口监听
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
