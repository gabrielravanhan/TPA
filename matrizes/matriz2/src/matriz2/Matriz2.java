/*Elabore um algoritmo onde os usuários informam os valores de duas matrizes 
2 X 2 A e B e calcule a soma dos elementos dessas matrizes criando uma terceira
matriz 2x2 de nome C.*/
package matriz2;

import java.util.Scanner;

public class Matriz2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.println("Informe o valor  da posicão matriz V[" + (i + 1) + "][" + (j + 1) + "], na matriz a: ");
                a[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i <= 1; i++){
            for (int j = 0; j <= 1; j++){
                System.out.println("Informe o valor da posicão matriz V[" + (i + 1) + "][" + (j + 1) + "], na matiz b: ");
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Os valores da matiz c são:");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.println(c[i][j] + ", que está na posição V[" + (i + 1) + "][" + (j + 1) + "];");

            }
        }
    }

}
