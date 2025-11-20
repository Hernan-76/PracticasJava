package Practicar.BANCO;

public class PruenaBanco {
    public static void main(String[] args) {
        var persona1 = new CuentaBancaria("Hernán Soto", 313213.39);
        persona1.anadirSaldo(32321.43);
        persona1.retirarSaldo(3131.38);
        persona1.info();
    }
}
