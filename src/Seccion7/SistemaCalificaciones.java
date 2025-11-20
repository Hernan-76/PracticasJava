package Seccion7;
import java.util.Scanner;
public class SistemaCalificaciones {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println(consola);

        System.out.println("Cual es tu nota");
        var nota = Double.parseDouble(consola.nextLine());
        if (nota >= 9 && nota <= 10){
            System.out.println("Tienes una A");
        }
        else if (nota >= 8 && nota <= 9){
            System.out.println("Tienes una B");
        }
        else if (nota >= 7 && nota <= 8){
            System.out.println("Tienes una C");
        }
        else if (nota >= 6 && nota <= 7){
            System.out.println("Tienes una D");
        }
        else if (nota >= 0 && nota <= 6){
            System.out.println("Tienes una F");
        }
        else {
            System.out.println("Valor desconocido");
        }
    }
}
