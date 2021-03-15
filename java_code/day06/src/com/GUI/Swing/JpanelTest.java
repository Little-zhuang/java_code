package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/2/4-11:32
 */
public class JpanelTest extends JFrame {

    public static void main(String[] args) {
        new JpanelTest();
        
    }
    public JpanelTest(){
        Container container = getContentPane();
        this.setLayout(new GridLayout(2,1,10,10));
        this.setBounds(200,200,600,400);

        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        jPanel1.setLayout(new GridLayout(2,2,5,20));
        jPanel1.setBackground(Color.green);
        jPanel2.setLayout(new GridLayout(2,2,20,5));
        jPanel2.setBackground(Color.CYAN);

        jPanel1.add(new JButton());
        jPanel1.add(new JButton());
        jPanel1.add(new JButton());
        jPanel1.add(new JButton());

        jPanel2.add(new JButton());
        jPanel2.add(new JButton());
        jPanel2.add(new JButton());
        jPanel2.add(new JButton());

        this.add(jPanel1);
        this.add(jPanel2);


        this.setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
