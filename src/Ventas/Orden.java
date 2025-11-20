package Ventas;

public class Orden {
    private final int idOrder;
    private Producto[] productos;
    private int contadorProductos;
    private static final int max_Productos = 10;
    private static int contadorOrdenes;

    public Orden(){
        this.idOrder = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.max_Productos];
    }

    public void agregarProdcuto(Producto producto){
        if (this.contadorProductos < Orden.max_Productos){
            this.productos[this.contadorProductos++] = producto;
        }
        else{
            System.out.println("Se ha superado el maximo de prodcutos: " + Orden.max_Productos);    
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (var i = 0; i < this.contadorProductos; i++){
            var producto = this.productos[i];
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrder);
        var totalOrden = this.calcularTotal();
        System.out.println("\tTotal de la orden: " + totalOrden);
        System.out.println("\tProductos de la orden: ");
        for(var i = 0; i < this.contadorProductos; i++){
            System.out.println("\t\t" + this.productos[i]);
        }
    }
}
