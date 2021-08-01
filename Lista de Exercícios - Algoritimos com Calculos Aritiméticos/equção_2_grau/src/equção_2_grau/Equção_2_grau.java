
package equção_2_grau;

import java.text.DecimalFormat;
import java.util.Scanner;




public class Equção_2_grau {

    
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;
        
        Scanner sc = new Scanner (System.in);
        
        DecimalFormat df = new DecimalFormat ("#,##0.00");
        
        System.out.println("Calculando a equação de segundo grau!!");
        
        System.out.print("Digite o valor de a. ");
        a = sc.nextDouble();
        
        System.out.print("Digite o valor de b ");
        b = sc.nextDouble();
        
        System.out.print("Digite o valor de c. ");
        c = sc.nextDouble();
        
        delta = (b * b) - 4 * a * c;
        
        System.out.println("Delta é: "+ delta);
        
        x1 = (- b + Math.sqrt(delta)) / (2 * a);
        x2 = (- b - Math.sqrt(delta)) / (2 * a);
        
        if (delta >= 0) System.out.println("Os resultados "+ df.format(x1) + "e "+ df.format(x2));
        
        if (delta < 0) System.out.println("Não há raizes reais");

        
        
        
        
        
        
    
        
    }
    
}
