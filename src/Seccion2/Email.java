package Seccion2;

public class Email {
    public static void main(String[] args) {
       System.out.println("***Generador de EMAILS***\n");
        String nomUsu = "Hernan Soto Zurita";
        System.out.println("Nombre del usuario: " + nomUsu);
        var nomNor = nomUsu.replace(" ", ".").toLowerCase();
        System.out.println("Nombre normalizado del cliente: " + nomNor);
        String nomEmpresa = "Global Mentoring";
        System.out.println("\nEl nombre de la empresa es: " + nomEmpresa);
        String nomDom = ".com.mx";
        System.out.println("El nombre del dominio " + nomDom);
        var domNorm = "@" + nomEmpresa.replace(" ", "").toLowerCase() +nomDom;
        System.out.println("Dominio del email normalizado " + domNorm);
        var emaiFinal = nomNor + domNorm;
        System.out.println("\nEmail final generado: " + emaiFinal);
    }
}