package Seccion8;
import java.util.Scanner;
public class MenuIterativo {
    public static void main(String[] args) {
        var consola = new  Scanner(System.in);
        System.out.println(consola);
        var salir = false;

        while (!salir) {
            System.out.println("""
                    Sistema de administracion de Cuentas
                    Menu:
                    1. Crear Cuenta
                    2. Eliminar Cuenta
                    3. Salir
                    Escoge una accion: 
                    """);
            var opcion = Integer.parseInt(consola.nextLine());
            switch (opcion){
                case 1 -> System.out.println("Creando tu cuenta... \n");
                case 2 -> System.out.println("Eliminando tu cuenta... \n");
                case 3 ->{
                    System.out.println("Saliendo");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida\n");
            }

        }
        System.out.println("Fin del sistema de administracion de cuentas");
    }
    

}
