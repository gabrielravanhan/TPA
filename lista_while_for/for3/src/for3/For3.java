package for3;

import java.util.Scanner;

public class For3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, soma = 0, quant = 0;

        for (int i = 1; i <= 50; i++) {
            System.out.print("Informe o número! ");
            n = sc.nextInt();

            if (n >= 0) {
                soma = soma + n;
            } else {
                quant++;
            }
        }
        System.out.println("A soma dos números positivos é: " + soma);
        System.out.println("A quantidade de números negativos é: " + quant);
    }

}
