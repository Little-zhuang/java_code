package com.GUI.AWT.Monitor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Elke
 * @Description 实现一个宫格计算器
 * @date 2021/1/30-18:33
 */
public class DemoCalc {
    public static void main(String[] args) {
        MyCalcFrame myCalcFrame = new MyCalcFrame();

        myCalcFrame.myCalc();
        MyAction(myCalcFrame);
    }

    public static void MyAction(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyCalcFrame extends Frame {
    public void myCalc() {
        Panel result = new Panel();
        Panel button1 = new Panel();
        Panel button2 = new Panel();

        TextField textResult = new TextField();

        //设置按钮
        Button num0 = new Button("0");
        Button num1 = new Button("1");
        Button num2 = new Button("2");
        Button num3 = new Button("3");
        Button num4 = new Button("4");
        Button num5 = new Button("5");
        Button num6 = new Button("6");
        Button num7 = new Button("7");
        Button num8 = new Button("8");
        Button num9 = new Button("9");
        Button zero = new Button("c");
        Button add = new Button("+");
        Button sub = new Button("-");
        Button mul = new Button("x");
        Button div = new Button("/");
        Button deh = new Button("=");

        num0.setActionCommand("0");
        num1.setActionCommand("1");
        num2.setActionCommand("2");
        num3.setActionCommand("3");
        num4.setActionCommand("4");
        num5.setActionCommand("5");
        num6.setActionCommand("6");
        num7.setActionCommand("7");
        num8.setActionCommand("8");
        num9.setActionCommand("9");
        zero.setActionCommand("c");
        add.setActionCommand("+");
        mul.setActionCommand("x");
        div.setActionCommand("/");
        deh.setActionCommand("=");
        sub.setActionCommand("-");

        setLayout(new GridLayout(3, 1));
        result.setLayout(null);
        button1.setLayout(null);

        setBounds(400, 400, 400, 600);
        setBackground(new Color(198, 198, 198));
        setResizable(false);

        result.setBackground(new Color(255, 255, 255));
        result.setBounds(0, 30, 400, 200);

        button1.setLayout(new GridLayout(2, 4));
        button2.setLayout(new GridLayout(2, 4));

        add(result);
        add(button1);
        add(button2);

        //添加按钮
        button1.add(num7);
        button1.add(num8);
        button1.add(num9);
        button1.add(div);
        button1.add(num4);
        button1.add(num5);
        button1.add(num6);
        button1.add(mul);
        button2.add(num1);
        button2.add(num2);
        button2.add(num3);
        button2.add(sub);
        button2.add(zero);
        button2.add(num0);
        button2.add(deh);
        button2.add(add);

        //每个按钮添加监听事件
        num0.addActionListener(new MyActionListener());
        num1.addActionListener(new MyActionListener());
        num2.addActionListener(new MyActionListener());
        num3.addActionListener(new MyActionListener());
        num4.addActionListener(new MyActionListener());
        num5.addActionListener(new MyActionListener());
        num6.addActionListener(new MyActionListener());
        num7.addActionListener(new MyActionListener());
        num8.addActionListener(new MyActionListener());
        num9.addActionListener(new MyActionListener());
        zero.addActionListener(new MyActionListener());
        sub.addActionListener(new MyActionListener());
        div.addActionListener(new MyActionListener());
        mul.addActionListener(new MyActionListener());
        deh.addActionListener(new MyActionListener());
        add.addActionListener(new MyActionListener());

        setVisible(true);
    }
}

class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        int i = -1, j = -1;
        String m = "null";
        if (i == -1) {
            switch (e.getActionCommand()) {
                case "0":
                    i = 0;
                    break;
                case "1":
                    i = 1;
                    break;
                case "2":
                    i = 2;
                    break;
                case "3":
                    i = 3;
                    break;
                case "4":
                    i = 4;
                    break;
                case "5":
                    i = 5;
                    break;
                case "6":
                    i = 6;
                    break;
                case "7":
                    i = 7;
                    break;
                case "8":
                    i = 8;
                    break;
                case "9":
                    i = 9;
                    break;
                default:
                    return;
            }
        } else if (m == null) {
            switch (e.getActionCommand()) {
                case "c":
                    m = "c";
                    break;
                case "+":
                    m = "+";
                    break;
                case "x":
                    m = "x";
                    break;
                case "/":
                    m = "/";
                    break;
                case "-":
                    m = "-";
                    break;
                default:
                    return;
            }
        }


        if (e.getActionCommand().

                equals("=")) {
            System.out.println("=被点击了");
            if (m == "+") {
                System.out.println(i + j);
            }
        }

    }
}
