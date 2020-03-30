package ru.job4j.array;

/**
 * Class Check
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 30.03.2020
 */
public class Check {
    public boolean mono(boolean[] data) {
        boolean rst = true;
        for (int i = 0; i < data.length; i++) {
            if (data[0] != data[data.length - (1 + i)]) {
                rst = false;
                break;
            }
        }
        return rst;
    }
}
