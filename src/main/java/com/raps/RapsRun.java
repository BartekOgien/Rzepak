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
    JFrame rapsFrameFull;


    public void Raps() {
        rapsFrame = new RapsFrame();
        rapsFrameFull = rapsFrame.getRapsFrame();
        TextFieldCreator textFieldCreator = new TextFieldCreator();
        textData1 = textFieldCreator.createTextField(rapsFrameFull, 30, 50);
        textData2 = textFieldCreator.createTextField(rapsFrameFull, 30, 140);
        textData3 = textFieldCreator.createTextField(rapsFrameFull, 30, 230);

        rapsFrame.createLabels();

        button = rapsFrame.createButtons();
        percentText = rapsFrame.createtextPercentPriceD();
        percentPriceText = rapsFrame.createtextPrice();

        button.addActionListener(this);
        rapsFrameFull.setLayout(null);
        rapsFrameFull.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) throws NumberFormatException {
        String s1 = textData1.getText();
        String s2 = textData2.getText();
        String s3 = textData3.getText();
        Table table = new Table();
        PriceGenerator priceGenerator = new PriceGenerator();

        try {
            priceGenerator.generatePrice(s1, s2, s3, table, rapsFrameFull, percentPriceText, percentText);
        }

        catch (NumberFormatException b) {
        }
    }
}
