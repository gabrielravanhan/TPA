package while8;

import java.util.Scanner;

public class While8 {

    public static void main(String[] args) {
        Scanner lm = new Scanner(System.in);

        int cont = 1, idade, maiori = 0, menori = 99999, quantidadehoman = 0;
        double salario, soma = 0, media;
        String sexo;

        while (cont <= 20) {
            System.out.println("Informe a idade para a " + cont + "° pessoa => ");
            idade = lm.nextInt();

            System.out.println("Informe o sexo para a " + cont + "° pessoa => ");
            sexo = lm.next();

            System.out.println("Informe o salario para a " + cont + "° pessoa => ");
            salario = lm.nextDouble();

            soma = soma + salario;

            if (idade > maiori) {
                maiori = idade;
            }

            if (idade < menori) {
                menori = idade;
            }

            //if ((sexo.equals("F")) || (sexo.equals("f"))) {
//
            if ((sexo.toUpperCase().equals("F")) && (salario <= 100)) {
                quantidadehoman++;
            }
            cont++;
        }
        media = soma / 20;

        System.out.println("Média dos salarios dos habitantes " + media);
        System.out.println("Maior idade do grupo " + maiori);
        System.out.println("Menor idade do grupo " + menori);
        System.out.println("Quantidade de Mulhere com salario ate 100 " + quantidadehoman);
    }

}
