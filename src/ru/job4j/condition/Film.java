package ru.job4j.condition;

public class Film {
    public static String permission(int age) {
        boolean can = age >= 18;
        return can ? "Please, enjoy it." : "You can`t watch it.";
    }

    public static void main(String[] args) {
        String msg = Film.permission(16);
        System.out.println(msg);
    }
}
