
package tarefa1;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Tarefa1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
        
        int cont=1, n_fun;
        
        String nome;

        double salario, sal_alto = 0, sal_baixo = 9999999, soma_sal = 0, media;
        
        System.out.print("Informe o número de funcionários! ");
        n_fun = sc.nextInt();
        
        while (cont <= n_fun) {
            
            System.out.print("Informe o nome do funcionário! ");
            nome = sc.next();

            System.out.print("Informe o salário do funcionário! ");

            salario = sc.nextDouble();

            soma_sal = soma_sal + salario;

            if (salario > sal_alto) {

                sal_alto = salario;

            }

            if (salario < sal_baixo) {

                sal_baixo = salario;

            }
            cont++;
        }
        
        media = soma_sal / n_fun;
        
        System.out.println("Média dos Salários é: " +df.format(media));

        System.out.println("Salário mais alto é: " +df.format(sal_alto));

        System.out.println("Salário mais baixo é: " +df.format(sal_baixo));
    }
    
}
