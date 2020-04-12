package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class TrgAreaTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 12.04.2020
 */
public class TrgAreaTest {

    @Test
    public void whenAreaTriangleTrue() {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        Point c = new Point(5, 0);
        TrgArea triangle = new TrgArea(a, b, c);
        double out = triangle.area();
        double expected = 10.99;
        Assert.assertEquals(expected, out, 0.01);
    }
}