package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
        double out = 2.0;
        double expected = SqArea.square(6, 2);
        Assert.assertEquals(expected, out, 0.01);

    }
    @Test
    public void square1() {
        double out = 1.0;
        double expected = SqArea.square(4, 1);
        Assert.assertEquals(expected, out, 0.01);

    }
}