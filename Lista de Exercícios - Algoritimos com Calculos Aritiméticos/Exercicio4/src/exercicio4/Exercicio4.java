
package exercicio4;

import java.util.Scanner;


public class Exercicio4 {

    
    public static void main(String[] args) {
        double n1 = 500, n2, novo_saldo;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ola! Deseja fazer um deposito?!");
        
        System.out.print( "Informe o valor do deposito(cheque). ");
        n2 = sc.nextDouble();
        
        novo_saldo = n1 + n2;
        
        System.out.println("Seu novo saldo e de. " + novo_saldo);
        
        
        
    }
    
}
