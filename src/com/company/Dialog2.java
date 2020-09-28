package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;

public class Dialog2 extends JDialog implements Comparator{
    JLabel lbl = new JLabel("Введите имя ученика: ");
    JLabel lbl2 = new JLabel("");
    JTextField fld= new JTextField("");
    JButton btn = new JButton("Ок");
    JPanel pnl = new JPanel();
    public Dialog2(JFrame fr){
        super(fr, "Диалоговое окно", true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(850,400,400,500);
        pnl.setLayout(null);
        lbl.setBounds(100,50, 150, 35);
        fld.setBounds(100, 100, 150, 35);
        btn.setBounds(100, 150, 50, 30);
        lbl2.setBounds(100,200, 150, 35);
        pnl.add(lbl);
        pnl.add(lbl2);
        pnl.add(btn);
        pnl.add(fld);
        add(pnl);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    boolean check = false;
                    for (int i = 0; i < data.size(); i++) {
                        if (data.get(i).getValue().equals(fld.getText())) {
                            lbl2.setText(data.get(i).getKey() + " " + data.get(i).getValue());
                            check = true;
                        }
                    }
                    if (!check){
                        throw new StudentFoundExeption();
                    }
                }
                 catch (StudentFoundExeption err) {
                    lbl2.setText(err.Error());
                }
            }
        });
        setVisible(true);
    }

    @Override
    public void sort(List<Map.Entry<Double, String>> array, int low, int high) {

    }
}
