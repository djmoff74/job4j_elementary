package ru.job4j.condition;

public class SqArea {
    public static double suare(int p, int k) {
        int h = p / (2 * (k + 1));
        int l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result = SqArea.suare(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
    }
}
