package com.raps.frames;

import javax.swing.*;

public class RapsFrame {
    JFrame rapsFrame;

    public RapsFrame() {
        rapsFrame = new JFrame("Rzepak");
        rapsFrame.setSize(400, 540);
    }

    public JButton createButtons() {
        JButton buttonWork = new JButton("Oblicz");
        buttonWork.setBounds(250, 330, 100, 40);
        rapsFrame.add(buttonWork);
        return buttonWork;
    }

    public JFrame getRapsFrame() {
        return rapsFrame;
    }

}
