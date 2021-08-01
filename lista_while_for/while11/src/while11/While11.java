package while11;

import java.util.Scanner;

public class While11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 1;

        String nome;

        double salario, sal_alto = 0, sal_baixo = 9999999, soma_sal = 0, media = 0;

        System.out.print("Informe o nome do funcionário: ");

        nome = sc.next();

        while (!nome.toUpperCase().equals("FIM")) {

            System.out.print("Informe o salário do funcionário: ");

            salario = sc.nextDouble();

            soma_sal = soma_sal + salario;

            if (salario > sal_alto) {

                sal_alto = salario;

            }

            if (salario < sal_baixo) {

                sal_baixo = salario;

            }

            System.out.print("Informe o nome do funcionário: ");

            nome = sc.next();

            cont++;

        }

        if (cont > 1) {

            media = soma_sal / (cont - 1);

        }

        System.out.println("Média dos Salários => " + media);

        System.out.println("Salário mais alto => " + sal_alto);

        System.out.println("Salário mais baixo => " + sal_baixo);
    }

}
