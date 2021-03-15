package com.GUI.AWT.Paint;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Elke
 * @Description 实现鼠标点击一次画一个点
 * @date 2021/2/1-11:42
 */
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画板");
    }
}

class MyFrame extends Frame{

    //数组用来存放鼠标点击的点
    ArrayList points;

    //构造器   窗口画板
    public MyFrame(String title){
        super(title);
        setBounds(200,200,600,400);
        setVisible(true);

        points = new ArrayList<>();
        addMouseListener(new MyMouseListener());
    }

    //画笔
    @Override
    public void paint(Graphics g) {
        //通过迭代器将数组里面的点画到面板上
        Iterator iterator = points.iterator();
        while (iterator.hasNext()){
            Point point = (Point) iterator.next();
            g.setColor(Color.red);
            g.fillOval(point.x, point.y,10,10);
        }
    }

    //添加一个点到数组里面
    public void addPaint(Point point){
        points.add(point);
    }

    //鼠标监听
    private class MyMouseListener extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            //获取面板上鼠标点击的点的信息
            MyFrame myFrame = (MyFrame) e.getSource();
            myFrame.addPaint(new Point(e.getX(),e.getY()));

            //每次点击鼠标重画一次
            myFrame.repaint();
        }
    }
}
/**
 * 思路：
 * 1.一个frame面板
 * 2.一个画笔
 * 3.鼠标监听
 * 4.将鼠标点击的点存放在一个数组中
 * 5.画笔读取数组中的点
 * 6.画笔根据数组中的点绘制图形
 */