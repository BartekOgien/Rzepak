package com.raps.creators;

import com.raps.tables.Table;

import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class PriceGenerator {
    private final static double HUMIDITY_MAX = 15.5;
    private final static double HUMIDITY_MIN = 6;
    private final static double POLLUTION_MAX = 10.5;
    private final static double POLLUTION_MIN = 0.1;
    private final static int BIGDECIMAL_PRECISION = 2;
    private final static int DIVIDE_PERCENT = 100;

    public void generatePrice(String humidity, String pollution, String basePrice, Table table, JFrame rapsFrame, JTextField percentPriceText, JTextField percentText) {
        humidity = doubleWithoutDot(humidity);
        pollution = doubleWithoutDot(pollution);
        basePrice = doubleWithoutDot(basePrice);
        double humDouble = Double.parseDouble(humidity);
        double polDouble = Double.parseDouble(pollution);
        double priceDouble = Double.parseDouble(basePrice);

        if(humDouble < HUMIDITY_MIN || humDouble>HUMIDITY_MAX || polDouble < POLLUTION_MIN || polDouble > POLLUTION_MAX) {
            try {
                table.wrongParameters(rapsFrame);
            } catch (IllegalComponentStateException ei) {
            }
        }

        else {
            BigDecimal finishedPercentPrice = table.getValueFromParameters(humDouble, polDouble);
            finishedPercentPrice = finishedPercentPrice.setScale(BIGDECIMAL_PRECISION, RoundingMode.HALF_UP);
            BigDecimal finishedPrice = finishedPercentPrice.divide(new BigDecimal(DIVIDE_PERCENT));
            finishedPrice = finishedPrice.multiply(BigDecimal.valueOf(priceDouble));
            finishedPrice =  finishedPrice.setScale(BIGDECIMAL_PRECISION, RoundingMode.HALF_UP);

            String resultString = String.valueOf(finishedPercentPrice);
            percentPriceText.setText(resultString + "%");
            String resultString1 = String.valueOf(finishedPrice);
            percentText.setText(resultString1);
        }
    }

    public String doubleWithoutDot(String number) {
        return number.replaceAll(",", ".");
    }
}
