package Seccion8;
import java.util.Scanner;
public class Contraseña {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Dime la contraseña q quieres crear minimo de 6 caracteres");
        var contrasena = consola.nextLine();
        
        while (contrasena.length() < 6) {
            System.out.print("La contraseña no cumple con los requisitos. Minimo 6 caracteres");
            System.out.print("Ingresa una nueva contraseña");
            contrasena = consola.nextLine();
        }
        System.out.print("La contraseña es valida: " + contrasena);
        consola.close();
    }   
}
