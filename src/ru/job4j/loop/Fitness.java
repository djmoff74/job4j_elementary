package ru.job4j.loop;

/**
 * Class Fitness
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 3/29/2020
 */
public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
