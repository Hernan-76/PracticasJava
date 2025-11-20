package Seccion11;

public class FuncionRecursiva {
    static void funcionRecursiva(int numero){
        if (numero == 1){
            System.out.print(numero + " ");
        }
        else{
            funcionRecursiva(numero - 1);
            System.out.print(numero + " ");
        }
    }
    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}
