/*
Escrever um algoritmo que lê um vetor N(20) e o escreve. Troque, a seguir, o 1º
elemento com o último, o 2º com o penúltimo etc. até o 10º com o 11º e escreva
o vetor N assim modificado.
 */
package exerc5;

import java.util.Scanner;

public class Exerc5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = new int[20];
        int[] x = new int[20];

        for (int i = 0; i <= 19; i++) {
            System.out.print("Informe o " + (i + 1) + "° valor: ");
            v[i] = sc.nextInt();
        }

        for (int i = 19; i >= 0; i--) {
            x[i] = v[i];
            System.out.println(x[i]);
        }

    }

}
