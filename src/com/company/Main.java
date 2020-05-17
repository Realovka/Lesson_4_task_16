package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Random random = new Random();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(array));


        int i, j;
        boolean t = true;
        outer:
        for (i = 0; i < array.length - 1; i++) {
            for (j = i + 1; j < array.length; j++)
                if (array[i] != array[j]) {
                } else {
                    t = false;
                    break outer;
                }
        }
        if (t) {
            System.out.println("Все элементы массива различны");
        } else {
            System.out.println("В массиве есть одинаковые элементы");
        }

    }
}