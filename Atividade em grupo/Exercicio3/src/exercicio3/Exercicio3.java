/*
3) Escrever um algoritmo que lê um vetor N(20) e o escreve. Troque, a seguir,
o 1º elemento com o último, o 2º com o penúltimo etc. até o 10º com o 11º e
escreva o vetor N assim modificado.
 */
package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[20];
        
        for (int i = 0; i <= 19; i++) {
            System.out.print("Informe o valor da posicão N[" + i + "]: ");
            n[i] = sc.nextInt();
        }
        
        
        System.out.println("Os valores do vetor N invertidos são");
        for (int i = 19; i >= 0; i--) {
            System.out.println(n[i]);
        }
        
    }
}