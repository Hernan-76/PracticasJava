package Practicar.Coches;

public class PruebaCoche {
    public static void main(String[] args) {
        var coche1 = new Coche("Seat", "V005");
        coche1.info();
        coche1.acelerar(124.52);
        coche1.info();

    }
}
