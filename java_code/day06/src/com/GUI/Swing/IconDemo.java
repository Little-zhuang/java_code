package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/2/3-22:12
 */
public class IconDemo extends JFrame implements Icon{

    public static void main(String[] args) {
        new IconDemo().init();
    }

    private int width;
    private int height;

    public IconDemo(){};
    public IconDemo(int width, int height){
        this.height = height;
        this.width = width;
    }

    public void init(){
        this.setBounds(200,200,200,200);
        this.setVisible(true);

        IconDemo icon = new IconDemo(15,15);

        //icon可以放在label上，也可以放在button上
        JLabel label = new JLabel("icon", icon, SwingConstants.CENTER);

        Container container = this.getContentPane();
        container.setVisible(true);
        container.add(label);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,width,height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
