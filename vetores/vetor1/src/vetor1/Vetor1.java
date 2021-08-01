/*
Criar um algoritmo onde o usuário vai informar 10 números, vai armazenar em um 
vetor V e vai calcular a soma dos números pares e a soma dos números impares, 
mostrando também o vetor.
 */
package vetor1;

import java.util.Scanner;

public class Vetor1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int sp = 0, si = 0;

        for (int i = 0; i <= 9; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            v[i] = sc.nextInt();

            if (v[i] % 2 == 0) {
                sp = sp + v[i];
            } else {
                si = si + v[i];
            }
        }

        for (int i = 0; i <= 9; i++) {
            System.out.println("O número "+v[i] + " está no vetor " + (i + 1) + ".");
        }

        System.out.println("A soma dos números pares é: " + sp);
        System.out.println("A soma dos números ímpares é: " + si);
    }
}
