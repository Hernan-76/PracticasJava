package Seccion10;

public class Matrices {
    public static void main(String[] args) {
        final var renglones = 2;
        final var columnas = 3;
        var matriz = new int [renglones][columnas];
        //Recorrer matrices
        //1. Ciclo externo recorrer renglones
        for ( var ran = 0;  ran < renglones; ran++){
            //2. Ciclo interno. Recorrer columnas
            for (var col = 0; col < columnas; col++){
                System.out.println(ran + col + " = " + matriz[ran][col]);
            }
        }

    }
}
