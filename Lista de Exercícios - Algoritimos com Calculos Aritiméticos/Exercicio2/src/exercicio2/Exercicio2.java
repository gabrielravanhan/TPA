
package exercicio2;

import java.util.Scanner;


public class Exercicio2 {

    
    public static void main(String[] args) {
        double n1, n2, resultado1, resultado2, resultado3, resultado4;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculando o valor das operacoes!!!");
        
        System.out.print("Digite o primeiro valor. ");
        n1 = sc.nextDouble();
        
        System.out.print("Digite o segundo valor. ");
        n2 = sc.nextDouble();
        
        resultado1 = n1 + n2;
        resultado2 = n1 - n2;
        resultado3 = n1 * n2;
        resultado4 = n1 / n2;
        
        System.out.println("O resultado da soma e: " + resultado1);
        System.out.println("O reultado da subtracao e: " + resultado2);
        System.out.println("O resultado da multiplicacao e :" + resultado3);
        System.out.println("O resultado da divisao e :" + resultado4);
        
        
        
        
        
        
        
    }
    
}
