
package while5;

import java.text.DecimalFormat;


public class While5 {

    
    public static void main(String[] args) {
        double chico = 1.50, ze = 1.10, cont = 0;
         DecimalFormat df = new DecimalFormat("0.00");
       
        while (chico > ze) {
            chico = chico + 0.02;
            ze = ze + 0.03;
            cont++;
            System.out.println("No " + cont + "º ano Chico tinha => "
                               + df.format(chico) + " e ze tinha => " + df.format(ze));
        }
         System.out.println("Demorou " + cont + " anos para Zé ficar maior que chico.");
        }
          
    }
    

