
package aprendi;

import java.util.Scanner;


public class Aprendi {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade, quant, cont=1, voto, v1 = 0, v2 = 0, v3 = 0, v4 = 0, v5 = 0, maior=0;
        
        double media;
        
        while (cont <= 100){
            System.out.print("Qual a sua idade?");
            idade = sc.nextInt();
            
            System.out.print("Qual sua opinião em relação ao filme?");
            voto = sc.nextInt();
            
            if (voto == 1){
                v1++;
            }
            else{
                if (voto == 2){
                    v2++;
                }
                else{
                    if (voto == 3){
                        v3++;
                    }
                    else{
                        if (voto == 4){
                            v4++;
                        }
                        else{
                            if (voto == 5){
                                v5++;
                            }
                            else{
                                System.out.println("Não há uma avaliação com esse número!");
                            }
                        }
                    }
                }
            }
            if ((idade > maior) && (voto == 3)){
                maior = idade;
            }
            cont++;
        }
        
        media = (double) v3 / 100;
        
        System.out.println("O número de pessoas que responderam ótimo é: "+v5);
        System.out.println("A média de pessoas que responderam ruim é: "+media);
        System.out.println("A pessoa com maior idade que repondeu 'ruim' tem: "+maior+" anos");
    }
    
}
