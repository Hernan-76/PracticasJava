package Practicar.COLEGIO;

public class Curso {
    private static final int max_alumnos = 30;
    private int contadorAlumnos;
    private Alumnos[] listAlumnos;

    public Curso(){
        this.listAlumnos = new Alumnos[Curso.max_alumnos];
    }

    public void añadirAlumnos(Alumnos alumnos){
        if(this.contadorAlumnos < Curso.max_alumnos){
            this.listAlumnos[this.contadorAlumnos++] = alumnos;
        }
        else{
            System.out.println("Se supero el limite de alumnos");
        }
    }

    public void cantidadAlumnos(){
        for(var i = 0; i < this.contadorAlumnos; i++){
            System.out.println(this.listAlumnos[i]);
        }
    }


}
