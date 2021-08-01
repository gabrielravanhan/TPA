
package tetste;

import java.util.Scanner;


public class Tetste {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.print("Informe o primeiro número. ");
        n1 = sc.nextInt();
        
        System.out.print("Informe o segundo número. ");
        n2 = sc.nextInt();
        
        if  (n1 > n2) 
        {
        System.out.println("O número " + n1 + " é maior que o número " + n2 + ".");
        }
        
        else
        {
            if (n2 > n1){
                System.out.println("O número " + n1 + " é menor que o número " + n2 + ".");
            }
            else
            {
                System.out.println("Os números são iguais. ");
            }
        }
       
    }
    
}
