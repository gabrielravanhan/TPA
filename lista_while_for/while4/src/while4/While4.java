
package while4;


public class While4 {

    
    public static void main(String[] args) {
        int cont=1, mult=1;
        
        while (cont <= 15){
            if (cont % 2 != 0){
                System.out.println(cont);
                mult= mult*cont;
            }
            cont++;
        }
        System.out.println("O produto entre 1 e 15 é:" +mult);
    }
    
}
