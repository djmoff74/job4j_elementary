package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.*;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        boolean rsl = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(rsl, is(true));
    }
    @Test
    public void whenNotExist() {
        boolean rsl = Triangle.exist(2.0, 1.0, 1.0);
        assertThat(rsl, is(false));
    }
}