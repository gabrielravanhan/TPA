package exercicio7if;

import java.util.Scanner;

public class Exercicio7if {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta, x1, x2;

        System.out.print("Informe o valor de a. ");
        a = sc.nextDouble();

        System.out.print("Informe o valor de b. ");
        b = sc.nextDouble();

        System.out.print("Informe o valor de c. ");
        c = sc.nextDouble();

        delta = (b * b) - 4 * a * c;

        x1 = (-b + (Math.sqrt(delta))) / (2 * a);
        x2 = (-b - (Math.sqrt(delta))) / (2 * a);

        if (delta > 0) {
            System.out.println("O valor de delta é:" + delta);
            System.out.println("Os resultados de x1 e x2 são, respectivamente: " + x1 + " e " + x2);
        } else {
            if (delta == 0) {
                System.out.println("O valor de delta é:" + delta);
                System.out.println("O resultado de x1 e x2 é: " + x1);
            } else {
                System.out.println("O valor de delta é:" + delta);
                System.out.println("Não há raizes reaia. ");
            }
        }

    }

}
