package Practicar.BIBLIO;

public class PruebaTotal {
    public static void main(String[] args) {
        Autores infoGeneralAutores = new Autores("Felipe", "España");
        var newAutor = new Autores("Felipe", "España");
        var hola1 = new Libros("La puta", infoGeneralAutores, "1990");
        var hola2 =new Libros("La puta", newAutor, "1990");
        String holy = String.valueOf(hola1);
        var holy1 = hola2;
        var holy3 = holy + holy1;
        System.out.println(holy3);
        //var usuaria1 = new Usuarios("Hernán", "2007");
        var cosa1 = new Biblioteca();
        //cosa1.agregarLibro(hola1);
        //cosa1.agregarLibro(hola2);
        //cosa1.librosEnLaBiblio();
        //cosa1.devolver(hola1);
        //cosa1.devolver(hola2);
        //cosa1.disponible(hola2);
        //cosa1.disponible(hola1);
        //cosa1.prestar(hola2);
        //cosa1.disponible(hola2);
        //cosa1.prestar(hola2);
        hola1.BuscarTitulo();
    }
}
