package Seccion7;
import java.util.Scanner;
public class ReservaHotel {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println(consola);
        var noMar = 150.50;
        var siMar = 190.50;
        System.out.print("Cual es el nombre del cliente: ");
        var nombre = consola.nextLine();
        System.out.print("Cuanto tiempo sera su estancia en el hotel en dias: ");
        var tiempo = Float.parseFloat(consola.nextLine());
        System.out.print("Quieres un cuarto con vistas al mar? (True/False): ");
        var tipoCuarto = Boolean.parseBoolean(consola.nextLine());
        var cuarto = (tipoCuarto == true) ? siMar * tiempo : noMar * tiempo;
        System.out.println(cuarto);
        System.out.printf("El señor/a: %s", nombre);
        System.out.printf("Tiene q pagar un total: %.2f", cuarto); 


    }
}
