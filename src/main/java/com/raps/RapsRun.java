package com.raps;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

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

    public String doubleWithoutDot(String number) {
        return number.replaceAll(",", ".");
    }

    public double roundByTwoPlace(double number) {
        return (Math.round(number*100))/100;
    }

    @Override
    public void actionPerformed(ActionEvent e) throws NumberFormatException {

        String s1 = textData1.getText();
        String s2 = textData2.getText();
        String s3 = textData3.getText();
        Table table = new Table();

        try {
            s1 = doubleWithoutDot(s1);
            s2 = doubleWithoutDot(s2);
            s3 = doubleWithoutDot(s3);
            double a = Double.parseDouble(s1);
            double b = Double.parseDouble(s2);
            double c = Double.parseDouble(s3);
            if(a < 6 || a>15.5 || b < 0.1 || b > 10.5) {
                try {
                    JOptionPane.showMessageDialog(jFrame, "Wilgotność lub zanieczyszczenie wykracza poza zakres tabeli \n" +
                            "Wilgotność powinna byc z przedziału 6 - 15,5 \n" +
                            "Zanieczyszczenie 0,1 - 10,5");
                } catch (IllegalComponentStateException ei) {

                }
            }
            else {
                BigDecimal result = table.getValueFromParameters(a, b);
                result = result.setScale(2, RoundingMode.HALF_UP);
                BigDecimal result1 = result.divide(new BigDecimal(100));
                result1 = result1.multiply(BigDecimal.valueOf(c));
                result1 =  result1.setScale(2, RoundingMode.HALF_UP);

                String resultString = String.valueOf(result);
                percentPriceText.setText(resultString + "%");
                String resultString1 = String.valueOf(result1);
                percentText.setText(resultString1);
            }

            }
        catch (NumberFormatException b) {
            }
    }
}
