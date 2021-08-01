package for1;

import java.util.Scanner;

public class For1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tab, re;

        System.out.print("Informe o numero! ");
        tab = sc.nextInt();

        for (int cont = 0; cont <= 10; cont++) {

            re = cont * tab;
            System.out.println(re);
        }
    }

}
