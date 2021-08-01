/*
6) Faça um algoritmo que leia uma matriz mat 4 x 4, e imprima na tela a soma 
dos elementos abaixo da diagonal principal da matriz mat.
 */
package exercicio6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[4][4];
        int soma = 0;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print("Informe o valor  da posicão mat[" + (i + 1) + "][" + (j + 1) + "]: ");
                mat[i][j] = sc.nextInt();

                if (i > j) {
                    soma += mat[i][j];
                }
            }
        }

        System.out.println("A soma de todos os elementos abaixo da diagonal principal da matriz mat é: " + soma);
    }

}