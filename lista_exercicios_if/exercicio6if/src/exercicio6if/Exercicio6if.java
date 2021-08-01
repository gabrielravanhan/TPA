package exercicio6if;

import java.util.Scanner;

public class Exercicio6if {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Informe o primeiro valor. ");
        a = sc.nextInt();

        System.out.print("Informe o segundo valor. ");
        b = sc.nextInt();

        System.out.print("Informe o terceiro valor. ");
        c = sc.nextInt();

        if ((a > b) && (a > c)) {
            System.out.println("O primeiro valor, " + a + " é maior que " + b + " e " + c);
        } else {
            if ((b > a) && (b > c)) {
                System.out.println("O segundo valor, " + b + ", é maior que " + a + " e " + c);
            } else {
                System.out.println("O terceiro valor, " + c + " ,é maior que " + a + " e " + b);
            }

        }
    }

}
