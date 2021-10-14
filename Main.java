package com.rumata;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int y, x, i, j, r1, r2;
        String space = " ";
        double sd1, sd2;
        System.out.println("Давай нарисуем песочные часы :)");
        Scanner number = new Scanner(System.in);
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        int n = number.nextInt();
        System.out.print("Введите символ: ");
        String symbol = vvod.nextLine();
        if (n % 2 == 0) {
            sd1 = n / 2;
            sd2 = sd1 - 1;
            int s1 = (int) sd1;
            int s2 = (int) sd2;

            for (i = 0; i < s1; i++) {
                r1 = n - 2 * i;
                for (j = 0; j < i; j++) {
                    System.out.print(space);
                }
                for (x = 0; x < r1; x++) {
                    System.out.print(symbol);
                }
                System.out.println("");
            }
            for (i = 0; i < s2; i++) {
                r2 = 4 + 2 * i;
                for (y = 0, j = s2 - 1; j > i; y++, j = s2 - (y + 1)) {
                    System.out.print(space);
                }
                for (x = 0; x < r2; x++) {
                    System.out.print(symbol);
                }
                System.out.println("");
            }
        } else {

            sd1 = n - (n / 2 - 1 / 2);
            sd2 = sd1 - 1;
            int s1 = (int) sd1;
            int s2 = (int) sd2;

            for (i = 0; i < s1; i++) {
                r1 = n - 2 * i;
                for (j = 0; j < i; j++) {
                    System.out.print(space);
                }
                for (x = 0; x < r1; x++) {
                    System.out.print(symbol);
                }
                System.out.println("");
            }
            for (i = 0; i < s2; i++) {
                r2 = 3 + 2 * i;
                for (y = 0, j = s2 - 1; j > i; y++, j = s2 - (y + 1)) {
                    System.out.print(space);
                }
                for (x = 0; x < r2; x++) {
                    System.out.print(symbol);
                }
                System.out.println("");
            }
        }
    }
}

