
package exercicio4if;

import java.util.Scanner;


public class Exercicio4if {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ano;
        
        System.out.print("Informe o ano que você deseja saber se é bissexto ou não.");
        ano = sc.nextInt();
        
        if (ano % 4 == 0){
            System.out.println("O ano é bissexto. ");
        }
        else
        {
            System.out.println("O ano não é bissexto. ");
        }
    }
    
}
