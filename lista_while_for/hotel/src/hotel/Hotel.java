package hotel;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#,###,##0.00");

        String nome;

        int qtde_diarias, cont = 1;

        double total_cliente, total_hotel = 0;

        while (cont <= 3) {

            System.out.print("Informe o nome do cliente: ");

            nome = sc.next();

            System.out.print("Informe o número de diárias do cliente: ");

            qtde_diarias = sc.nextInt();

            if (qtde_diarias < 15) {

                total_cliente = (qtde_diarias * 50) + (qtde_diarias * 4);

            } else {

                if (qtde_diarias == 15) {

                    total_cliente = (qtde_diarias * 50) + (qtde_diarias * 3.60);

                } else {

                    total_cliente = (qtde_diarias * 50) + (qtde_diarias * 3);

                }

            }

            System.out.println("Total a Pagar pelo cliente: " + df.format(total_cliente));

            System.out.println("*************************************************************");

            total_hotel = total_hotel + total_cliente;

            cont++;

        }

        System.out.println("*************************************************************");

        System.out.println("Total ganho pelo hotel => " + df.format(total_hotel));
    }

}
