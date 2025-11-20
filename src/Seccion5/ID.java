package Seccion5;
import java.util.Scanner;
import java.util.Random;

public class ID {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var Random = new Random();
        System.out.println(consola);

        System.out.print("Cual es tu nombre: ");
        var nombre = consola.nextLine();
        var nomNor = nombre.substring(0, 2).toUpperCase();
        System.out.println(nomNor);
        System.out.print("Cual es tu apellido: ");
        var apellido = consola.nextLine();
        var nomApe = apellido.substring(0, 2).toUpperCase();
        System.out.println(nomApe);
        System.out.print("Cual es tu fecha de nacimiento: ");
        var año = consola.nextLine();
        var dosAño = año.substring(2);

        var num1 = String.valueOf(Random.nextInt(10));
        var num2 = String.valueOf(Random.nextInt(10));
        var num3 = String.valueOf(Random.nextInt(10));
        var num4 = String.valueOf(Random.nextInt(10));

        var id = String.join("",nomNor, nomApe, dosAño, num1, num2, num3, num4);
        System.out.printf("""
                Hola Henan: \s
                \tTu numero de identificacion (ID) generado por el sistema es:
                \t%s
                \tFelicidades
                """, id);
    }
    
}
