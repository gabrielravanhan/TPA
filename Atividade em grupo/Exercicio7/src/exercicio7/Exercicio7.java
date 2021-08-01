/*
7) Escreva um algoritmo que lê uma matriz M(5,5) e calcule as somas:
a) da linha 4 de M;
b) da coluna 2 de M;
c) da diagonal principal;
d) da diagonal secundária;
e) de todos os elementos da matriz;
f) Escreva estas somas e a matriz.
 */
package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] M = new int[5][5];
        int soma4 = 0, soma2 = 0, soma_p = 0, soma_s = 0, soma_t = 0;

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print("Informe o valor  da posicão matriz M[" + (i + 1) + "][" + (j + 1) + "]: ");
                M[i][j] = sc.nextInt();

                if (i == 4) {
                    soma4 += M[i][j];
                }

                if (j == 2) {
                    soma2 += M[i][j];
                }

                if (i == j) {
                    soma_p += M[i][j];

                }

                if (j == (5 - 1 - i)) {
                    soma_s += M[i][j];
                }

                soma_t += M[i][j];
            }
        }

        System.out.println("A soma da linha 4 de M é: " + soma4);
        System.out.println("A soma da coluna 2 de M é " + soma2);
        System.out.println("A soma da diagonal principal de M é: " + soma_p);
        System.out.println("A soma da diagonal secundária de M é: " + soma_s);
        System.out.println("A soma de todos os elementos de M é: " + soma_t);

        System.out.println("Os valores da matriz M são: ");

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.println(M[i][j] + ", que está na posição M[" + (i + 1) + "][" + (j + 1) + "];");
            }
        }

    }

}