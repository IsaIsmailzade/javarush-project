package com.javarush.task.pro.task15.task1504;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        InputStream inputStream = Files.newInputStream(Path.of(scanner.nextLine()));
        OutputStream outputStream = Files.newOutputStream(Path.of(scanner.nextLine()));
        byte[] buffer = inputStream.readAllBytes();
        for (int i = 0; i < buffer.length - 2; i += 2) {
            byte temp;
            temp = buffer[i];
            buffer[i] = buffer[i + 1];
            buffer[i + 1] = temp;
        }
        outputStream.write(buffer);
        inputStream.close();
        outputStream.close();
    }
}

