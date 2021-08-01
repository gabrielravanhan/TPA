package exercicio5if;

import java.util.Scanner;


public class Exercicio5if {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a, b;
        
        System.out.print("Informe o valor de a. ");
        a = sc.nextDouble();
        
        System.out.print("Informe o vaçor de b. " );
        b = sc.nextDouble();
        
        if (a % b == 0){
                System.out.println("Os números " + a + " e " + b + " são múltiplos. ");
        }
        else
        {
             System.out.println("Os números " + a + " e " + b + " não são múltiplos. ");
        }       
            
    }
    
}
