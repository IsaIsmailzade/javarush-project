package com.javarush.task.pro.task12.task1212;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
    }
}
