package org.example;

import java.util.Scanner;

public class HelloOrNot {

    public static String helloOrNot (int number){
            if (number > 7) {
                return "Привет";
            } else {
                return "";
            }
    }
    public static void main(String[] args) {
        try {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        String result = helloOrNot(scan.nextInt());
        System.out.println(result);
        } catch (Exception ex){
            System.out.println("Вы ввели некорректные данные");
        }
    }
}
