package Seccion11;

public class Funcion2 {
    static int sumar(int a, int b){
        var resultado = a + b;
        return resultado;
    }
    public static void main(String[] args) {
        int arg1 = 3;
        int arg2 = 8;
        var resultado1 = sumar(arg1, arg2);
        System.out.println(resultado1);
    }
}
