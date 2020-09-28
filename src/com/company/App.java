package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;

public class App extends JFrame implements Comparator{
    JButton btn = new JButton("Сортировка");
    JButton btn2 = new JButton("Поиск");
    JTextArea area1 = new JTextArea(10, 20);
    JPanel pnl = new JPanel();
    public Dialog d;
    public Dialog2 d2;
    public App(){
        super("kavo");
        setSize(500,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font f = new Font( "Verdana", Font.BOLD, 14);
        pnl.setLayout(null);
        btn.setBounds(100,100,130, 35);
        btn2.setBounds(100,150,130, 35);
        pnl.add(btn);
        pnl.add(btn2);
        add(pnl);
        setVisible(true);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d = new Dialog(App.this);
                //d.setVisible(true);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d2 = new Dialog2(App.this);
            }
        });
    }

    @Override
    public void sort(List<Map.Entry<Double, String>> array, int low, int high) {

    }
}
