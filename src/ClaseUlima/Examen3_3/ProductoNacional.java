package ClaseUlima.Examen3_3;

public class ProductoNacional extends Producto{
    public ProductoNacional(int codigo, String nombre, double precioUnitario, int cantidadVendida) {
        super(codigo, nombre, precioUnitario, cantidadVendida);
    }

    @Override
    public double calcularMontoBase() {
        return super.calcularMontoBase();
    }
}
