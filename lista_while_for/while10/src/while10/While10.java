
package while10;

import java.util.Scanner;


public class While10 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cont = 1, idade, maiori=0, menori=999, mulher=0, quantidadevl=0;
        
        String sexo, olhos, cabelos;
        
        while (cont <= 2){
            System.out.println("Informe a idade da pessoa!");
            idade = sc.nextInt();
            
            System.out.println("Informe o sexo da pessoa!");
            sexo = sc.next();
            
            System.out.println("Informe a cor dos olhos da pessoa!");
            olhos = sc.next();
            
            System.out.println("Informe a cor dos cabelos da pessoa!");
            cabelos = sc.next();
            
            if (idade > maiori) {
                maiori = idade;
            }
            
            if ((sexo.toUpperCase().equals("F")) && ((idade < 35) && (idade > 18))) {
                if ((olhos.toUpperCase().equals("verdes"))){
                     if (cabelos.toUpperCase().equals("louros")){
                        mulher = mulher + cont;
                        mulher++;
                }
                }
            }
            cont++;
        }
        System.out.println("A maior idade dos habitantes é: "+maiori);
        System.out.println("A quantidade de indivíduos do sexo feminino cuja idade está entre 18 e 35 anos é: "+mulher);
    }
    
}
