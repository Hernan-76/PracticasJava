package Revisar;
//Hacer q funciona con culquier cosa. Patrones
import java.util.Scanner;

public class DiagonalRevisar {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        int renglones, columnas;
        System.out.print("Cuantos renglones va a tener: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Cuantas columnas va a tener: ");
        columnas = Integer.parseInt(consola.nextLine());
        var matrices = new int [renglones][columnas];
        for (var ren = 0; ren < renglones; ren++){
            for (var col = 0; col < columnas; col++){
                System.out.print("Este es el renglon " + ren + "y columna " + col);
                matrices[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        var sumaDiagonal = 0;
        for (var ren = 0; ren < renglones; ren++){
            for (var col = 0; col < columnas; col++){
                if (ren == col){
                    sumaDiagonal += matrices[ren][col];
                }
            }
        }
        System.out.println(sumaDiagonal);
        consola.close();

    }
}
