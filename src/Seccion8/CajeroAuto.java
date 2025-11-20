package Seccion8;
import java.util.Scanner;
public class CajeroAuto {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println(consola);
        var saldo = 1000.00;

        var salir = false;
        while (!salir) {
            System.out.print("""
                ***Aplicacion de Cajero Automatico***
                \n1. Consultar saldo
                2. Retirar saldo
                3. Depositar
                4. Salir
                """);
            var opcion = Integer.parseInt(consola.nextLine());
            switch (opcion) {
                case 1:
                System.out.printf("\nTu saldo actual es de %.2f\n", saldo);
                    break;
            
                case 2:
                System.out.println("Cuanto quieres retirar");
                var retirar = Double.parseDouble(consola.nextLine());
                if (retirar > saldo){
                    var total = saldo - retirar;
                    System.out.println("No puede retirar esta cantidad debido a la falta de saldo");
                    System.out.println(total);
                }
                else if (retirar - saldo == 0){
                    System.out.println("Tu saldo restante es de cero");
                }
                else{
                    var total = saldo - retirar;
                    System.out.printf("Tienes un saldo restante de %.2f\n", total);
                }
                    break;

                case 3:
                System.out.println("Cuanto dinero quieres depositar");
                var deposito = Double.parseDouble(consola.nextLine());
                saldo += deposito;
                System.out.printf("Tu saldo actual es de %.2f\n", saldo);
                    break;

                case 4:
                System.out.println("Saliendo del sistema");
                salir = true;
                    break;
            }
        }
    }
}
