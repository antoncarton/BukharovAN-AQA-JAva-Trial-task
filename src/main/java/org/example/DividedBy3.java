package org.example;

import java.util.Scanner;

public class DividedBy3 {
    public static void num(int[] arr) {
        for (int i : arr) {
            if (i % 3 == 0 && i > 0) {
                System.out.println(i);
            }
        }
    }
    private static int[] parseToArray(String str) {
        try {
            String[] strSplit = str.split(",");
            int[] arr = new int[strSplit.length];
            for (int i = 0; i < strSplit.length; i++) {
                arr[i] = Integer.parseInt(strSplit[i].trim());
            }
            return arr;
        } catch (Exception ex) {
            System.out.println("Вы ввели некорректные данные");
            return new int[0];
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите массив, каждый элемент через запятую");
        final String str = scan.nextLine();
        num(parseToArray(str));
    }
}

