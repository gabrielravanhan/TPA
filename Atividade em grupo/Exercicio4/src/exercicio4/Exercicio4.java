/*
4) Faça um algoritmo para somar duas matrizes A e B de dimensão 3X2.
 */
package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[3][2];
        int[][] B = new int[3][2];
        int[][] C = new int[3][2];

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print("Informe o valor  da posicão matriz A[" + (i + 1) + "][" + (j + 1) + "], na matriz A: ");
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print("Informe o valor da posicão matriz B[" + (i + 1) + "][" + (j + 1) + "], na matiz B: ");
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("Os valores da soma das matrizes A e B são:");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.println("A soma do elemento " + A[i][j] + ", ques está na posição A[" + (i + 1) + "][" + (j + 1) + "] com o elemento " + B[i][j] + ", que está  na posição A[" + (i + 1) + "][" + (j + 1) + "], é: " + (A[i][j] + B[i][j]));
            }
        }

    }

}