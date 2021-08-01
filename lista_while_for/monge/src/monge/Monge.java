
package monge;


public class Monge {

    
    public static void main(String[] args) {
       double cont=1, tab=1, nu=1;
       
       while (cont <= 64){
           tab = 2 * tab;
           nu = nu + tab;
           cont++;
       }
        System.out.println("O número de grãos de trigo que o monge recebeu foi "+nu);
    }
    
}
