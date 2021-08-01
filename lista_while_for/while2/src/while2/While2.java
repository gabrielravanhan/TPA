
package while2;

import java.util.Scanner;


public class While2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int soma=0, cont = 1;
       
        while (cont <= 100) {
            soma = soma + cont;
            System.out.println("A soma dos números é " + soma);
            System.out.println(cont);
            cont++;
            System.out.println(soma);
        }
    }
    
}
