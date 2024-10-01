package com.ws.ui;

import javax.swing.*;

public class gameJframe extends JFrame  {
    //gameJframe表示游戏主界面
    public  gameJframe()
    {

        initjFrame();

        initJMenuBar();
        //初始化图片
        initImage();

        this.setVisible(true);
    }

    private void initImage() {
        int number=1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel jLabel=new JLabel(new ImageIcon("C:\\Users\\16780\\IdeaProjects\\pintu\\image\\animal\\animal3\\"+number+".jpg"));
                //最后一张也有jlabel，只不过没有加入图片
                jLabel.setBounds(105*j,105*i,105,105);

                this.getContentPane().add(jLabel);
                number++;

            }

        }


        //创建ImageIcon
        //创建Jlabel



    }


    private void initJMenuBar() {
        //初始化菜单
        //出啊关键菜单
        JMenuBar jMenuBar=new JMenuBar();
        JMenu functionMenu=new JMenu("功能");
        JMenu aboutMenu=new JMenu("关于我们");
        JMenuItem replayItem=new JMenuItem("重新游戏");
        JMenuItem reloginItem=new JMenuItem("重新登录");
        JMenuItem closeItem=new JMenuItem("关闭游戏");
        JMenuItem accountItem=new JMenuItem("公众号");
        functionMenu.add(replayItem);
        functionMenu.add(reloginItem);
        functionMenu.add(replayItem);
        functionMenu.add(closeItem);
        aboutMenu.add(accountItem);
        //菜单添加
        jMenuBar.add(functionMenu);
        jMenuBar.add(aboutMenu);
        this.setJMenuBar(jMenuBar);
    }

    private void initjFrame() {
        //设置宽高
        this.setSize(603,680);
        //设置标题
        this.setTitle("拼图单机版");
        //置顶
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);

        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认居中放置
        this.setLayout(null);
    }

}
