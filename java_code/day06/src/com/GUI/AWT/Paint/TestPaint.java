package com.GUI.AWT.Paint;

import java.awt.*;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/1/31-19:23
 */
public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadPaint();
    }
}

class MyPaint extends Frame{

    public void loadPaint(){
        setVisible(true);
        setBounds(300,300,600,400);

    }

    //画笔
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(100,100,300,200);
        g.fillRect(100,100,300,200);
    }

}
