package while3;

public class While3 {

    public static void main(String[] args) {
        int cont = 85, soma = 0;

        while (cont < 907) {
            if (cont % 2 == 0) {
                System.out.println(cont);
                soma += cont; //soma = soma + cont
            }
            cont++;
        }
        System.out.println("A soma dos números entre 85 e 907 é => " + soma);

    }

}
