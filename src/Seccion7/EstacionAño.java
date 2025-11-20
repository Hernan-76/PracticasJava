package Seccion7;
import java.util.Scanner;
public class EstacionAño {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println(consola);
        System.out.println("Teniendo en cuenta q el año tiene 12 meses di un numero entre 1 y 12 para saber en q estacion estamos");
        var mes = Integer.parseInt(consola.nextLine());
        if (mes == 1 || mes == 2 || mes == 12){
            System.out.println("La estacion es invierno");
        }
        else if (mes == 3 || mes == 4 || mes == 5){
            System.out.println("La estacion es primavera");
        }
        else if (mes == 6 || mes == 7 || mes == 8){
            System.out.println("La estacion es verano");
        }
        else if (mes == 9 || mes == 10 || mes == 11){
            System.out.println("La estacion es otoño");
        }
        else{
            System.out.println("No concuerda con ningun mes subnormal");
        }
        switch (mes){
            case 1, 2, 12 -> System.out.println("Invierno");
            case 3, 4, 5 -> System.out.println("Primavera");
            case 6, 7, 8 -> System.out.println("Verano");
            case 9, 10, 11 -> System.out.println("Otoño");
        }
    }
}
