package Seccion8;

import java.util.Scanner;

public class DibujoRectangulo {
    public static void main(String[] args) {
        System.out.println("Dibujo de triangulo");
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el numero de filas para el triangulo: ");
        var numerFilas = Integer.parseInt(consola.nextLine());
        for (var fila = 1; fila <= numerFilas; fila++){
            var espacioBlanco = " ".repeat(numerFilas - fila);
            var asteriscos = "*".repeat(2 * fila - 1);
            System.out.println(espacioBlanco + asteriscos);
        }
        consola.close();
    }
}
