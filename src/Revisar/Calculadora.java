package Revisar;
//Hacer q se pueda usar el resultado obtenido en otros
//Tener en cuenta lo de chatgpt
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var operandosMinimo = 2;
        var salir = false;
        while (!salir) {
                System.out.println("""
                \n*** Calculadora en Java ***
                \t1. Suma
                \t2. Resta
                \t3. Multiplicacion
                \t4. Division
                \t5. Salir
                """);
        System.out.print("Escoge una opcion: ");
        var opcion = Integer.parseInt(consola.nextLine());
            
         switch (opcion) {
            case 1:
                operandosMinimo = 2;
                System.out.print("Cuantos operandos vas usar: ");
                var operandos1 = Integer.parseInt(consola.nextLine());
                System.out.print("Introduce el primer valor q quieres usar: ");
                var operandoInicial1 = Double.parseDouble(consola.nextLine());
                while (operandosMinimo <= operandos1) {
                    System.out.print("Introduce el valor q quieres usar: ");
                    var operando = Double.parseDouble(consola.nextLine());
                    operandoInicial1 += operando;
                    System.out.printf("El resultado es: %.2f\n", operandoInicial1);
                    operandosMinimo++;
                };
                break;
            case 2:
                operandosMinimo = 2;
                System.out.print("Cuantos operandos vas usar: ");
                var operandos2 = Integer.parseInt(consola.nextLine());
                System.out.print("Introduce el primer valor q quieres usar: ");
                var operandoInicial2 = Double.parseDouble(consola.nextLine());
                while (operandosMinimo <= operandos2) {
                    System.out.print("Introduce el valor q quieres usar: ");
                    var operando = Double.parseDouble(consola.nextLine());
                    operandoInicial2 -= operando;
                    System.out.printf("El resultado es: %.2f\n", operandoInicial2);
                    operandosMinimo++;
                };
                break;
            case 3:
                operandosMinimo = 2;
                System.out.print("Cuantos operandos vas usar: ");
                var operandos3 = Integer.parseInt(consola.nextLine());
                System.out.print("Introduce el primer valor q quieres usar: ");
                var operandoInicial3 = Double.parseDouble(consola.nextLine());
                while (operandosMinimo <= operandos3) {
                    System.out.print("Introduce el valor q quieres usar: ");
                    var operando = Double.parseDouble(consola.nextLine());
                    operandoInicial3 *= operando;
                    System.out.printf("El resultado es: %.2f\n", operandoInicial3);
                    operandosMinimo++;
                };
                break;
            case 4:
                operandosMinimo = 2;
                System.out.print("Cuantos operandos vas usar: ");
                var operandos4 = Integer.parseInt(consola.nextLine());
                System.out.print("Introduce el primer valor q quieres usar: ");
                var operandoInicial = Double.parseDouble(consola.nextLine());
                while (operandosMinimo <= operandos4) {
                    System.out.print("Introduce el valor q quieres usar: ");
                    var operando = Double.parseDouble(consola.nextLine());
                    var resto1 = operandoInicial % operando;
                    operandoInicial /= operando;
                    System.out.printf("El resultado es: %.2f. Con un resto de %.2f\n", operandoInicial, resto1);
                    operandosMinimo++;
                };
                break;
            case 5:
                System.out.println("Saliendo del sistema");
                salir = true;
                break;
            default:
                System.out.print("Opcion incorrecta volviendo al menu");
                break;
            }   
            //ff
        }
        consola.close();
    }
}
