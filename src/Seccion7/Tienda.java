package Seccion7;
import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println(consola);
        final var minimo = 1000;
        System.out.print("Cuanto dinero has gastado: ");
        var gastado = Integer.parseInt(consola.nextLine());
        System.out.println("Eres miembro (true/false)");
        var miembro = Boolean.parseBoolean(consola.nextLine());
        if (gastado > minimo && miembro){
            System.out.println("Tienes un descuento del 10%%");
        }
        else if (miembro) {
            System.out.println("Tienes un descuento del 5%%");
        }
        else {
            System.out.println("No tienes ningun descuento");
        }
    }
}
