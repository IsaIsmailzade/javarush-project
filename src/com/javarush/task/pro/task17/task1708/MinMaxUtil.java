package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    public static void min(int num1, int num2) {
        System.out.println(Math.min(num1, num2));
    }
    public static void min(int num1, int num2, int num3) {
        System.out.println(Math.min(Math.min(num1, num2), num3));
    }
    public static void min(int num1, int num2, int num3, int num4) {
        System.out.println(Math.min(Math.min(num1, num2), Math.min(num3, num4)));
    }
    public static void min(int num1, int num2, int num3, int num4, int num5) {
        System.out.println(Math.min(Math.min(Math.min(num1, num2), Math.min(num3, num4)), num5));
    }

    public static void max(int num1, int num2) {
        System.out.println(Math.max(num1, num2));
    }
    public static void max(int num1, int num2, int num3) {
        System.out.println(Math.max(Math.max(num1, num2), num3));
    }
    public static void max(int num1, int num2, int num3, int num4) {
        System.out.println(Math.max(Math.max(num1, num2), Math.max(num3, num4)));
    }
    public static void max(int num1, int num2, int num3, int num4, int num5) {
        System.out.println(Math.max(Math.max(Math.max(num1, num2), Math.max(num3, num4)), num5));
    }
}
