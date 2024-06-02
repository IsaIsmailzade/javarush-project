package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String militaryCommissar = ", явитесь в военкомат";
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        
        if (age > 17 && age < 29) {
            System.out.println(name + militaryCommissar);
        }
    }
}
