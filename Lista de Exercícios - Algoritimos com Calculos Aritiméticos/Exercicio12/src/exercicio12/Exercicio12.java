
package exercicio12;

import java.util.Scanner;


public class Exercicio12 {

    
    public static void main(String[] args) {
        double fahrenheit, celcius;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vamos realizar a transformar graus fahrenheit em graus celcius?!");
        
        System.out.print("Informe a temperatura em graus fahrenheit: ");
        fahrenheit = sc.nextDouble();
        
        celcius = (fahrenheit - 32) * 5 / 9;
        
        System.out.println(fahrenheit + " graus fahrenheit sao: " + celcius + " graus celcius");
        
    
        
        
        
        
    }
    
}
