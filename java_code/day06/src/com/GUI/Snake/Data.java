package com.GUI.Snake;

import com.GUI.Swing.ImgIcon;

import javax.swing.*;
import java.net.URL;

/**
 * @author Elke
 * @Description 游戏数据中心
 * @date 2021/2/4-19:14
 */
public class Data {

    //相对路径  tx.png
    //绝对路径  /   相当于当前的项目

    //蛇的头
    public static URL upURL = Data.class.getResource("static/up.png");
    public static URL rightURL = Data.class.getResource("static/right.png");
    public static URL downURL = Data.class.getResource("static/down.png");
    public static URL leftURL = Data.class.getResource("static/left.png");

    public static ImageIcon up = new ImageIcon(upURL);
    public static ImageIcon right = new ImageIcon(rightURL);
    public static ImageIcon down = new ImageIcon(downURL);
    public static ImageIcon left = new ImageIcon(leftURL);

    //蛇的身体
    public static URL bodyURL = Data.class.getResource("static/body.png");
    public static ImageIcon body = new ImageIcon(bodyURL);

    //蛇的食物
    public static URL foodURL = Data.class.getResource("static/food.png");
    public static ImageIcon food = new ImageIcon(foodURL);
}
