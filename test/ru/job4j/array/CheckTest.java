package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class CheckTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 30.03.2020
 */
public class CheckTest {

    @Test
    public void monoIsTrueTrueTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean rst = check.mono(input);
        assertThat(rst, is(true));
    }

    @Test
    public void monoIsTrueFalseTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean rst = check.mono(input);
        assertThat(rst, is(false));
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {false, false, false, false};
        boolean rst = check.mono(input);
        assertThat(rst, is(true));
    }
}