
package exercicio14;

import java.util.Scanner;


public class Exercicio14 {

    
    public static void main(String[] args) {
        int a, b, aux1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vamos trocar os valores das variaveis!!!");
        
        System.out.print("Digite o valor de a. ");
        a = sc.nextInt();
        
        System.out.print("Digite o valor de b. ");
        b = sc.nextInt();
        
        aux1 = a;
        a = b;
        b = aux1;
        
        
        System.out.println("O valor de a agora e: " + a);
        
        System.out.println("O valor de b agora e: " + b);
        
        
        
        
        
        
    }
    
}
