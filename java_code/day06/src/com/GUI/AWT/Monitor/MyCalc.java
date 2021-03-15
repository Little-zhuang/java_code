package com.GUI.AWT.Monitor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/1/31-11:30
 */
public class MyCalc {
    public static void main(String[] args) {
        new Calc().loadFrame();
    }

}

class Calc extends Frame {

    //属性
    TextField num1, num2, num3;

    //方法(计算器类)
    public void loadFrame() {
        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(20);
        Label label = new Label("+");

        Button button = new Button("=");
        button.addActionListener(new CalcActionListener());

        setLocation(500, 500);
        setBackground(new Color(220, 220, 220));
        setLayout(new FlowLayout());
        setVisible(true);

        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        pack();
    }

    //监听器类
    class CalcActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            //1，获取num1和num2
            //Integer.parseInt()将字符型转为int型
            //2.进行加法运算,将结果返回到num3
            //3.清空前两个框

            int i = Integer.parseInt(num1.getText());
            int j = Integer.parseInt(num2.getText());

            num3.setText("" + (i + j));
            num1.setText("");
            num2.setText("");
        }
    }
}
