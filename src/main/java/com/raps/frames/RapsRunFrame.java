package com.raps.frames;


import com.raps.creators.PriceGenerator;
import com.raps.creators.LabelCreator;
import com.raps.creators.TextFieldCreator;
import com.raps.tables.Table;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RapsRunFrame implements ActionListener {
    JTextField textHumidity;
    JTextField textPollution;
    JTextField textBasePrice;
    JButton buttonCalculate;
    JTextField percentText;
    JTextField percentPriceText;
    RapsFrame rapsFrame;
    JFrame rapsFrameFull;


    public void Raps() {
        rapsFrame = new RapsFrame();
        rapsFrameFull = rapsFrame.getRapsFrame();
        TextFieldCreator textFieldCreator = new TextFieldCreator();
        textHumidity = textFieldCreator.createTextField(rapsFrameFull, LabelCreator.POSITION_X, 50);
        textPollution = textFieldCreator.createTextField(rapsFrameFull, LabelCreator.POSITION_X, 140);
        textBasePrice = textFieldCreator.createTextField(rapsFrameFull, LabelCreator.POSITION_X, 230);
        LabelCreator labelCreator = new LabelCreator();
        labelCreator.createLabels(rapsFrameFull);
        buttonCalculate = rapsFrame.createButtons();
        percentText = textFieldCreator.createCalculateText(rapsFrameFull, 340);
        percentPriceText = textFieldCreator.createCalculateText(rapsFrameFull, 430);
        buttonCalculate.addActionListener(this);
        rapsFrameFull.setLayout(null);
        rapsFrameFull.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) throws NumberFormatException {
        Table table = new Table();
        PriceGenerator priceGenerator = new PriceGenerator();
        String s1 = textHumidity.getText();
        String s2 = textPollution.getText();
        String s3 = textBasePrice.getText();

        try {
            priceGenerator.generatePrice(s1, s2, s3, table, rapsFrameFull, percentText, percentPriceText);
        }
        catch (NumberFormatException b) {
        }
    }
}
