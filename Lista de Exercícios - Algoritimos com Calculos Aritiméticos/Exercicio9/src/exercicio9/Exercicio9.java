
package exercicio9;

import java.util.Scanner;


public class Exercicio9 {

    
    public static void main(String[] args) {
        double valor_de_cotacao, quantidade, resultado;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vamos realizar a conversao do dolar em real?!");
        
        System.out.print("Informe o valor de cotacao do dolar. ");
        valor_de_cotacao = sc.nextDouble();
        
        System.out.print("Informe a quantidade de dolares. ");
        quantidade = sc.nextDouble();
        
        resultado = valor_de_cotacao * quantidade;
        
        System.out.println("O resultado da conversao e: " + resultado + " reais.");
        
        
       
        
        
        
    }
    
}
