package com.raps;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RapsRun implements ActionListener {
    JTextField textData1;
    JTextField textData2;
    JTextField textData3;
    JButton button;
    JTextField percentText;
    JTextField percentPriceText;
    RapsFrame rapsFrame;
    JFrame jFrame;


    public void Raps() {
        rapsFrame = new RapsFrame();
        jFrame = rapsFrame.getRapsFrame();
        rapsFrame.createTextFields();
        rapsFrame.createLabels();
        textData1 = rapsFrame.getTextHum();
        textData2 = rapsFrame.getTextPol();
        textData3 = rapsFrame.getTextPri();
        button = rapsFrame.createButtons();
        percentText = rapsFrame.createtextPercentPriceD();
        percentPriceText = rapsFrame.createtextPrice();
        button.addActionListener(this);


        jFrame.setLayout(null);//using no layout managers
        jFrame.setVisible(true);//making the frame visible

    }

    @Override
    public void actionPerformed(ActionEvent e) throws NumberFormatException {

        String s1 = textData1.getText();
        String s2 = textData2.getText();
        String s3 = textData3.getText();

        try {
            double a = Double.parseDouble(s1);
            double b = Double.parseDouble(s2);
            double c = Double.parseDouble(s3);
            double result = a + b + c;
            double result1 = (a + b + c) * 10;

            String resultString = String.valueOf(result);
            percentPriceText.setText(resultString + "%");
            String resultString1 = String.valueOf(result1);
            percentText.setText(resultString1);
            }
        catch (NumberFormatException b) {
            }
    }
}
