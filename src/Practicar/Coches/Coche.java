package Practicar.Coches;

public class Coche {
    private String marca;
    private String modelo;
    private double velActual;
    private static int contadorCoches;

    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.velActual = 0;
    }

    public void acelerar(double cantidad){
        velActual += cantidad;
        System.out.println("El coche de la marca: " + marca + " modelo: " + modelo + " ha acelerado a una velocidad de: " + velActual);
    }

    public void frenar(double cantidad){
        velActual -= cantidad;
        System.out.println("El coche de la marca: " + marca + " modelo: " + modelo + " ha frenado a una velocidad de: " + velActual);
    }

    public void info(){
        System.out.println("La informacion del coche.\nMarca: " + marca + "\nModelo: " + modelo + "\nVelocidad Actual: " + velActual);
    }


    public static int getContadorCoches() {
        return ++contadorCoches;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   // @Override
   // public String toString() {
   //     // TODO Auto-generated method stub
   //     return "La marca es: " + marca + " El modelo es: " + modelo;
   // }
}

