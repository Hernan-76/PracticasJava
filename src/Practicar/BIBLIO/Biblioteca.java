package Practicar.BIBLIO;

import java.util.Scanner;

public class Biblioteca {
    private Libros[] libro;
    private Usuarios[] usuaria;
    protected int contadorLibros;
    protected int contadorUsuarios;
    private Usuarios usuLibros;
    private boolean disponibilidad;



    public Biblioteca(){
        this.libro = new Libros[10000];
        this.usuaria = new Usuarios[10000];
    }

    public void agregarLibro (Libros libro){
        this.libro[this.contadorLibros++] = libro;
        //System.out.println(contadorLibros);
    }

    public void librosEnLaBiblio(){
        for (var i = 0; i < this.contadorLibros; i++){
            System.out.print(i + 1 + ". ");
            System.out.println(this.libro[i]);
        }
    }

    public void agregarUsuario(Usuarios usuario){
        this.usuaria[this.contadorUsuarios++] = usuario;
    }

    public void listaUsuarios(){
        for(var i = 0; i < contadorUsuarios; i++){
            System.out.println(this.usuaria[i]);
        }
    }

    public void disponible(Libros libro){
        String algo1 = (disponibilidad != true) ? "Libro disponible: " + disponibilidad : "Libro disponible: " + disponibilidad;
        System.out.println(algo1);
    }

    public void prestar(Libros libro){
        if (this.disponibilidad = true){
            System.out.println("El libro esta disponible ahora es de tu propiedad");
            this.disponibilidad = false;
        }
        else{
            System.out.println("Lo siento el libro no esta disponible");
        }
        

    }

    public void devolver(Libros libro){
        System.out.println("Has devuelto exitosamente el libro");
        this.disponibilidad = true;
        System.out.println(disponibilidad);
    }

    
}

//class listaLibrosUsuarios extends Biblioteca{
//    private Usuarios usario;
//    private Libros[] libro;
//
//
//    @Override
//    public void librosEnLaBiblio(){
//        for (var i = 0; i < this.contadorLibros; i ++){
//            System.out.println(this.libro[i]);
//        }
//    }
//}

