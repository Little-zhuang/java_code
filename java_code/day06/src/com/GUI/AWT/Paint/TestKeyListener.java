package com.GUI.AWT.Paint;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/2/1-22:30
 */
public class TestKeyListener {
    public static void main(String[] args) {
        new KeyFrame("键盘监听");
    }
}
class KeyFrame extends Frame {
    public KeyFrame(String title){
        super();
        setBounds(200,200,600,400);
        setVisible(true);

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                //获得键盘上的键是哪一个，键盘的码
                int keyCode = e.getKeyCode();

                if (keyCode == KeyEvent.VK_UP){
                    System.out.println("按下了上键！");
                }else if (keyCode == KeyEvent.VK_LEFT){
                    System.out.println("按下了左键！");
                }else if (keyCode == KeyEvent.VK_DOWN){
                    System.out.println("按下了下键！");
                }else if (keyCode == KeyEvent.VK_RIGHT){
                    System.out.println("按下了右键！");
                }
            }
        });
    }
}