
package exercício1;

import java.util.Scanner;




public class Exercício1 {

    
    public static void main(String[] args) {
        int num1, num2, num3, resultado;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculando o valor da operacao!!!");
        
        System.out.print("Digite o primeiro valor. ");
        num1 = sc.nextInt();
        
        System.out.print("Digite o segundo valor. ");
        num2 = sc.nextInt();
        
        System.out.print("Digite o terceiro valor. ");
        num3 = sc.nextInt();
        
        resultado = (num1 + num2) * num3;
        
        System.out.println("O valor do calculo e: " + resultado);
        
        
        
    }
    
}
