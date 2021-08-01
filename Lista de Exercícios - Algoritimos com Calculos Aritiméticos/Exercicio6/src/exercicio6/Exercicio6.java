
package exercicio6;

import java.util.Scanner;


public class Exercicio6 {

    
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        String nome;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vamos descobrir sua media aritimetica!");
        
        System.out.print("Informe o nome do aluno. ");
        nome = sc.next();
        
        System.out.print("Informe a primeira nota de " + nome + ".");
        nota1 = sc.nextDouble();
        
        System.out.print("Informe a segunda nota de " + nome + ".");
        nota2 = sc.nextDouble();
        
        System.out.print("Informe a terceira nota de " + nome + ".");
        nota3 = sc.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("A media aritimetica de " + nome + " e: " + media);
        
        
        
        
    }
    
}
