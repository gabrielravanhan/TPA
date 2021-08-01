package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fat = 1, num;

        System.out.println("Informe um número para calcular seu fatorial: ");

        num = sc.nextInt();

        for (int i = num; i >= 1; i--) {

            fat = fat * i;

            if (i > 1) {

                System.out.print(i + " * ");

            } else {

                System.out.print(i + " = ");

            }

        }

        System.out.println(fat);

    }

}
