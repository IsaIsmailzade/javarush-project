package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));

    }

    public static int countDigits(String string) {
        int count = 0;
        if (Character.isDigit(Integer.parseInt(string))) {
            count++;
        } else return 0;
        return count;
    }
}
