/*
1) Fazer um algoritmo que leia 100 valores numéricos inteiros e armazene-os em
um vetor. Após, verifique – dentre estes valores - se existem valores iguais a
30. Se existirem, escrever as posições em que estes valores estão armazenados.
 */
package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[100];

        for (int i = 0; i <= 99; i++) {
            System.out.print("Informe o " + (i + 1) + "° número do vetor: ");
            x[i] = sc.nextInt();
        }

        System.out.print("Estes valores estão nas posições: ");

        for (int i = 0; i <= 99; i++) {
            if (x[i] == 30) {
                System.out.print(i + "; ");
            }
        }
    }
}
