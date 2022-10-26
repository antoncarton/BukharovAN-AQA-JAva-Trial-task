package org.example;

import java.util.Scanner;

public class Slava {
    public static String checkIfSlava(String name) {
        if (name.equals("Вячеслав")) {
            return "Привет Вячеслав";
        } else {
            return "Нет такого имени";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя");
        String result = checkIfSlava(scan.nextLine());
        System.out.println(result);
        }
    }



