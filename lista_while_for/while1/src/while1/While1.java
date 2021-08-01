
package while1;

import java.util.Scanner;


public class While1 {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
        int num, tab,cont = 1;
       
        System.out.print("Informe um número => ");
        num = sc.nextInt();
       
        while (cont <= 100) {
            tab = cont * num;
            System.out.println(cont + " * " + num + " = " + tab);
            cont++;
            
        }
       
    }

    }
    

