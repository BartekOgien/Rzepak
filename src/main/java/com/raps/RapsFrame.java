package com.raps;

import javax.swing.*;

public class RapsFrame {
    JFrame rapsFrame;
    JTextField textHum;
    JTextField textPol;
    JTextField textPri;


    public RapsFrame() {
        rapsFrame = new JFrame("Rzepak");//creating instance of JFrame
        rapsFrame.setSize(400, 540);//400 width and 500 height

    }

    public void createTextFields() {
        JTextField textHumidity=new JTextField();
        textHumidity.setBounds(30,50, 60,25);
        textHumidity.setText("");
        rapsFrame.add(textHumidity);
        textHum = textHumidity;

        JTextField textPollution=new JTextField();
        textPollution.setBounds(30,140, 60,25);
        textPollution.setText("");
        rapsFrame.add(textPollution);
        textPol = textPollution;

        JTextField textPrice=new JTextField();
        textPrice.setBounds(30,230, 60,25);
        textPrice.setText("");
        rapsFrame.add(textPrice);
        textPri = textPrice;
    }

    public void createLabels() {
        JLabel labelHumidity = new JLabel("Wilgotność:");
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

        JLabel labelPriceAfter = new JLabel("Cena po potrąceniach:");
        labelPriceAfter.setBounds(30, 380, 170, 80);
        rapsFrame.add(labelPriceAfter);

    }

    public JButton createButtons() {
        JButton buttonWork = new JButton("Oblicz");//creating instance of JButton
        buttonWork.setBounds(250, 330, 100, 40);
        rapsFrame.add(buttonWork);//adding button in JFrame
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

    public JTextField getTextHum() {
        return textHum;
    }

    public JTextField getTextPol() {
        return textPol;
    }

    public JTextField getTextPri() {
        return textPri;
    }
}
