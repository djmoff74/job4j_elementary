package ru.job4j.loop;

/**
 * Class PrimeNumber
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 3/29/2020
 */
public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int i = 0; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                count++;
            }
        }
        return count;
    }
}
