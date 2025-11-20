package Seccion12;

public class Clase1 {
    private static int contadorPersonas = 0;
    private int idPersona;
    private String nombre;
    private String apellido;

    public Clase1(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        // Incrementar el atributo static
        //Asignacion del id unico a traves de la variable estatica
        this.idPersona = ++Clase1.contadorPersonas;
    }
    @Override
    public String toString(){
        return "id: " + this.idPersona + 
        ", Nombre: " + this.nombre + ", " + this.apellido;
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public static int getContadorPersonas(){
        return Clase1.contadorPersonas;
    }
    
    
}
