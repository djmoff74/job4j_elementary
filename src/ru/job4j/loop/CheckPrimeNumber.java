package ru.job4j.loop;

/**
 * Class CheckPrimeNumber
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 3/29/2020
 */
public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && i < number || number == 1) {
                prime = false;
                break;
            } else {
                prime = true;
            }
        }
        return prime;
    }
}
