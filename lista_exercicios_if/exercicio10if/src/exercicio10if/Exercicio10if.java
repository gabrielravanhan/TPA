
package exercicio10if;

import java.util.Scanner;


public class Exercicio10if {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade;
        
        System.out.println("Informe a idade do nadador. ");
        idade = sc.nextInt();
        
        if ((idade >= 5) && (idade <= 7)){
            System.out.println("A sua categoria é Infantil A. ");
        }
        else
        {
            if ((idade >= 8) && (idade <= 10)){
                System.out.println("A sua categoria é Infantil B. ");
            }
            else
            {
                if ((idade >= 11) && (idade <= 13)){
                    System.out.println("A sua categoria é Juvenil A. ");
                }
                else
                {
                    if ((idade >= 14) && (idade <= 17))
                        System.out.println("A sua categoria é Juvenil B. ");
                    else
                    {
                        if (idade >= 18 ){
                          System.out.println("A sua categoria é Adulto. ");
                        }
                        else
                        {
                            System.out.println("Não há categorias para essa idade. Ele não pode nada");
                        }    
                    }
   
                    
                }    
            }    
        }    
    }
    
}
