package Practicar.COLEGIO;

public class PruebaAlumnos {
    public static void main(String[] args) {
        var alumno1 = new Alumnos("Hernán Soto", 3.21);
        var alumno2 = new Alumnos("Hernán Soto", 3.21);
        var alumno3 = new Alumnos("Hernán Soto", 3.21);
        var alumno4 = new Alumnos("Hernán Soto", 3.21);
        var alumno5 = new Alumnos("Hernán Soto", 3.21);

        alumno1.infoAlumno();
        alumno2.infoAlumno();
        alumno3.infoAlumno();

        var clase1 = new Curso();
        clase1.añadirAlumnos(alumno1);
        clase1.añadirAlumnos(alumno5);
        clase1.añadirAlumnos(alumno4);
        clase1.cantidadAlumnos();
    }   
}
