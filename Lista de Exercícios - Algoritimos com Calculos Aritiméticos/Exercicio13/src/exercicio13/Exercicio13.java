
package exercicio13;

import java.util.Scanner;


public class Exercicio13 {

    
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculando as raizes da equacao de segundo grau!!!");
        
        System.out.print("Informe o valor de a. ");
        a = sc.nextDouble();
        
        System.out.print("Informe o valor de b. ");
        b = sc.nextDouble();
        
        System.out.print("Informe o valor de c. ");
        c = sc.nextDouble();
        
        delta = (b * b) - 4 * a * c;
        
        System.out.println("O valor de delta e: " + delta);
        
        x1 = (- b + Math.sqrt (delta)) / (2 * a);
        
        x2 = (- b - Math.sqrt (delta)) / (2 * a);
        
        if (delta < 0) System.out.println("Nao ha raizes reais.");
        
        if (delta >= 0) System.out.println("As raizes sao: " + x1 + " , " + x2 + ".");
        
        
        
        
        
        
        
        

    }
    
}
