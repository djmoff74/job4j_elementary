package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class SquareTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 30.03.2020
 */
public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4};
        assertThat(rst, is(expect));
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4, 9, 16};
        assertThat(rst, is(expect));
    }
}