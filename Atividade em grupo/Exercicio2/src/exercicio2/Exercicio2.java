/*
2) Faça um algoritmo que multiplique o conteúdo de dois vetores de 10 posições
e armazene o resultado em um terceiro vetor.
 */
package exercicio2;

import java.util.Scanner;


public class Exercicio2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] v = new int[10];
        int[] x = new int[10];
        int[] y = new int[10];
        
        for (int i = 0; i <= 9; i++){
            System.out.print("Informe o valor da posicão v[" + i + "]: ");
            v[i] = sc.nextInt();
        }
        
        for (int i = 0; i <= 9; i++){
            System.out.print("Informe o valor da posicão x[" + i + "]: ");
            x[i] = sc.nextInt();
        }
        
        System.out.println("Os resultados da multiplicacão dos vetores v e x, armazenados no vetor y são: ");
        for (int i = 0; i <= 9; i++){
            y[i] = x[i] * v[i];
            
            System.out.println(y[i]+ ", que está na posição y[" + i + "]");
        }
    }
    
}