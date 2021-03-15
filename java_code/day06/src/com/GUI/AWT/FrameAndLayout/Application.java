package com.GUI.AWT.FrameAndLayout;

import java.awt.*;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/1/29-16:50
 */
public class Application {
    public static void main(String[] args) {

        //展示多个窗口
        MyFrame myFrame1 = new MyFrame(200,200,400,400, Color.blue);
        MyFrame myFrame2 = new MyFrame(200,600,400,400, Color.yellow);
        MyFrame myFrame3 = new MyFrame(600,200,400,400, Color.GRAY);
        MyFrame myFrame4 = new MyFrame(600,600,400,400, Color.PINK);
    }
}

//封装
//Frame 窗口
class MyFrame extends Frame {
    //计算共有几个窗口
    static int count = 0;

    public MyFrame(int x,int y,int w, int h, Color color){
        super("MyFrame" + (++count));
        setVisible(true);
        setSize(w,h);
        setLocation(x,y);
        setResizable(false);
        setBackground(color);
    }
}