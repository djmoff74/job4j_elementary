package ru.job4j;

public class Calculator {
    public static int plus(int first, int second) {
        int rsl = first + second;
        System.out.println(rsl);
        return rsl;

    }

    public static int plus(int first, int second, int third) {
        int rsl = plus(first,
                plus(second, third));
        System.out.println(rsl);
        return rsl;

    }


    public static void main(String[] args) {
        Calculator.plus(1, 2);
        Calculator.plus(10, 11);
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
        Calculator.plus(3, 5, 2);
    }
}
