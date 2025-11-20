package Practicar.BANCO;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void anadirSaldo(double saldo_anadir){
        saldo += saldo_anadir;
        System.out.println("Tu saldo actual es de: " + saldo);
    }

    public void retirarSaldo(double saldo_quitar){
        saldo -= saldo_quitar;
        System.out.println("Tu saldo actual es de: " + saldo);
    }

    public void info(){
        System.out.println("El titular de la cuenta: " + titular + " tiene un saldo de: " + saldo);
    }
}
