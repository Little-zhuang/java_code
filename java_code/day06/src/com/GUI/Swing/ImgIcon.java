package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/2/3-22:32
 */
public class ImgIcon extends JFrame {

    public static void main(String[] args) {
        new ImgIcon();
    }

    public ImgIcon() {

        JLabel label = new JLabel("ImageIcon");
        //图片地址，和ImgIcon同级目录
        URL url = ImgIcon.class.getResource("tx.jpg");

        ImageIcon imageIcon = new ImageIcon(url);
        label.setIcon(imageIcon);

        //居中
        label.setHorizontalAlignment(SwingConstants.CENTER);

        //容器设置属性
        Container container = getContentPane();
        container.add(label);

        this.setVisible(true);
        this.setBounds(200, 200, 600, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
