package praticar;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Praticar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("##0.00");

        int qtde_vezes, cont = 1, qtde10 = 0, qtde_10_15 = 0, qtde_15 = 0;

        double perc_menos_10, perc_10_15, perc_mais_15;

        System.out.print("Informe a qtde de vezes que frequentou o restaurante: ");

        qtde_vezes = sc.nextInt();

        while (qtde_vezes >= 0) {

            if (qtde_vezes < 10) {

                qtde10++;

            } else {

                if ((qtde_vezes >= 10) && (qtde_vezes <= 15)) {

                    qtde_10_15++;

                } else {

                    qtde_15++;

                }

            }

            cont++;

            System.out.print("Informe a qtde de vezes que frequentou o restaurante: ");

            qtde_vezes = sc.nextInt();

        }

        perc_menos_10 = (qtde10 * 100) / (cont - 1);

        perc_10_15 = (qtde_10_15 * 100) / (cont - 1);

        perc_mais_15 = (qtde_15 * 100) / (cont - 1);

        System.out.println("percentual de alunos que"
                + " utilizaram menos que 10 vezes o restaurante: " + df.format(perc_menos_10) + "%");

        System.out.println("percentual de alunos que"
                + " utilizaram entre 10 e 15 vezes o restaurante: " + df.format(perc_10_15) + "%");

        System.out.println("percentual de alunos que"
                + " utilizaram mais que 15 vezes o restaurante: " + df.format(perc_mais_15) + "%");
    }

}
