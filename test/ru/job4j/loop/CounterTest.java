package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class CounterTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 3/29/2020
 */
public class CounterTest {

    @Test
    public void sumByEven1To10Then30() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void sumByEven1To20Then110() {
        int rsl = Counter.sumByEven(1, 20);
        int expected = 110;
        assertThat(rsl, is(expected));
    }
}