package Practicar.BIBLIO;

public class Autores {
    protected String nombre;
    protected String nacionalidad;

    public Autores(String nombre, String nacionalidad){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }


    public void inforAutor(){
        System.out.println(nombre + " " + nacionalidad);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nombre + " Nacionalidad: " + nacionalidad;
    }
    
    
} 