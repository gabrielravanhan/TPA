/*
3) Faça um programa que carregue um vetor (valores digitados por um usuário) com
sete números inteiros, calcule e mostre:
-Os números múltiplos de 2;
-Os números múltiplos de 3;
 */
package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[7];
        int m2, m3;

        for (int i = 0; i <= 6; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            x[i] = sc.nextInt();
        }

        System.out.println("Os números múltiplos de 2 são:");

        for (int i = 0; i <= 6; i++) {
            if ((x[i] > 0) && (x[i] % 2 == 0)) {
                System.out.println(x[i] + ";");
            }
        }

        System.out.println("Os números múltiplos de 3 são:");

        for (int i = 0; i <= 6; i++) {
            if ((x[i] > 0) && (x[i] % 3 == 0)) {
                System.out.println(x[i] + ";");
            }
        }
    }
}
