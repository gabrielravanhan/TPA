
package tarefa1;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Tarefa1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat ("#,##0.00");
        
        String n, i, c;
        
        double sb, sr, sl;
        
        System.out.print("Informe o nome do funcioário: ");
        n = sc.next();
        
        System.out.print("Informe a idade do funcioário: ");
        i = sc.next();
        
        System.out.print("Informe o cargo do funário: ");
        c = sc.next();
        
        System.out.print("Informe o salário bruto do funcionário: ");
        sb = sc.nextDouble();
        
        sr = (sb * 0.38) + sb;
        
        sl = (sr + (sr * 0.20)) - (sr * 0.15);
        
        System.out.println("O salário líquido de " + n + " é: " + df.format(sl));
    }
    
}
