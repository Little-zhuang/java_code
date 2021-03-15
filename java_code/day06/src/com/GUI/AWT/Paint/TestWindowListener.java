package com.GUI.AWT.Paint;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/2/1-21:58
 */
public class TestWindowListener {
    public static void main(String[] args) {
        new WindowFrame("窗口监听");
    }
}

class WindowFrame extends Frame {
    public WindowFrame(String title) {
        super();
        setVisible(true);
        setBounds(400, 300, 400, 300);

        this.addWindowListener(
                //匿名内部类
                new WindowAdapter() {
                    @Override
                    //关闭窗口
                    public void windowClosing(WindowEvent e) {
                        setVisible(false);
                        System.exit(0);
                    }

                    @Override
                    //激活窗口
                    public void windowActivated(WindowEvent e) {
                        WindowFrame windowFrame = (WindowFrame) e.getSource();
                        setTitle("被激活了！");
                        System.out.println("WindowActivated");
                    }
                });
    }
}