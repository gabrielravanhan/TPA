package exercicio12if;

import java.util.Scanner;

public class Exercicio12if {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo, qtde;
        double vlpagar;
        System.out.println("***************************************");
        System.out.println("* Nome do Produto *  Código * Preço   *");
        System.out.println("***************************************");
        System.out.println("* Cachorro Quente *    100  * R$ 1,20 *");
        System.out.println("***************************************");
        System.out.println("* Bauru Simples   *    101  * R$ 1,30 *");
        System.out.println("***************************************");
        System.out.println("* Bauru com Ovo   *    102  * R$ 1,50 *");
        System.out.println("***************************************");
        System.out.println("* Hamburguer      *    103  * R$ 1,20 *");
        System.out.println("***************************************");
        System.out.println("* CheeseBurguer   *    104  * R$ 1,30 *");
        System.out.println("***************************************");
        System.out.println("* Refrigerante    *    105  * R$ 1,00 *");
        System.out.println("***************************************");

        System.out.print("Informe o código do produto de acordo com a tabela acima: ");
        codigo = sc.nextInt();
        System.out.print("Informe a qtde que deseja pedir: ");
        qtde = sc.nextInt();

        if (codigo == 100) {
            System.out.println("Você escolheu CHACHORRO QUENTE !!!");
            vlpagar = qtde * 1.20;
        } else {
            if (codigo == 101) {
                System.out.println("Você escolheu BAURU SIMPLES !!!");
                vlpagar = qtde * 1.30;
            } else {
                if (codigo == 102) {
                    System.out.println("Você escolheu BAURU COM OVO !!!");
                    vlpagar = qtde * 1.50;
                } else {
                    if (codigo == 103) {
                        System.out.println("Você escolheu Hamburguer !!!");
                        vlpagar = qtde * 1.20;
                    } else {
                        if (codigo == 104) {
                            System.out.println("Você escolheu CHEESEBURGUER !!!");
                            vlpagar = qtde * 1.30;
                        } else {
                            if (codigo == 105) {
                                System.out.println("Você escolheu REFRIGERANTE !!!");
                                vlpagar = qtde * 1.00;
                            } else {
                                System.out.println("PRODUTO INEXISTENTE !!!");
                                vlpagar = 0;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("VALOR A PAGAR => " + vlpagar);

        switch (codigo) {
            case 100:
                System.out.println("Você escolheu CHACHORRO QUENTE !!!");
                vlpagar = qtde * 1.20;
                System.out.println("VALOR A PAGAR => " + vlpagar);
                break;
            case 101:
                System.out.println("Você escolheu BAURU SIMPLES !!!");
                vlpagar = qtde * 1.30;
                System.out.println("VALOR A PAGAR => " + vlpagar);
                break;
            case 102:
                System.out.println("Você escolheu BAURU COM OVO !!!");
                vlpagar = qtde * 1.50;
                System.out.println("VALOR A PAGAR => " + vlpagar);
                break;
            case 103:
                System.out.println("Você escolheu Hamburguer !!!");
                vlpagar = qtde * 1.20;
                System.out.println("VALOR A PAGAR => " + vlpagar);
                break;
            case 104:
                System.out.println("Você escolheu CHEESEBURGUER !!!");
                vlpagar = qtde * 1.30;
                System.out.println("VALOR A PAGAR => " + vlpagar);
                break;
            case 105:
                System.out.println("Você escolheu REFRIGERANTE !!!");
                vlpagar = qtde * 1.00;
                System.out.println("VALOR A PAGAR => " + vlpagar);
                break;
            default:
                System.out.println("PRODUTO INEXISTENTE !!!");
                vlpagar = 0;
                System.out.println("VALOR A PAGAR => " + vlpagar);
                break;
        }

    }

}
