package org.example;


import java.util.Random;

public class HW3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[20];
        int sum = 0;

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(50);
            System.out.print(mass[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                System.out.print(mass[i] + " ");
            }

        }
        System.out.println(" ");
        for (int i = 0; i < mass.length; i++) {
            if ((mass[i] > 5) & mass[i] < 45)
                sum += mass[i];
        }
        {
            System.out.println("sum = " + sum);

        }
    }
}




