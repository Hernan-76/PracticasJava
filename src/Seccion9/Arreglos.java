package Seccion9;

import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Proporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        //Creamos de manera dinamica el arreglo
        var enteros = new int[largoArreglo];
        //Solicitar valores del arreglo
        for (var i = 0; i < largoArreglo; i++){
            System.out.print("Proporciona el valor respectivo en enteros: ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }
        //Imprimir los arreglos
        System.out.println("\nImpresion del arreglo: ");
        for (var i = 0; i < largoArreglo; i++){
            System.out.println(enteros[i]);
        }
        consola.close();
    }
}
