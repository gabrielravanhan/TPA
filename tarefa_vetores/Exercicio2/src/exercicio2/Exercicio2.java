/*
2) Faça um programa que carregue um vetor (valores digitados por um usuário) de
seis elementos numéricos inteiros, calcule e mostre:
- A quantidade de números pares;
- Quais os números pares;
- A quantidade de números impares;
- Quais os números impares;
 */
package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[6];
        int qp = 0, np = 0, qi = 0, ni = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            x[i] = sc.nextInt();
        }

        System.out.println("Os números pares são: ");

        for (int i = 0; i <= 5; i++) {
            if (x[i] % 2 == 0) {
                System.out.println(+x[i] + ";");
            }
        }

        System.out.println("Os números impares são: ");

        for (int i = 0; i <= 5; i++) {
            if (x[i] % 2 != 0) {
                System.out.println(+x[i] + ";");
            }

            if (x[i] % 2 == 0) {
                qp++;
            } else {
                qi++;
            }
        }

        System.out.println("A quantidade de números pares é " + qp);
        System.out.println("A quantidade de números impares é: " + qi);
    }
}
