package Seccion5;
import java.util.Scanner;
public class Receta {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println(consola);

        System.out.print("Cual es el nombre de la receta: ");
        var recNom = consola.nextLine();
        
        System.out.print("Cuales son los ingrediente de la receta: ");
        var ingrediente = consola.nextLine();
        
        System.out.print("Cuanto tiempo se tarda: ");
        var tiempo = Integer.parseInt(consola.nextLine());
        
        System.out.print("Cual es la difucultad de la receta?");
        var difucultad = consola.nextLine();
        

        System.out.println("Nombre receta: " + recNom);
        System.out.println("Los ingredientes son: " + ingrediente);
        System.out.println("El total en minutos son: " + tiempo);
        System.out.println("La dificultad es: " + difucultad);
    }
}
