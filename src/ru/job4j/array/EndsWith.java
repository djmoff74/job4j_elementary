package ru.job4j.array;

/**
 * Class EndsWith
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 31.03.2020
 */
public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean rst = true;
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - (i + 1)] != post[post.length - (i + 1)]) {
                rst = false;
                break;
            }
        }
        return rst;
    }
}
