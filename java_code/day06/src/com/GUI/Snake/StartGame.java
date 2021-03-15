package com.GUI.Snake;

import javax.swing.*;
import java.awt.*;

/**
 * @author Elke
 * @Description 游戏主启动类
 * @date 2021/2/4-18:47
 */

public class StartGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("贪吃蛇小游戏");

        frame.add(new PanelGame());
        frame.setVisible(true);
        frame.setBounds(300,150,920,725);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}
