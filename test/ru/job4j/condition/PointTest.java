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

    @Test
    public void distance3d() {
        Point a = new Point(2, 11, 5);
        Point b = new Point(9, 14, 10);
        double out = 9.11;
        double expected = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);

    }

}