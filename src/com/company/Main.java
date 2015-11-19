package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowtą");
        int zmienna = scaner.nextInt();
        scaner.close();

        System.out.println("Wynik funkcji iteracyjnej:");
        System.out.println(fi1(zmienna));
        System.out.println("wynik funkcji rekurencyjnej:");
        System.out.println(fi2(zmienna));

    }

    // iteracyja
    public static int fi1(int n) {
        if (n == 0) return 0;
        int a, b, c;
        a = 1;
        b = 1;
        if (n <= 2) return a;
        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    //rekurencyja
    public static int fi2(int n) {
        if (n == 1 || n == 0) {
            return n;
        } else
            return fi2(n - 1) + fi2(n - 2);
    }
}
