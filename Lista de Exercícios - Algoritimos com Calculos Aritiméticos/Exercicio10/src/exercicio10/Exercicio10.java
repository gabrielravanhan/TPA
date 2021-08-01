
package exercicio10;

import java.util.Scanner;


public class Exercicio10 {

    
    public static void main(String[] args) {
        double valor, taxa, tempo, prestacao;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vamos calcular o valor de uma prestacao atrasada?!");
        
        System.out.print("Informe o valor da prestacao. ");
        valor = sc.nextDouble();
        
        System.out.print("Informe o valor da taxa imposta pelo banco. ");
        taxa = sc.nextDouble();
        
        System.out.print("Informe o numero de dias de atraso. ");
        tempo = sc.nextDouble();
        
        prestacao = valor * (taxa / 100) * tempo;
        
        System.out.println("O valor da prestacao atrasada e de: " + prestacao + "  reais.");
        
    }
    
}
