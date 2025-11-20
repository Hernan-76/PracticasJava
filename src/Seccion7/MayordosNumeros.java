package Seccion7;
import java.util.Scanner;
public class MayordosNumeros {
    public static void main(String[] args) {
    var consola = new Scanner(System.in);
    System.out.println(consola);
    System.out.print("Introduce dos numeros enteros");
    System.out.print("\nPrimer numero: ");
    var num1 = Integer.parseInt(consola.nextLine());
    System.out.print("Introduce el segundo numero: ");
    var num2 = Integer.parseInt(consola.nextLine());
    var mayor = (num1 > num2) ? String.format("El numero %d es mas grande q %d", num1, num2) : 
    String.format("El numero %d es mas grande q %d", num2, num1);
    System.out.println(mayor);
    }
    

}
