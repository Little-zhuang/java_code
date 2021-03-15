package com.GUI.Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 * @author Elke
 * @Description 游戏面板
 * @date 2021/2/4-19:01
 */

public class PanelGame extends JPanel implements KeyListener, ActionListener {

    //成绩
    int score;

    //定义蛇的数据结构
    int length; //蛇的长度
    int[] snakeX = new int[600];    //蛇的x坐标
    int[] snakeY = new int[500];    //蛇的y坐标
    String fx;                      //蛇头数据

    //游戏状态 开始，暂停
    boolean isStart = false;    //默认开始
    boolean isFiled = false;    //默认不失败


    //食物坐标
    int foodX;
    int foodY;
    Random random = new Random();

    //定时器   以ms为单位
    Timer timer = new Timer(200,this);  //监听本类，100ms刷新一次

    //构造器
    public PanelGame() {
        init();
        //获得焦点和键盘事件
        this.setFocusable(true);          //获得焦点
        this.addKeyListener(this);      //获得当前类的键盘监听事件
    }

    //初始化方法
    public void init() {
        length = 3;
        snakeX[0] = 100;snakeY[0] = 100;//蛇头
        snakeX[1] = 75; snakeY[1] = 100;//蛇的第一节身体
        snakeX[2] = 50; snakeY[2] = 100;//蛇的第二节身体
        fx = "right";                   //蛇头的初始化方向
        //食物的坐标
        foodX = 25 + 25 * random.nextInt(34);
        foodY = 25 + 25 * random.nextInt(26);

        score = 0;                      //成绩

        timer.start();                  //游戏一开始，定时器就启动
    }

    //绘制面板
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //绘制静态面板
        this.setBackground(Color.WHITE);
        g.fillRect(25, 25, 850, 650);      //默认游戏面板
        g.setColor(Color.BLACK);

        //把食物画上去
        Data.food.paintIcon(this,g,foodX,foodY);

        //把小蛇画上去
        if(fx.equals("right")){
            Data.right.paintIcon(this,g,snakeX[0],snakeY[0]);   //蛇头初始化向右，通过判断来确定蛇头的方向
        }else if(fx.equals("up")){
            Data.up.paintIcon(this,g,snakeX[0],snakeY[0]);      //蛇头初始化向右，通过判断来确定蛇头的方向
        }else if(fx.equals("left")){
            Data.left.paintIcon(this,g,snakeX[0],snakeY[0]);    //蛇头初始化向右，通过判断来确定蛇头的方向
        }else if (fx.equals("down")){
            Data.down.paintIcon(this,g,snakeX[0],snakeY[0]);    //蛇头初始化向右，通过判断来确定蛇头的方向
        }
        for (int i = 1; i < length; i++) {
            Data.body.paintIcon(this,g,snakeX[i],snakeY[i]);
        }

        //画成绩
        if (length != 0){
            g.setColor(Color.green);
            g.setFont(new Font("微软雅黑",Font.BOLD,24));
            g.drawString("分数"+(length - 3) * 10,400,20);
        }

        //游戏状态
        if (isStart == false){
            g.setColor(Color.white);
            g.setFont(new Font("微软雅黑",Font.BOLD,32));
            g.drawString("按下空格开始游戏！",330,300);
        }
        if (isFiled == true){
            g.setColor(Color.red);
            g.setFont(new Font("微软雅黑",Font.BOLD,32));
            g.drawString("游戏失败，按下空格重新开始游戏！",220,300);
        }

    }

    //键盘监听
    @Override
    public void keyPressed(KeyEvent e) {
        //1. 获得键盘的KeyCode
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_SPACE){
            if (isFiled){   //重新开始
                isFiled = false;
                init();
            }else {
                isStart =! isStart;
            }

            repaint();
        }else if (keyCode == KeyEvent.VK_UP){
            fx = "up";
            repaint();
        }else if (keyCode == KeyEvent.VK_RIGHT){
            fx = "right";
            repaint();
        }else if (keyCode == KeyEvent.VK_DOWN){
            fx = "down";
            repaint();
        }else if (keyCode == KeyEvent.VK_LEFT){
            fx = "left";
            repaint();
        }
    }

    //事件监听---定时器
    @Override
    public void actionPerformed(ActionEvent e) {
        if (isStart == true && isFiled == false){       //如果开始状态，小蛇开始动，默认向右移动

            //吃食物
            if (snakeX[0] == foodX && snakeY[0] == foodY){
                //吃完食物小蛇的长度+1
                length++;

                //随机产生新食物
                foodX = 25 + 25 * random.nextInt(34);
                foodY = 25 + 25 * random.nextInt(26);
            }

            //移动
            for (int i = length - 1; i > 0 ; i--) {
                //后一节移动到前一节的位置snakeX[1] = snakeX[0];
                snakeX[i] = snakeX[i-1];
                snakeY[i] = snakeY[i-1];
            }

            //脑袋走向
            if (fx.equals("up")){
                snakeY[0] = snakeY[0] - 25;
            }else if (fx.equals("right")){
                snakeX[0] = snakeX[0] + 25;
            }else if (fx.equals("down")){
                snakeY[0] = snakeY[0] + 25;
            }else if (fx.equals("left")){
                snakeX[0] = snakeX[0] - 25;
            }

            //失败判断，撞到四周
            if (snakeY[0] == 25){
                isFiled = true;
            }else if (snakeX[0] ==850){
                isFiled = true;
            }else if (snakeY[0] == 650){
                isFiled = true;
            }else if (snakeX[0] == 25){
                isFiled = true;
            }
            //撞到自己 首先遍历出身体的坐标，判断头和身体的坐标是否重合
//            for (int i = 1; i < length; i++) {
//                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]){
//                    isFiled = true;
//                }
//            }
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}

}
