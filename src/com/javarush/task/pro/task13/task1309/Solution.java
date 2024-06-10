package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("efsf efefe", 4.5);
        grades.put("efsf fegsg", 7.4);
        grades.put("egesgwawfsf efefe", 2.6);
        grades.put("efsf efefefeafe", 6.4);
        grades.put("efswfaf efefe", 9.4);
    }
}
