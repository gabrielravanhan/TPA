/*
Faça um algoritmo que multiplique o conteúdo de dois vetores de 10 posições e
armazene o resultado em um terceiro vetor
 */
package exerc3;

import java.util.Scanner;


public class Exerc3 {

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] v = new int[10];
        int[] x = new int[10];
        int[] y = new int[10];
        
        for (int i = 0; i <= 9; i++){
            System.out.print("Informe o " + (i + 1) + "° número do 1° vetor: ");
            v[i] = sc.nextInt();
            
            System.out.print("Informe o " + (i + 1) + "° número do 2° vetor: ");
            x[i] = sc.nextInt();
        }
        
        for (int i = 0; i <= 9; i++){
            y[i] = x[i] * v[i];
            
            System.out.println(y[i]);
        }
    }
    
}
