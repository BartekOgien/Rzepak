package com.raps;

import javax.swing.*;
import java.math.BigDecimal;

public class Table {
    private BigDecimal[][] parameters = new BigDecimal[96][105];

    public Table() {
        BigDecimal base= new BigDecimal(101.5);

        for(int i=19; i<39; i++) {
            parameters[0][i] = base;
            base = base.subtract(new BigDecimal(0.1));
        }

        base = new BigDecimal(101.5);
        for(int i=19; i>=0; i--) {
            parameters[0][i] = base;
            base = base.add(new BigDecimal(0.05));
        }

        base = new BigDecimal(99.5);
        for(int i=39; i<59; i++) {
            parameters[0][i] = base;
            base = base.subtract(new BigDecimal(0.2));
        }

        base = new BigDecimal(95.5);
        for(int i=59; i<99; i++) {
            parameters[0][i] = base;
            base = base.subtract(new BigDecimal(0.3));
        }

        base = new BigDecimal(83.5);
        for(int i=99; i<=104; i++) {
            parameters[0][i] = base;
            base = base.subtract(new BigDecimal(0.4));
        }

        for(int i=1; i<31; i++) {
            for(int j=0; j<=104; j++) {
                parameters[i][j] = parameters[i-1][j].subtract(new BigDecimal(0.05));
            }
        }

        for(int i=31; i<=95; i++) {
            for(int j=0; j<=104; j++) {
                parameters[i][j] = parameters[i-1][j].subtract(new BigDecimal(0.3));
            }
        }
    }

    public BigDecimal getValueFromParameters(double humidity, double pollution) {
        humidity = Math.round(humidity*10);
        pollution = Math.round(pollution*10);
        return parameters[((int)humidity)-60][((int)pollution)-1];
    }

    public void wrongParameters(JFrame jFrame) {
        JOptionPane.showMessageDialog(jFrame, "Wilgotnosc lub zanieczyszczenie wykracza poza zakres tabeli \n" +
                "Wilgotnosc powinna byc z przedzialu 6 - 15,5 \n" +
                "Zanieczyszczenie 0,1 - 10,5");
    }
}
