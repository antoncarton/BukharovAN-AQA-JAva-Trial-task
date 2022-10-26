package org.example;

import java.util.Scanner;

public class HelloOrNot {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите число");
            int number = scan.nextInt();
            if (number > 7) {
                System.out.println("Привет");
            } else {
            System.out.println("");
            }
        } catch (Exception ex){
            System.out.println("Вы ввели некорректные данные");
        }
    }
}
