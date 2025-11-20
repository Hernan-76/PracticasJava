package Seccion12.Animales;

public class Animal {
    protected void comer(){
        System.out.println("Como muchas veces al dia");
    }
    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
    protected void dormir(){
        System.out.println("Duernmo muchas horas");
    }
}

class Perro extends Animal{
    @Override
    protected void hacerSonido(){
        System.out.println("El perro hace wouf");
    }
}

class Gato extends Animal{
    protected void hacerSonido(){
        System.out.println("El gato hace miau");
    }
}

class PruebaAnimal{
    //Metodo Polimorfico
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
     //Objeto de la clase padre (Animal)
     //   var animal = new Animal();
       // imprimirSonido(animal);
       var animal = new Gato();
       imprimirSonido(animal);
    }
}