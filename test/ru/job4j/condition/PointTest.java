package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = 2.0;
        double expected = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

}