
package exercicio5;

import java.util.Scanner;


public class Exercicio5 {

    
    public static void main(String[] args) {
        double tp, qpp, vap, total_pago, saldo_devedor;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vamos descobrir quanto o total pago e o saldo devedor do consorciado!!!");
        
        System.out.print("Informe o numero total de prestacoes. ");
        tp = sc.nextDouble();
        
        System.out.print("Informe a quantidade de prestacoes pagas. ");
        qpp = sc.nextDouble();
        
        System.out.print("Informe o valor atual da prestacao. ");
        vap = sc.nextDouble();
        
        total_pago = qpp * vap;
        
        saldo_devedor = (tp - qpp) * vap;
        
        System.out.println("O total pago pelo consorciado e. " + total_pago);
        System.out.println("O saldo devedor do consorciado e. " + saldo_devedor);
        
       
        
        
    }
    
}
