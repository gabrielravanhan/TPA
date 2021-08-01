/*
Elabore um algoritmo que leia duas matrizes A e B de dimensão 4X4 e faça a soma
dessas matrizes jogando o resultado em uma terceira matriz C de dimensão 4x4;
 */
package matriz3;

import java.util.Scanner;

public class Matriz3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[4][4];
        int[][] B = new int[4][4];
        int[][] C = new int[4][4];

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print("Informe o valor  da posicão A[" + (i + 1) + "][" + (j + 1) + "]: ");
                A[i][j] = sc.nextInt();
            }

        }

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print("Informe o valor  da posicão B[" + (i + 1) + "][" + (j + 1) + "]: ");
                B[i][j] = sc.nextInt();
            }

        }

        System.out.println("\nOs resultados da soma das Matrizes A e B, exibidos na Matriz C são: ");
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.println(C[i][j] + ", que está na posição C[" + (i + 1) + "][" + (j + 1) + "];");

            }

        }
    }

}
