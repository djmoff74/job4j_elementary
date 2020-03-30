package ru.job4j.array;

/**
 * Class ArrayLoop
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 30.03.2020
 */
public class ArrayLoop {
    @SuppressWarnings("checkstyle:EmptyBlock")
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
