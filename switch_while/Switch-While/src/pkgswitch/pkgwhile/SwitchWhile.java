
package pkgswitch.pkgwhile;

import java.util.Scanner;


public class SwitchWhile {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolha;

        double n1, n2, resultado;

        System.out.print("Digite o valor do primeiro número: ");
        n1 = sc.nextDouble();

        System.out.print("Digite o valor do segundo número: ");
        n2 = sc.nextDouble();

        System.out.println("Escolha uma das opções:");
        
        System.out.println("1 - SOMAR");
        
        System.out.println("2 - SUBTRAIR");
        
        System.out.println("3 - MULTIPLICAR");
        
        System.out.println("4 - DIVIDIR");
        
        System.out.println("5 - SAIR");
        escolha = sc.nextInt();

        while (escolha != 5) {

            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu SOMAR: ");

                    resultado = n1 + n2;

                    System.out.println("A soma do primeiro valor pelo segundo é: " + resultado);

                    break;
                case 2:
                    System.out.println("Você escolheu SUBTRAIR: ");

                    resultado = n1 - n2;

                    System.out.println("A subtração do primeiro valor pelo segundo é: " + resultado);

                    break;
                case 3:
                    System.out.println("Você escolheu MULTIPLICAR: ");

                    resultado = n1 * n2;

                    System.out.println("A multiplicação do primeiro valor pelo segundo é: " + resultado);

                    break;
                case 4:
                    System.out.println("Você escolheu DIVIDIR: ");

                    resultado = n1 / n2;

                    System.out.println("A divisão do primeiro valor pelo segundo é: " + resultado);

                    break;
                default:
                    System.out.println("Não existe essa opção");
            }

            System.out.print("Digite o valor do primeiro valor: ");
            n1 = sc.nextDouble();

            System.out.print("Digite o valor do segundo valor: ");
            n2 = sc.nextDouble();

            System.out.println("Escolha uma opção:");
            System.out.println("1 - SOMAR");
            System.out.println("2 - SUBTRAIR");
            System.out.println("3 - MULTIPLICAR");
            System.out.println("4 - DIVIDIR");
            System.out.println("5 - SAIR");
            escolha = sc.nextInt();
        }

        System.out.println("Você escolheu SAIR");
    }
    
}
