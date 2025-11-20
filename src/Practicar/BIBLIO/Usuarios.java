package Practicar.BIBLIO;

import java.util.Random;

public class Usuarios {
    private String nomUsuario;
    private String añoUsuario;
    public String id;
    private Libros[] libroPrestado;

    public Usuarios(String nomUsuario, String añoUsuario){
        this.nomUsuario = nomUsuario;
        this.añoUsuario = añoUsuario;
        var Random = new Random();
        nomUsuario.substring(0, 3);
        añoUsuario.substring(2);
        var numId = String.valueOf(Random.nextInt(1001));
        var finalId = nomUsuario + numId +añoUsuario;
        this.id = finalId;
    }

    protected Usuarios(){

    }


    public void generadorId(){
        var Random = new Random();
        nomUsuario.substring(0, 3);
        añoUsuario.substring(2);
        var numId = String.valueOf(Random.nextInt(1001));
        var finalId = nomUsuario + numId +añoUsuario;
        System.out.println("Tu id: " + finalId);

    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "El usuario: " + nomUsuario + " Con id: " + this.id;
    }

    public void libroPrestados(){

    }

}
