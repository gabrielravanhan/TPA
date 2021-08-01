package exercicio2if;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2if {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#0.0");

        double p1, p2, p3, m;

        System.out.print("Informe a nota tirada na primeira prova. ");
        p1 = sc.nextDouble();

        System.out.print("Informe a nota tirada na segunda prova. ");
        p2 = sc.nextDouble();

        System.out.print("Informe a nota tirada na terceira prova. ");
        p3 = sc.nextDouble();

        m = ((p1 * 4) + (p2 * 3) + (p3 * 3)) / (4 + 3 + 3);

        if (m >= 7) {
            System.out.println("O aluno foi aprovado. A sua média foi: " + df.format(m));
        } else {
            if (m < 5) {
                System.out.println("O aluno foi reprovado. A sua média foi: " + df.format(m));
            } else {
                System.out.println("O aluno ficou de recuperação. A sua média foi: " + df.format(m));
            }
        }

    }

}
