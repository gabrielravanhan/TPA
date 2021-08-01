
package exercicio8if;

import java.util.Scanner;


public class Exercicio8if {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c;
        
        System.out.print("Informe o primeiro número. ");
        a = sc.nextInt();
        
        System.out.print("Informe o segundo número. ");
        b = sc.nextInt();
        
        System.out.print("Informe o terceiro número. ");
        c = sc.nextInt();
        
        if ((a<b) && (b<c)){
            System.out.println("A ordem crescente dos números é: " +a+ "," +b+ ","+c);
        }
        else
        {
            if ((a<c) && (c<b)){
                System.out.println("A ordem crescente dos números é: " +a+ "," +c+ ","+b);
            }
            else
            {
                if ((b<a) && (a<c)){
                    System.out.println("A ordem crescente dos números é: " +b+ "," +a+ ","+c);
                }
                else
                {
                    if ((b<c) && (c<a)){
                        System.out.println("A ordem crescente dos números é: " +b+ "," +c+ ","+a);
                    }
                    else
                    {
                        if ((c<a) && (c<b)){
                            System.out.println("A ordem crescente dos números é: " +c+ "," +a+ ","+b);
                        }
                        else
                        {
                           System.out.println("A ordem crescente dos números é: " +c+ "," +b+ ","+a); 
                        }
                    }   
                }    
            }    
        }    
    }
    
}
