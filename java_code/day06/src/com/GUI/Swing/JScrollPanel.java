package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/2/4-12:04
 */
public class JScrollPanel extends JFrame {
    public static void main(String[] args) {
        new JScrollPanel();
    }

    public JScrollPanel() {
        Container container = getContentPane();

        //文本域
        JTextArea textArea = new JTextArea(10, 20);
        textArea.setText("欢迎来到文本域！");

        //滚动面板
        JScrollPane scrollPane = new JScrollPane(textArea);

        container.add(scrollPane);
        this.setBounds(200, 200, 300, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
