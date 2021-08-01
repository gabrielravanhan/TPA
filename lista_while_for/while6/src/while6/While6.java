
package while6;

import java.util.Scanner;


public class While6 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double massa;
        int tempo = 0;
       
        System.out.print("Informe a massa do material: ");
        massa = sc.nextDouble();
       
        while (massa > 0.05 ) {
            massa = massa/2;
            System.out.println("Massa => " + massa);
            tempo = tempo + 50;
        }
        System.out.println("Tempo necessario => " + tempo + " Segundos");
    }
    
}
