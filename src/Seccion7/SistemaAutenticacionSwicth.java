package Seccion7;
import java.util.Scanner;
public class SistemaAutenticacionSwicth {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println(consola);
        final var usuario = "Luffy 76";
        final var contrasena = "ZoroLuffy";

        System.out.print("Introduce el usuarioa: ");
        var introUsuario = consola.nextLine();
        System.out.print("Introduce la contraseña: ");
        var introContra = consola.nextLine();

        var mensaje = switch (introUsuario){
            case usuario -> {
                if (contrasena.equals(introContra)){
                    yield "Bienvenido al sistema";
                }
                else {
                    yield "Contraseña incorrecta vuelva a intentarlo";
                }
            }
            default -> {
                if (contrasena.equals(introContra)){
                    yield "Usuario incorrecto, vuelva a intentarlo";
                }
                else{
                    yield "Ambos son incorrectos, vuelva a intentarlo";
                }
            }
        };
        System.out.println(mensaje);
    }
}
