package ru.job4j.calculator;

public class MathFunc {

    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        return x * 10;

    }
    public static void main(String[] args) {
        int rsl1 = MathFunc.func1(3);
        int rsl2 = MathFunc.func2(5);
        int total = rsl1 + rsl2;
        System.out.println(total);
        int rsl3 = MathFunc.func1(100);
        System.out.println(rsl3);
    }
}
