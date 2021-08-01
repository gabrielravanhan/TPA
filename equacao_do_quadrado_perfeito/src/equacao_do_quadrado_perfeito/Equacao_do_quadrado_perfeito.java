
package equacao_do_quadrado_perfeito;


import java.util.Scanner;


public class Equacao_do_quadrado_perfeito {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a, b, r;
        
        System.out.print("Digite o valor de a." );
        a = sc.nextDouble();
        
        System.out.print("Digite o valor de b. ");
        b = sc.nextDouble();
        
        r = (a*a) + (2*a*b) + (b*b);
        
        System.out.println("O resultado é: "+ r);
       
    }
    
}
