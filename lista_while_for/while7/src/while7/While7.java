package while7;

import java.util.Scanner;

public class While7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, soma = 0, maior = 0, menor = 99999;
        int cont = 1;
        double media;

        while (cont <= 10) {
            System.out.println("Informe o " + cont + "° numero:");
            num = sc.nextInt();
            soma = soma + num;

            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
            cont++;
        }
        media = (double) soma / 10;

        System.out.println("Média dos números =>" + media);
        System.out.println("Maior número => " + maior);
        System.out.println("Menor número =>" + menor);
    }

}
