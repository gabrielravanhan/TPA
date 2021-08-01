package exercicio14;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;

        double h, peso;

        String sexo;

        System.out.print("Informe o sexo (M ou F)da pessoa! ");
        sexo = sc.nextLine();

        if (sexo.toUpperCase().equals("M")) {
            System.out.println("Informe a altura da pessoa! ");
            h = sc.nextDouble();
            System.out.println("Informe a idade da pessoa! ");
            i = sc.nextInt();
            if (h > 1.7) {
                if (i <= 20) {
                    peso = (72.7 * h) - 58;
                    System.out.println("O peso ideal dessa pessoa é: " + peso);

                } else {
                    if ((i >= 21) && (i <= 39)) {
                        peso = (72.7 * h) - 53;
                        System.out.println("O peso ideal dessa pessoa é: " + peso);

                    } else {
                        if (i >= 40) {
                            peso = (72.7 * h) - 45;
                            System.out.println("O peso ideal dessa pessoa é: " + peso);
                        }
                    }
                }
            } else {
                if (h <= 1.70) {
                    if (i <= 40) {
                        peso = (72.7 * h) - 50;
                        System.out.println("O peso ideal dessa pessoa é: " + peso);
                    } else {
                        if (i > 40) {
                            peso = (72.7 * h) - 58;
                            System.out.println("O peso ideal dessa pessoa é: " + peso);
                        }
                    }
                }
            }
        } else {
            if (sexo.toUpperCase().equals("F")) {
                System.out.println("Informe a altura da pessoa! ");
                h = sc.nextDouble();
                System.out.println("Informe a idade da pessoa! ");
                i = sc.nextInt();
                if (h <= 1.50) {
                    if (i >= 35) {
                        peso = (62.1 * h) - 45;
                        System.out.println("O peso ideal dessa pessoa é: " + peso);
                    } else {
                        if (i < 35) {
                            peso = (62.1 * h) - 49;
                            System.out.println("O peso ideal dessa pessoa é: " + peso);
                        }
                    }
                } else {
                    peso = (62.1 * h) - 44.7;
                    System.out.println("O peso ideal dessa pessoa é: " + peso);
                }
            } else {
                System.out.println("Sexo inválido!!! ");
            }
        }
    }

}
