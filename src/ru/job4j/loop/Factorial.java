package ru.job4j.loop;

/**
 * Class Factorial
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 3/29/2020
 */
public class Factorial {
    public static int calc(int n) {
        int rsl = 1;
        for (int i = 1; i <= n; i++) {
            rsl = rsl * i;
        }
        return rsl;
    }
}
