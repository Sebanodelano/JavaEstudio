package ClaseUlima;

public class Examen2Pregunta2 {
    private String  codigo;
    private String nombre;
    private double precioUni;
    private int cantidadVendida;
    private double total;
    private double descuento;
    private double subtotal;

    public Examen2Pregunta2(String codigo,String nombre,double precioUni,int cantidadVendida){
        this.codigo = codigo;
        this.nombre=nombre;
        if(precioUni<0){
            System.out.println("El precio es incorrecto o es 0");
            this.precioUni=0;
        }else{
            this.precioUni = precioUni;
        }
        if(cantidadVendida<0){
            System.out.println("La cantidad vendida es invalida o es 0");
            this.cantidadVendida=0;
        }else {
            this.cantidadVendida = cantidadVendida;
        }

    }
    public double montoTotal(){
        this.total = precioUni*cantidadVendida;
        if(total > 1000) {
            this.descuento = total * .10;

        }else {
            this.descuento = 0;
        }

        this.subtotal = total - descuento;
        return  subtotal;

    }
    public void Comprobante() {

        System.out.println("==========COPROBANTE DE VENTA==========");
        System.out.println("Codigo del producto: " + codigo);
        System.out.println("Nombre del prodcuto: " + nombre);
        System.out.println("Precio unitario: " + precioUni);
        System.out.println("Cantidad vendidad: " + cantidadVendida);
        System.out.println("descuento aplicado : " + descuento);
        System.out.println("Subtotal: " + subtotal);

    }

}
