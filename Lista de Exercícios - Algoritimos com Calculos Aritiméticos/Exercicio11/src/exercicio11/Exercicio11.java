
package exercicio11;

import java.util.Scanner;


public class Exercicio11 {

    public static void main(String[] args) {
        int a, b, c, r, s;
        double d;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculando o valor da operacao!!! ");
        
        System.out.print("Informe o valor de a. ");
        a = sc.nextInt();
        
        System.out.print("Informe o valor de b. ");
        b = sc.nextInt();
        
        System.out.print("Informe o valor de c. ");
        c = sc.nextInt();
        
        r = (a + b) * (a + b);
        
        s = (b + c) * (b + c);
        
        d = (r + s) / 2;
        
        System.out.println("O valor de d e: " + d);
        
        
        
        
    
        
       
    }
    
}
