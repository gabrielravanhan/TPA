/*
Elabore um algoritmo onde o usário informe 20 números inteiros armazene em um 
vetor e calcule a soma dos numeros pares e a soma dos numeros impares mostrando
o vetor onde foram armazenados os números
 */
package exerc4;

import java.util.Scanner;

public class Exerc4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[20];
        int sp = 0, si = 0;

        for (int i = 0; i <= 19; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            v[i] = sc.nextInt();

            if (v[i] % 2 == 0) {
                sp = sp + v[i];
            } else {
                si = si + v[i];
            }
        }

        for (int i = 0; i <= 19; i++) {
            System.out.println("O número " + v[i] + " está no vetor " + (i + 1) + ".");
        }

        System.out.println("A soma dos números pares é: " + sp);
        System.out.println("A soma dos números ímpares é: " + si);
    }

}
