package com.sdajava.zlicz_elem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int b;
        int c;
        int suma = 0;

        System.out.println("Podaj ile elementów ma tablica: ");
        Scanner zczytaj = new Scanner(System.in);
        b = zczytaj.nextInt();

        System.out.println("Podaj zliczany element");
        c = zczytaj.nextInt();

        int[] a = new int[b];

        for (int i = 0; i < b; i++) {
            System.out.println("Podaj " + i + " element");
            a[i] = zczytaj.nextInt();
        }
        zczytaj.close();

        for (int i = 0; i < a.length; i++) {
            if (c == a[i]) {
                suma++;
            }
        }
        if (suma == 1) {
            System.out.println("Element występuje " + suma + " raz");
        } else {
            System.out.println("Element występuje " + suma + " razy");
        }
    }
}