package Practicar.PEAPLE;

public class Personas {
    private String nombre;
    private String dia;
    private String mes;
    private String año;

    public Personas(String nombre, String dia, String mes, String año){
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void cumpleaños(){
        System.out.println("Os voy a comunicar cuando es mi cumpleaños pq me sale de los huevos");
        var fecha = dia + "/" + mes + "/" + año;
        System.out.println("Mie cumpleaños es el" + fecha);
    }

    public void presentacion(){
        System.out.println("Hola me llamo " + nombre);
    }
}
