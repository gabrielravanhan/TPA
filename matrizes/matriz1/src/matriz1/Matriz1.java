/*Elabore um algortimo onde o usuário informa valores para uma matriz de 
dimensão 3X3 e mostre a matriz ea soma da diagonal principal.*/
package matriz1;

import java.util.Scanner;

public class Matriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] v = new int[3][3];
        int soma = 0;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println("Informe o valor: ");
                v[i][j] = sc.nextInt();

                if ((i == j)) {
                    soma = soma + v[i][j];
                }
            }
        }

        System.out.println("Os valores da matriz são:");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(v[i][j] + ", que está na posição V[" + (i + 1) + "][" + (j + 1) + "];");
            }
        }
        System.out.println("A soma da diagonal principal é " + soma);

    }

}
