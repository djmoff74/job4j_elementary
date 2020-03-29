package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class FitnessTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 3/29/2020
 */
public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int month = Fitness.calc(95, 90);
        assertThat(month, is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        int month = Fitness.calc(90, 95);
        assertThat(month, is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        int month = Fitness.calc(50, 90);
        assertThat(month, is(2));
    }
}