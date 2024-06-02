package com.javarush.task.pro.task09.task0908;

import java.util.Arrays;
import java.util.regex.Pattern;

/*
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    public static String[] binStatic = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
    public static String[] HEX = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hexNum = "";
        if (binaryNumber == null || binaryNumber.isEmpty()) return "";
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) != 48 && binaryNumber.charAt(i) != 49) return "";
        }
        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }
        String[] fourNumber = new String[binaryNumber.length() / 4];
        int count = 0;
        for (int i = 0; i < binaryNumber.length(); i += 4) {
            fourNumber[count++] = binaryNumber.substring(i, i + 4);
        }
        for (int i = 0; i < fourNumber.length; i++) {
            for (int j = 0; j < binStatic.length; j++) {
                if (fourNumber[i].equals(binStatic[j])) {
                    fourNumber[i] = HEX[j];
                    break;
                }
            }
        }
        for (String s : fourNumber) {
            hexNum += s;
        }
        return hexNum;
    }

    public static String toBinary(String hexNumber) {
        String binaryNum = "";
        if (hexNumber == null || hexNumber.isEmpty()) return "";
        int count = 0;
        String[] hexNum = new String[hexNumber.length()];
        for (int i = 0; i < hexNum.length; i++) {
            hexNum[count++] = hexNumber.substring(i, i + 1);
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            if (!hexNum[i].matches("[0-9]") && !hexNum[i].matches("[a-f]")) return "";
        }

        for (int i = 0; i < hexNumber.length(); i++) {
            for (int j = 0; j < HEX.length; j++) {
                if (hexNum[i].equals(HEX[j])) {
                    hexNum[i] = binStatic[j];
                    break;
                }
            }
        }
        for (String binaryNumber : hexNum) {
            binaryNum += binaryNumber;
        }
        return binaryNum;
    }
}