package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path path = Path.of(scanner.nextLine());
        List<String> list = Files.readAllLines(path);
        for (String listW : list) {
            System.out.println(listW.replaceAll("[ .,]", ""));
        }
    }
}

