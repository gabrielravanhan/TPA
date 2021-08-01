
package tarefa3;

import java.util.Scanner;


public class Tarefa3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double x1, y1, x2, y2, d;
        
        System.out.print("Digite o valor de x1:" );
        x1 = sc.nextDouble();
        
        System.out.print("Digite o valor de y1: ");
        y1 = sc.nextDouble();
        
        System.out.print("Digite o valor de x2: ");
        x2 = sc.nextDouble();
        
        System.out.print("Digite o valor de y2: ");
        y2 = sc.nextDouble();
        
        d = Math.sqrt((((x2-x1))*((x2-x1))+((y2-y1))*((y2-y1))));
        
        System.out.println("A distâcia do ponto P ao ponto Q é: " + d);
    }
    
}
