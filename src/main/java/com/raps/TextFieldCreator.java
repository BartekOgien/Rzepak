package com.raps;

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
}
