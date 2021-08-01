package for2;

import java.util.Scanner;

public class For2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quant_idade = 0, quant_altura = 0;

        double idade, idadem, altura, alturam, somai = 0, somaa = 0;

        for (double cont = 1; cont <= 3; cont++) {
            System.out.print("Informe a idade do aluno! ");
            idade = sc.nextDouble();

            System.out.print("Informe a altura do aluno! ");
            altura = sc.nextDouble();

            if (altura < 1.7) {
                somai = somai + idade;
                quant_idade++;
            }

            if (idade > 20) {
                somaa = somaa + altura;
                quant_altura++;
            }
        }

        idadem = somai / quant_idade;
        alturam = somaa / quant_altura;

        System.out.println("A idade média dos alunos com menos de 1,70m de altura é " + idadem);
        System.out.println("A altura média dos alunos com mais de 20 anos é " + alturam);
    }

}
