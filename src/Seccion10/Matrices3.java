package Seccion10;

import java.util.Scanner;

public class Matrices3 {
    public static void main(String[] args) {
        int renglones, columnas;
        var consola = new Scanner(System.in);
        //Definir Matriz
        System.out.println("Proporciona los renglones: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        var matrices = new int [renglones][columnas];
        //Solicitar valores
        for (var ren = 0; ren < renglones; ren++){
            for(var col = 0; col < columnas; col++){
                System.out.println("Este es el " + ren + "," + col + "=");
                matrices[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        //Iterar valores
        for (var ren = 0; ren < renglones; ren++){
            for (var col = 0; col < columnas; col++){
                System.out.println(ren + " " + col + " " + matrices[ren][col]);
            }
        }
        consola.close();
    }
}
