package Seccion8;

public class NumerosImpares {
    public static void main(String[] args) {
        var holy = 0;
        do {
            if (holy % 2 != 0){
                System.out.println(holy);
                holy++;
            }
            else{
                holy++;
            }
        } while(holy <= 20);
    }
}
