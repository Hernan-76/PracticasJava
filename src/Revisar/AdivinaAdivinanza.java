package Revisar;
import java.util.Scanner;
import java.util.Random;
public class AdivinaAdivinanza {
    public static void main(String[] args) {
        System.out.println("Este es un juego el cual consiste en adivinar un numero al azar del 0 al 100");
        var consola = new Scanner(System.in);
        var aleatorio = new Random();
        var numeroIntentos = 1;
        final var numero = aleatorio.nextInt(100) + 1;
        System.out.print("Introduce tu primer intento: ");
        var numUsuario = Integer.parseInt(consola.nextLine());
        while (numero != numUsuario) {
            if (numUsuario < numero){
                System.out.printf("El numero secreto es mayor q %d", numUsuario);
                System.out.print("\nVuele a intentarlo: ");
                numUsuario = Integer.parseInt(consola.nextLine());
                numeroIntentos++;
            }
            else{
            System.out.printf("El numero secreto es menor q %d", numUsuario);
            System.out.print("\nVuelve a intentarlo: ");
            numUsuario = Integer.parseInt(consola.nextLine());
            numeroIntentos++;    
            }
        }
        System.out.printf("Felicidades acertaste el numero %d en %d intentos", numero, numeroIntentos);
        consola.close();
        //Añdir numero de intentos cuando te apectezca

    }
}
