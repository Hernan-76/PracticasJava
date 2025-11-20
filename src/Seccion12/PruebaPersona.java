package Seccion12;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("Creacion de clase y objetos de tipo persona");
        System.out.println("Variable Estatica: " + Clase1.getContadorPersonas());
        var objeto1 = new Clase1("Layla", "Acosta");
        System.out.println(objeto1); //No hace falta usar toString con println
        System.out.println("Variable Estatica: " + Clase1.getContadorPersonas());
        //Segundo objeto
        var objeto2 = new Clase1("Hernán", "Soto");
        System.out.println(objeto2);
        System.out.println("Variable Estatica: " + Clase1.getContadorPersonas());
    }
}
