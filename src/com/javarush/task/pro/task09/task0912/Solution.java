package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        if (!url.contains("//")) {
            return "неизвестный";
        }
        String protocol = url.substring(0, url.indexOf(":"));
        if (protocol.equals("http")) {
            return "http";
        } else if (protocol.equals("https")) {
            return "https";
        } else
        return "неизвестный";
    }

    public static String checkDomain(String url) {
        if (!url.contains(".")) {
            return "неизвестный";
        }
        String domain = url.substring(url.indexOf(".") + 1);

        if (domain.equals("com")) {
            return "com";
        } else if (domain.equals("net")) {
            return "net";
        } else if (domain.equals("org")) {
            return "org";
        } else if (domain.equals("ru")) {
            return "ru";
        } else
        return "неизвестный";
    }
}
