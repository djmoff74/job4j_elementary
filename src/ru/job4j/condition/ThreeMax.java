package ru.job4j.condition;

public class ThreeMax {
    public static int max(int f, int s, int t) {
        int rsl = f;
        if (s >= f && s >= t) {
            rsl = s;
        }
        if (t >= f && t >= s) {
            rsl = t;
        }
        return rsl;
    }
}
