package com.raps;

import javax.swing.*;

public class RapsFrame {
    JFrame rapsFrame;


    public RapsFrame() {
        rapsFrame = new JFrame("Rzepak");
        rapsFrame.setSize(400, 540);

    }


    public void createLabels() {
        JLabel labelHumidity = new JLabel("Wilgotnosc:");
        labelHumidity.setBounds(30, 20, 100, 40);
        rapsFrame.add(labelHumidity);

        JLabel labelPollution = new JLabel("Zanieczyszczenie:");
        labelPollution.setBounds(30, 110, 120, 40);
        rapsFrame.add(labelPollution);

        JLabel labelPrice = new JLabel("Bazowa cena netto:");
        labelPrice.setBounds(30, 200, 170, 40);
        rapsFrame.add(labelPrice);

        JLabel labelPercentPrice = new JLabel("% ceny po potrąceniach:");
        labelPercentPrice.setBounds(30, 290, 170, 80);
        rapsFrame.add(labelPercentPrice);

        JLabel labelPriceAfter = new JLabel("Cena po potraceniach:");
        labelPriceAfter.setBounds(30, 380, 170, 80);
        rapsFrame.add(labelPriceAfter);

    }

    public JButton createButtons() {
        JButton buttonWork = new JButton("Oblicz");
        buttonWork.setBounds(250, 330, 100, 40);
        rapsFrame.add(buttonWork);
        return buttonWork;
    }

    public JTextField createtextPrice() {
        JTextField textPriceAfter=new JTextField();
        textPriceAfter.setBounds(30,340, 60,25);
        textPriceAfter.setText("");
        textPriceAfter.setEditable(false);
        rapsFrame.add(textPriceAfter);
        return textPriceAfter;
    }

    public JTextField createtextPercentPriceD() {
        JTextField textPercentPricer=new JTextField();
        textPercentPricer.setBounds(30,430, 60,25);
        textPercentPricer.setText("");
        textPercentPricer.setEditable(false);
        rapsFrame.add(textPercentPricer);
        return textPercentPricer;
    }

    public JFrame getRapsFrame() {
        return rapsFrame;
    }

}
