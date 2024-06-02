package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isENTER = false;
        int sum = 0;
        
        while (!isENTER) {
            if (scanner.hasNextInt()){
                sum += scanner.nextInt();
            }
            String input = scanner.nextLine();
            isENTER = input.equals("ENTER");
            }
            if (isENTER) {
                System.out.println(sum);
        }
    }
}