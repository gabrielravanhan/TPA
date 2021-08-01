package exercicio3if;

import java.util.Scanner;

public class Exercicio3if {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Informe o número que você deseja saber se é par ou ímpar. ");
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("O número é par. ");
        } else {
            System.out.println("O número é ímpar. ");
        }

    }

}
