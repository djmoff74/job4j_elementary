package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int rsl = Max.max(1, 2);
        assertThat(rsl, is(2));
    }
    @Test
    public void whenMax3To2Then3() {
        int rsl = Max.max(3, 2);
        assertThat(rsl, is(3));
    }
    @Test
    public void whenMax2To2Then2() {
        int rsl = Max.max(2, 2);
        assertThat(rsl, is(2));
    }

    @Test
    public void whenMax2To2To6Then6() {
        int result = Max.max(2, 2, 6);
        assertThat(result, is(6));
    }
    @Test
    public void whenMax2To2To6To7Then7() {
        int result = Max.max(2, 2, 6, 7);
        assertThat(result, is(7));
    }
}