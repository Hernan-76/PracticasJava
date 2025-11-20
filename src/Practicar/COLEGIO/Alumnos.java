package Practicar.COLEGIO;

public class Alumnos {
    private String nombre;
    private double nota;

    public Alumnos(String nombre,double nota){
        this.nombre = nombre;
        this.nota = nota;
    }

    public void infoAlumno(){
        System.out.println("El alumno: " + nombre + " tiene una nota de: " + nota);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.nombre + " " + this.nota;
    }
}
