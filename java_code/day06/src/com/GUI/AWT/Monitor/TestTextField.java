package com.GUI.AWT.Monitor;

import java.awt.*;
import java.awt.event.*;

/**
 * @author Elke
 * @Description TODO
 * @date 2021/1/30-12:38
 */
public class TestTextField {
    public static void main(String[] args) {

        MyFrame myFrame = new MyFrame();
        MyAction(myFrame);
    }


    public static void MyAction(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
class MyFrame extends Frame{
    public MyFrame(){
        TextField textField = new TextField();

        setBounds(100,400,500,500);
        setVisible(true);
        add(textField);

        textField.addActionListener(new MyTextListener());
    }

}

class MyTextListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField = (TextField) e.getSource();
        System.out.println(textField.getText());

        //输入内容不可见(密码类)
        textField.setEchoChar('*');

        //回车后内容清空
        textField.setText("");
    }
}
