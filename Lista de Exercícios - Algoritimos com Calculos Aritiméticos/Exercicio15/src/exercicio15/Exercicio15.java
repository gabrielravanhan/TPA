
package exercicio15;

import java.util.Scanner;


public class Exercicio15 {

    
    public static void main(String[] args) {
        double altura, raio, custo, quantidade_de_latas, quantidade_de_litros, area, area_da_base, area_lateral, comprimento, pi;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vamos descobrir quanto sera o custo e a quantidade de latas de tintas necessarias para pintar um cilindro!!! ");
        
        System.out.print("Informe a altura do cilindro. ");
        altura = sc.nextDouble();
        
        System.out.print("Informe o raio do cilindro. ");
        raio = sc.nextDouble();
        
        pi = 3.14;
        
        comprimento = 2 * pi * raio * altura;
        
        area_lateral = altura * comprimento;
        
        area_da_base = pi * (raio * raio);
        
        area = area_da_base + area_lateral;
        
        quantidade_de_litros = area / 3 * 2;
        
        quantidade_de_latas = quantidade_de_litros / 5;
        
        custo = quantidade_de_latas * 40;
        
        System.out.println("A quantidade de latas necessarias sao: " + quantidade_de_latas);
        System.out.println("O custo sera de: " + custo + "reais");
        
        
        
        
      
        
        
        
         
        
        
        
        
       
    }
    
}
