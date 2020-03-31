package ru.job4j.array;

/**
 * Class ArrayChar
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 31.03.2020
 */
public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean rst = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                rst = false;
                break;
            }
        }
        return rst;
    }
}
