package Practicar.BIBLIO;

import java.util.Scanner;

public class Libros {
    public String nombreLibro;
    public Autores autor;
    private String añoPublicacion;


    public Libros(String nombreLibro, Autores autor, String añoPublicacion){
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }
    protected Libros(){

    }
    

    protected void infoLibros(){
        System.out.printf("Informacion del Autor: %s. Nombre: %s. Año de publicacion: %s", nombreLibro, autor, añoPublicacion);
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nombreLibro;
    }

    public void BuscarTitulo(){
            var consola = new Scanner(System.in);
            System.out.println("Introduce el nombre del libro");
            var libroBuscado = consola.nextLine();
            if (this.nombreLibro.equals(libroBuscado)){
                System.out.println("FucK");
            }
            else{
                System.out.println("MID");
            }
        }
    

}
