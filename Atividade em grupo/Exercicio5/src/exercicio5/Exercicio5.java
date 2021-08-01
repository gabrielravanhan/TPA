/*
5) Faça um algoritmo que leia uma matriz mat 2 x 3 e imprima na tela a soma de
todos os elementos da matriz mat.
 */
package exercicio5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[2][3];
        int soma = 0;

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print("Informe o valor  da posicão mat[" + (i + 1) + "][" + (j + 1) + "]: ");
                mat[i][j] = sc.nextInt();

                soma += mat[i][j];
            }
        }

        System.out.println("A soma de todos os elementos da matriz mat é: " + soma);
    }

}