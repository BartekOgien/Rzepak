package com.raps.creators;

import javax.swing.*;

public class LabelCreator {
    public final static int POSITION_X = 30;

    public void createLabel(JFrame jFrame, String title, int y, int w, int h) {
        JLabel jLabel = new JLabel(title);
        jLabel.setBounds(POSITION_X, y, w, h);
        jFrame.add(jLabel);
    }

    public void createLabels(JFrame jFrame) {
        createLabel(jFrame, "Wilgotnosc", 20, 100, 40);
        createLabel(jFrame, "Zanieczyszczenie", 110, 120, 40);
        createLabel(jFrame, "Bazowa cena netto", 200, 170, 40);
        createLabel(jFrame, "% ceny po potraceniach:", 290, 170, 80);
        createLabel(jFrame, "Cena po potraceniach:", 380, 170, 80);
    }
}
