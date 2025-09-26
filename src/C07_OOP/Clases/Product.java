package C07_OOP.Clases;

public class Product {
    private String tipodeproducto;
    private double precio;
    private double descuento;
    public Product(String tipodeproducto,double precio,double descuento){
        this.tipodeproducto=tipodeproducto;
        setPrecio(precio);
        setDescuento(descuento);

    }
    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        if (precio < 0) throw new IllegalArgumentException("El precio no puede ser negativo");
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        if (descuento < 0 || descuento > 100)
            throw new IllegalArgumentException("El descuento debe estar entre 0 y 100");
        this.descuento = descuento;
    }

    public double getPrecioConDescuento() {
        return precio - (precio * (descuento / 100.0));
    }


    public String toString() {
        return String.format("Producto: %s, Precio: %.2f, Descuento: %.2f%%, Precio final: %.2f",
                tipodeproducto, precio, descuento, getPrecioConDescuento());
    }
}






