package ru.job4j.array;

/**
 * Class ArrayDefinition
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 30.03.2020
 */
public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Vadim Bobin";
        names[1] = "Petr Arsentev";
        names[2] = "Eduard Lykov";
        names[3] = "Vasya Pupkin";
        for (String name : names) {
            System.out.println(name);
        }
    }
}
