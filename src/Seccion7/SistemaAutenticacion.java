package Seccion7;
import java.util.Scanner;
public class SistemaAutenticacion {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println(consola);
        final var usuario = "Luffy 76";
        final var contrasena = "ZoroLuffy";

        System.out.print("Introduce el usuarioa: ");
        var introUsuario = consola.nextLine();
        System.out.print("Introduce la contraseña: ");
        var introContra = consola.nextLine();

        if (introUsuario.equals(usuario) && introContra.equals(contrasena)){
            System.out.printf("""
                    Usuario %s ha introducido la contraseña correcta.\n Bienvenido al sistema %s
                    """, usuario, usuario);
        }
        else if (introUsuario.equals(usuario) && !(introContra.equals(contrasena))){
            System.out.println("Contraseña incorrecta");
        }
        else if (!(introUsuario.equals(usuario)) && (introContra.equals(contrasena))){
            System.out.println("Usuario incorrecto");
        }
        else {
            System.out.println("Usuario y contrasela incorrectas");
        }
    }
}
