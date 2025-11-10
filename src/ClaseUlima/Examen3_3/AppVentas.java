package ClaseUlima.Examen3_3;

public class AppVentas {
    public static void main(String[] args) {
        Vendible[] productos = new Vendible[10];

        productos[0] = new ProductoNacional(1, "Laptop Lenovo", 3200, 1);
        productos[1] = new ProductoImportado(2, "iPhone 15 Pro", 5200, 1);
        productos[2] = new ProductoNacional(3, "Teclado mecánico", 200, 3);
        productos[3] = new ProductoImportado(4, "Monitor Samsung", 850, 2);

        double totalGeneral = 0;
        System.out.println("=== COMPROBANTES DE VENTA TECHMARKET ===");
        for (Vendible p : productos) {
            if (p != null) {
                p.imprimirComprobante(); // Polimorfismo: se llama al método según el tipo real
                totalGeneral += p.calcularTotal();
            }
        }

        System.out.println("TOTAL GENERAL DE VENTAS: S/ " + totalGeneral);

    }
}
