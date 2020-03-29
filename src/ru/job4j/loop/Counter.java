package ru.job4j.loop;

/**
 * Class Counter
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 3/29/2020
 */
public class Counter {
    public static int sum(int st, int fin) {
        int sum = 0;
        for (int i = st; i <= fin; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}
