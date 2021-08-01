/*
Faça um algoritmo que copie o conteúdo de um vetor em um segundo vetor.
 */
package exerc1;

import java.util.Scanner;


public class Exerc1 {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] v = new int[10];
        int[] x = new int[10];
        
        for (int i = 0; i <= 9; i++){
            System.out.print("Informe o " + (i + 1) + "° número: ");
            v[i] = sc.nextInt();
        }
        
        for (int i = 0; i <= 9; i++){
            x[i] = v[i];
            System.out.println(x[i]);
        }
    }
}
