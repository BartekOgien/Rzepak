package com.raps;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TableTestSuite {
    private static Table table = new Table();

    @Test
    public void testGetValueFromParameters1() {
        //Given
        //When
        BigDecimal result1 = table.getValueFromParameters(6, 0.1);
        BigDecimal result2 = table.getValueFromParameters(6.3, 2);
        BigDecimal result3 = table.getValueFromParameters(7.6, 1.7);
        BigDecimal result4 = table.getValueFromParameters(6.6, 2.1);
        BigDecimal result5 = table.getValueFromParameters(6.1, 3.7);
        //Then
        Assert.assertEquals(102.45, result1.doubleValue(), 0.01);
        Assert.assertEquals(101.35, result2.doubleValue(), 0.01);
        Assert.assertEquals(100.85, result3.doubleValue(), 0.01);
        Assert.assertEquals(101.10, result4.doubleValue(), 0.01);
        Assert.assertEquals(99.75, result5.doubleValue(), 0.01);
    }

    @Test
    public void testGetValueFromParameters2() {
        //Given
        //When
        BigDecimal result1 = table.getValueFromParameters(7.9, 3.4);
        BigDecimal result2 = table.getValueFromParameters(6.7, 4);
        BigDecimal result3 = table.getValueFromParameters(7.4, 6);
        BigDecimal result4 = table.getValueFromParameters(7.3, 6.8);
        BigDecimal result5 = table.getValueFromParameters(6.5, 6.1);
        //Then
        Assert.assertEquals(99.15, result1.doubleValue(), 0.01);
        Assert.assertEquals(99.15, result2.doubleValue(), 0.01);
        Assert.assertEquals(94.80, result3.doubleValue(), 0.01);
        Assert.assertEquals(92.45, result4.doubleValue(), 0.01);
        Assert.assertEquals(94.95, result5.doubleValue(), 0.01);
    }

    @Test
    public void testGetValueFromParameters3() {
        //Given
        //When
        BigDecimal result1 = table.getValueFromParameters(6.8, 8.8);
        BigDecimal result2 = table.getValueFromParameters(6.3, 9.9);
        BigDecimal result3 = table.getValueFromParameters(7.4, 10);
        BigDecimal result4 = table.getValueFromParameters(7.8, 10.5);
        BigDecimal result5 = table.getValueFromParameters(9.3, 1.4);
        //Then
        Assert.assertEquals(86.7, result1.doubleValue(), 0.01);
        Assert.assertEquals(83.65, result2.doubleValue(), 0.01);
        Assert.assertEquals(82.8, result3.doubleValue(), 0.01);
        Assert.assertEquals(80.6, result4.doubleValue(), 0.01);
        Assert.assertEquals(99.4, result5.doubleValue(), 0.01);
    }

    @Test
    public void testGetValueFromParameters4() {
        //Given
        //When
        BigDecimal result1 = table.getValueFromParameters(9.6, 2.9);
        BigDecimal result2 = table.getValueFromParameters(8.3, 2.1);
        BigDecimal result3 = table.getValueFromParameters(8.7, 2);
        BigDecimal result4 = table.getValueFromParameters(9.5, 2);
        BigDecimal result5 = table.getValueFromParameters(9.8, 1.9);
        //Then
        Assert.assertEquals(97.3, result1.doubleValue(), 0.01);
        Assert.assertEquals(100.25, result2.doubleValue(), 0.01);
        Assert.assertEquals(100.15, result3.doubleValue(), 0.01);
        Assert.assertEquals(98.5, result4.doubleValue(), 0.01);
        Assert.assertEquals(97.65, result5.doubleValue(), 0.01);
    }

    @Test
    public void testGetValueFromParameters5() {
        //Given
        //When
        BigDecimal result1 = table.getValueFromParameters(8.9, 3.4);
        BigDecimal result2 = table.getValueFromParameters(9, 3.4);
        BigDecimal result3 = table.getValueFromParameters(9.1, 3.4);
        BigDecimal result4 = table.getValueFromParameters(8.9, 0.6);
        BigDecimal result5 = table.getValueFromParameters(9, 0.6);
        BigDecimal result6 = table.getValueFromParameters(9.1, 0.6);
        //Then
        Assert.assertEquals(98.65, result1.doubleValue(), 0.01);
        Assert.assertEquals(98.6, result2.doubleValue(), 0.01);
        Assert.assertEquals(98.3, result3.doubleValue(), 0.01);
        Assert.assertEquals(100.75, result4.doubleValue(), 0.01);
        Assert.assertEquals(100.7, result5.doubleValue(), 0.01);
        Assert.assertEquals(100.4, result6.doubleValue(), 0.01);
    }

    @Test
    public void testGetValueFromParameters6() {
        //Given
        //When
        BigDecimal result1 = table.getValueFromParameters(8.4, 1.9);
        BigDecimal result2 = table.getValueFromParameters(8.4, 2);
        BigDecimal result3 = table.getValueFromParameters(8.4, 2.1);
        BigDecimal result4 = table.getValueFromParameters(8.9, 3.9);
        BigDecimal result5 = table.getValueFromParameters(8.9, 4);
        BigDecimal result6 = table.getValueFromParameters(8.9, 4.1);
        //Then
        Assert.assertEquals(100.35, result1.doubleValue(), 0.01);
        Assert.assertEquals(100.3, result2.doubleValue(), 0.01);
        Assert.assertEquals(100.2, result3.doubleValue(), 0.01);
        Assert.assertEquals(98.15, result4.doubleValue(), 0.01);
        Assert.assertEquals(98.05, result5.doubleValue(), 0.01);
        Assert.assertEquals(97.85, result6.doubleValue(), 0.01);
    }

    @Test
    public void testGetValueFromParameters7() {
        //Given
        //When
        BigDecimal result1 = table.getValueFromParameters(8.9, 7.1);
        BigDecimal result2 = table.getValueFromParameters(9, 7.1);
        BigDecimal result3 = table.getValueFromParameters(9.1, 7.1);
        BigDecimal result4 = table.getValueFromParameters(8.9, 9.9);
        BigDecimal result5 = table.getValueFromParameters(8.9, 10);
        BigDecimal result6 = table.getValueFromParameters(8.9, 10.1);
        //Then
        Assert.assertEquals(90.75, result1.doubleValue(), 0.01);
        Assert.assertEquals(90.7, result2.doubleValue(), 0.01);
        Assert.assertEquals(90.4, result3.doubleValue(), 0.01);
        Assert.assertEquals(82.35, result4.doubleValue(), 0.01);
        Assert.assertEquals(82.05, result5.doubleValue(), 0.01);
        Assert.assertEquals(81.65, result6.doubleValue(), 0.01);
    }

    @Test
    public void testGetValueFromParameters8() {
        //Given
        //When
        BigDecimal result1 = table.getValueFromParameters(8.9, 8.2);
        BigDecimal result2 = table.getValueFromParameters(9, 8.2);
        BigDecimal result3 = table.getValueFromParameters(9.1, 8.2);
        BigDecimal result4 = table.getValueFromParameters(13.6, 10.3);
        BigDecimal result5 = table.getValueFromParameters(15.4, 10.4);
        //Then
        Assert.assertEquals(87.45, result1.doubleValue(), 0.01);
        Assert.assertEquals(87.4, result2.doubleValue(), 0.01);
        Assert.assertEquals(87.1, result3.doubleValue(), 0.01);
        Assert.assertEquals(67, result4.doubleValue(), 0.01);
        Assert.assertEquals(61.2, result5.doubleValue(), 0.01);
    }
}
