package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        double out = 2.0;
        double expected = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);

    }

}