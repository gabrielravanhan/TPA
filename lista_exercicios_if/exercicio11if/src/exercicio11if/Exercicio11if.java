package exercicio11if;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11if {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#,##0.00");

        double sald, perc;

        System.out.println("Informe o se saldo médio. ");
        sald = sc.nextDouble();

        if ((sald >= 0) && (sald <= 200)) {
            System.out.println("Nenhum crédito. ");
        } else {
            if ((sald >= 201) && (sald <= 400)) {
                perc = sald * 0.2;
                System.out.println("O seu crédito é de: " + df.format(perc));
            } else {
                if ((sald >= 401) && (sald <= 600)) {
                    perc = sald * 0.3;
                    System.out.println("O seu crédito é de: " + df.format(perc));
                } else {
                    perc = sald * 0.4;
                    System.out.println("O seu crédito é: " + df.format(perc));

                }

            }
        }

    }

}
