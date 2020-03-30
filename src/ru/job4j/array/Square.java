package ru.job4j.array;

/**
 * Class Square
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 30.03.2020
 */
public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(5);
        for (int value : array) {
            System.out.println(value);
        }
    }
}
