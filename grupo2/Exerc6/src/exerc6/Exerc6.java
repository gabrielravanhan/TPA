/*
Montar um algoritmo onde o usuário informa 20 números, armazene em um vetor e
mostre a soma dos números com indice par e a qtde de numeros impares.
 */
package exerc6;

import java.util.Scanner;

public class Exerc6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = new int[20];
        int sip = 0, qti = 0;

        for (int i = 0; i <= 19; i++) {
            System.out.print("Informe o " + (i + 1) + "° número: ");
            v[i] = sc.nextInt();
            
            if (i % 2 == 0){
                sip = sip + v[i];
            }
            
            if (v[i] % 2 != 0){
                qti++;
            }
        }

        System.out.println("A soma dos números com índice par é: "+sip);
        System.out.println("A quantidade de números ímpares é: "+qti);
    }

}
