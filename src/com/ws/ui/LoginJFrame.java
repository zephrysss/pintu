package com.ws.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame
{
    public LoginJFrame()
    {

        this.setSize(603,680);
        //设置标题
        this.setTitle("拼图:登录");
        //置顶
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
    }
}
