package ClaseUlima.Examen3_3;

public class ProductoImportado extends  Producto{
    public ProductoImportado(int codigo, String nombre, double precioUnitario, int cantidadVendida) {
        super(codigo, nombre, precioUnitario, cantidadVendida);
    }
    @Override
    public double calcularTotal(){
        double montoBase = calcularMontoBase();
        double recargo = montoBase * 0.05;
        double montoConRecargo = montoBase + recargo;
        double descuento = 0;

        if (montoConRecargo > 1000){
            descuento = montoConRecargo * 0.10;

        }
        return montoConRecargo - descuento;

    }
    @Override
    public void imprimirComprobante(){
        double montoBase = calcularMontoBase();
        double recargo = montoBase * 0.05;
        double montoConRecargo = montoBase + recargo;
        double descuento = (montoConRecargo > 1000) ? montoConRecargo * 0.10 : 0;
        double total = calcularTotal();
        System.out.println("Código: " + getCodigo() + " | Nombre: " + getNombre());
        System.out.println("Precio unitario: " + getPrecioUnitario() + " | Cantidad: " + getCantidadVendida());
        System.out.println("Monto base: " + montoBase);
        System.out.println("Recargo (5%): " + recargo);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + total);
        System.out.println("---------------------------");
    }
}
