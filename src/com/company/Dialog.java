package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Map;

public class Dialog extends JDialog implements Comparator{
    JTextArea area1 = new JTextArea(10, 20);
    public Dialog(JFrame fr){
        super(fr, "Диалоговое окно", true);
        setBounds(850,400,300,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Font f = new Font( "Verdana", Font.BOLD, 14);
        area1.setFont(f);
        area1.setLineWrap(true);

        JScrollPane scroll = new JScrollPane (area1);
        scroll = new JScrollPane(area1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(scroll, BorderLayout.CENTER);
        int a = 1;
        for(int i= data.size()-1;i > -1;i--) {
            System.out.println(data.size());
            area1.append(a + ") "+data.get(i).getKey() + " " + data.get(i).getValue() + "\n");
            a++;
        }
        setVisible(true);
    }

    @Override
    public void sort(List<Map.Entry<Double, String>> array, int low, int high) {}
}
