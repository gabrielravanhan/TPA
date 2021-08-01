package tarefa2;

import java.util.Scanner;

public class Tarefa2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sexo, cor_olho, cor_cabelo;
        int idade, maior_idade = 0, cont_sexo_feminino = 0, cont_18_35 = 0;
        double porc_18_35;

        System.out.print("Informe a idade do habitante: ");
        idade = sc.nextInt();

        while (idade > 0) {
            System.out.print("Informe o sexo do habitante: (M/F) ");
            sexo = sc.next();

            System.out.print("Informe a cor dos olhos: ");
            cor_olho = sc.next();

            System.out.print("Informe a cor dos cabelos do habitante: ");
            cor_cabelo = sc.next();
            if (idade > maior_idade) {
                maior_idade = idade;
            }
            if (sexo.toUpperCase().equals("F")) {
                cont_sexo_feminino++;
                if (idade >= 18 && idade <= 35) {
                    if (cor_olho.toUpperCase().equals("VERDES")) {
                        if (cor_cabelo.toUpperCase().equals("LOUROS")) {
                            cont_18_35++;
                        }
                    }
                }
            }
            System.out.print("Informe a idade do habitante: ");
            idade = sc.nextInt();
        }
        porc_18_35 = ((cont_18_35 * 100) / cont_sexo_feminino);
        System.out.println("A maior idade entre os habitantes é => " + maior_idade);
        System.out.println("A percentagem de indivíduos do sexo feminino \n"
                + "cuja idade está entre 18 e 35 anos inclusive e que tenham \n"
                + "olhos verdes e cabelos louros => " + porc_18_35);
    }
}
