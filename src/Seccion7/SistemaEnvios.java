package Seccion7;
import java.util.Scanner;
public class SistemaEnvios {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println(consola);
        final var tarifa_nacional = 10.0;
        final var tarifa_internacional = 20.0;
        System.out.println("Ingresa el destino del paquete (nacional/internacional)");
        var destino = consola.nextLine().strip().toLowerCase();
        System.out.println("Ingresa el peso del paquete en kilos");
        var peso = Double.parseDouble(consola.nextLine());
        var costoEnvio = switch (destino){
            case "nacional" -> peso * tarifa_nacional;
            case "internacional" -> peso * tarifa_internacional;
            default -> {
                System.out.println("Destino invalido. Ingresa nacional/internacional");
                yield null;
            }
        };
        if (costoEnvio != null) {
            System.out.printf("El costo del envio es %.2f", costoEnvio);
        }
    }
}
