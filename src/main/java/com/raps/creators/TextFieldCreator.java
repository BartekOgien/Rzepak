package com.raps.creators;

import javax.swing.*;

public class TextFieldCreator {
    private final static int TEXT_FIELD_WIDTH = 60;
    private final static int TEXT_FIELD_HEIGHT = 25;

    public JTextField createTextField(JFrame rapsFrame, int x, int y) {
        JTextField textField = new JTextField();
        textField.setBounds(x, y, TEXT_FIELD_WIDTH, TEXT_FIELD_HEIGHT);
        textField.setText("");
        rapsFrame.add(textField);
        return textField;
    }

    public JTextField createCalculateText(JFrame jFrame, int y) {
        JTextField textField=new JTextField();
        textField.setBounds(LabelCreator.POSITION_X, y, TEXT_FIELD_WIDTH,TEXT_FIELD_HEIGHT);
        textField.setText("");
        textField.setEditable(false);
        jFrame.add(textField);
        return textField;
    }
}
