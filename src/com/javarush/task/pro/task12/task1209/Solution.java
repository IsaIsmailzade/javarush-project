package com.javarush.task.pro.task12.task1209;

import java.util.ArrayList;
import java.util.ListIterator;

/* 
Бухгалтерия
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        paySalary("Гвинно");
        System.out.println(waitingEmployees);
    }

    public static void paySalary(String name) {
        if (name == null) return;
        for (int i = 0; i < waitingEmployees.size(); i++) {
        if (waitingEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            waitingEmployees.set(i, null);
        }
        }
    }
}
