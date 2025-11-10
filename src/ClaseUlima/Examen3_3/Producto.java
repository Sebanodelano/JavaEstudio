package ClaseUlima.Examen3_3;

public class Producto implements Vendible{
    private int codigo;
    private String nombre;
    private double precioUnitario;
    private int cantidadVendida;
    public Producto(int codigo, String nombre,double precioUnitario
    , int cantidadVendida){
        if(codigo < 0 ){
            System.out.println("El codigo es incorrecto");
            this.codigo = 0;
        }else{
            this.codigo = codigo;
        }
        this.nombre = nombre;
        if(precioUnitario < 0 ){
            System.out.println("El Precio Unitario es incorrecto");
            this.precioUnitario = 0;
        }else {
            this.precioUnitario = precioUnitario;
        }
        if(cantidadVendida < 0 ){
            System.out.println("La cantidad vendida es 0 o es incorrecto");
            this.cantidadVendida = 0;
        }else {
            this.cantidadVendida= cantidadVendida;
        }


    }
    public int getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }
    public double calcularMontoBase(){
        return precioUnitario*cantidadVendida;
    }
    public double calcularTotal(){
        double montoBase = calcularMontoBase();
        double descuento = 0;
        if (montoBase > 1000){
            descuento = montoBase * 0.10;
        }
        return montoBase - descuento;
    }
    @Override
    public void imprimirComprobante(){
        double montoBase = calcularMontoBase();
        double descuento = (montoBase >1000) ? montoBase * 0.10 : 0;
        double total = calcularTotal();
        System.out.println("Código: " + codigo + " | Nombre: " + nombre);
        System.out.println("Precio unitario: " + precioUnitario + " | Cantidad: " + cantidadVendida);
        System.out.println("Monto base: " + montoBase);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + total);
        System.out.println("---------------------------");

    }
}
