
package exercicio8;

import java.util.Scanner;


public class Exercicio8 {

    
    public static void main(String[] args) {
        double salario_fixo, vendas, comissao, salario_final;
        String nome;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vamos descobrir o salario fixo e o salario final do vendedor?!");
        
        System.out.print("Imforme o nome do vendedor. ");
        nome = sc.next();
        
        System.out.print("Informe o salario fixo do vendedor. ");
        salario_fixo = sc.nextDouble();
        
        System.out.print("Informe o total de vendas efetuadas por ele em dinheiro. ");
        vendas=sc.nextDouble();
        
        comissao = vendas * 0.15;
        
        salario_final = salario_fixo + comissao;
        
        System.out.println(nome + " Recebe " + salario_fixo + " de salario fixo e recebeu: " + salario_final + " de salario final");
                
        
                
        
                
                
        
        
        
        
        
        
    }
    
}
