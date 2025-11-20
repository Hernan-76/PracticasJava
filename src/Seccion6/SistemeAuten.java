package Seccion6;
import java.util.Scanner;

public class SistemeAuten {
    public static void main(String[] args) {
        final var finUsu = "Trollino";
        final var finContra = "Fluffy";
        var consola = new Scanner(System.in);

        System.out.print("Introduce tu usuario: ");
        var usuario = consola.nextLine();
        System.out.println("Introduce tu contraseña: ");
        var contrasena = consola.nextLine();
        System.out.println(consola);

        var pasaras = usuario.equals(finUsu) && contrasena.equals(finContra);
        System.out.printf("Los datos introducidos son %s", pasaras);
    }
}
