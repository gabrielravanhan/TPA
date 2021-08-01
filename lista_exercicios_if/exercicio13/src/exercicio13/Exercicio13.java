package exercicio13;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Informe o valor do lado A => ");
        a = sc.nextInt();

        System.out.print("Informe o valor do lado B => ");
        b = sc.nextInt();

        System.out.print("Informe o valor do lado C => ");
        c = sc.nextInt();

        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            if ((a == b) && (a == c)) {
                System.out.println("Triângulo Equilátero");
            } else {
                if ((a == b) || (a == c) || (b == c)) {
                    System.out.println("Triângulo Isósceles");
                } else {
                    System.out.println("Triângulo Escaleno");
                }
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo");
        }
    }

}
