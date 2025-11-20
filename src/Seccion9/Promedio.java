package Seccion9;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        System.out.println("***Promedio Calificaciones***");
        var consola = new Scanner(System.in);
        System.out.print("Cuantas calificaciones quieres agregar: ");
        var cantidad = Integer.parseInt(consola.nextLine());
        var enteros = new int[cantidad];
        for (var i = 0; i < cantidad; i++){
            System.out.print("Proporciona el valor respectivo de las notas: ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }
        var sumaPromedio = 0;
        for (var i = 0; i < cantidad; i++){
            sumaPromedio += enteros[i];
        }
        var promedio = sumaPromedio / cantidad;
        System.out.println("Promedio de calificaciones:" + " " + promedio);
        consola.close();
    }
}
