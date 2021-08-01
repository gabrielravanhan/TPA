/*
1) Elabore um algoritmo onde o ususario vai informar 10 números em um vetor e
vai calcular a soma dos números pares, a soma dos números impares e a média dos
elementos do vetor.
 */
package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];
        int soma_par = 0, soma_impar = 0, soma_vetor = 0;
        double media = 0;

        for (int i = 0; i <= 9; i++) {
            System.out.print("Informe o valor da posicão v[" + i + "]: ");
            v[i] = sc.nextInt();

            if (v[i] % 2 == 0) {
                soma_par = soma_par + v[i];
            } else {
                soma_impar = soma_impar + v[i];
            }

            soma_vetor = soma_vetor + v[i];
            media = soma_vetor / 10;
        }

        System.out.println("A soma dos números pares é: " + soma_par);
        System.out.println("A soma dos números ímpares é: " + soma_impar);
        System.out.println("A média dos elementos do vetor " + media);
    }

}