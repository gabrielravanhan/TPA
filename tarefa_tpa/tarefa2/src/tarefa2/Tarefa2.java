
package tarefa2;

import java.util.Scanner;


public class Tarefa2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c, d, e, s, digitov;
        
        System.out.print("Informe o o primeiro digito do código: ");
        a = sc.nextInt();
        
        System.out.print("Informe o segundo digito: ");
        b = sc.nextInt();
        
        System.out.print("Informe o terceiro digito: ");
        c = sc.nextInt();
        
        System.out.print("Informe o quarto digito: ");
        d = sc.nextInt();
        
        System.out.print("Informe o quinto digito: ");
        e = sc.nextInt();
        
        s = 6 * a + 5 * b + 4 * c + 3 * d + 2 * e;
        
        digitov = s % 7;
        
        System.out.println("O digito verificador é: " + digitov);
        
    }
    
}
