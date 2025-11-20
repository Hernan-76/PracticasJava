package Seccion8;
public class AcumulacionSuma {
    public static void main(String[] args) {
        var holy = 0;
        var holy1 = 0;
        final var max = 5;
        var acumuladorSuma = 0;
        var acumuladorSuma1 = 0;
        var acumuladorSuma2 = 0;
        
        while (holy <= max) {
            acumuladorSuma += holy++;
            //System.out.println(acumuladorSuma + " " + holy);
        }
        System.out.println(acumuladorSuma);

        do {
            acumuladorSuma1 += holy1++;
        } while(holy1 <= max);
        System.out.println(acumuladorSuma1);
        
        for(int holy2 = 0; holy2 <=5; holy2++){
            acumuladorSuma2 += holy2;
            System.out.println(acumuladorSuma2);
        };

    }
}