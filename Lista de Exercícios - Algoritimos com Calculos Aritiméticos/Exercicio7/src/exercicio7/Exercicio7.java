
package exercicio7;

import java.util.Scanner;


public class Exercicio7 {

    
    public static void main(String[] args) {
        double precodf , precof, percentualdr, impostos;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculando o valor do automovel!!!");
        
        System.out.print("Informe o peco de fabrica do automovel. ");
        precodf = sc.nextDouble();
        
        percentualdr = precodf * 0.25;
        impostos = precodf * 0.45;
        
        precof = precodf + percentualdr + impostos;
        
        System.out.print("O preco final do automovel e: " + precof);
        
        
        
         
        
        
        
        
        
    }
    
}
