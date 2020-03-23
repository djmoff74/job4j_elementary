package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 175;
        double out = 86.25;
        double expected = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double in = 165;
        double out = 63.24;
        double expected = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}