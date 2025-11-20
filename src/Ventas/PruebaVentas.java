package Ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***");
        var producto1 = new Producto("Camiseton", 30.00);
        var producto2 = new Producto("Pantalon", 35.00);
        //Primer orden
        var orden1 = new Orden();
        orden1.agregarProdcuto(producto1);
        orden1.agregarProdcuto(producto2);
        orden1.mostrarOrden();
        //Segunda Orden
        var orden2 = new Orden();
        orden2.agregarProdcuto(new Producto("Chaqutita", 50.5));
        orden2.agregarProdcuto(producto1);
        orden2.agregarProdcuto(producto2);
        orden2.mostrarOrden();
    }
}
