package ru.job4j.array;

/**
 * Class FindLoop
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 30.03.2020
 */
public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
