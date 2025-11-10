package ClaseUlima.Examen3_2;

public class AppEnvios {
    public static void main(String[] args) {
        Envios [] listaEnvios = new Envios[4];
        listaEnvios[0] = new EnvioLocal(1001, "Sebastián Barrueto", 25.0);
        listaEnvios[1] = new EnvioLocal(1002, "Lucía Gómez", 40.0);
        listaEnvios[2] = new EnvioNacional(2001, "Ricardo Tello", 100.0);
        listaEnvios[3] = new EnvioNacional(2002, "María Pérez", 200.0);
        System.out.println("=== LISTA DE ENVIOS ===");
        for(Envios e : listaEnvios){
            System.out.print("Código: " + e.codigo);
            System.out.print(" | Destinatario: " + e.destinatario);

            // Saber el tipo de envío con instanceof
            if (e instanceof EnvioLocal) {
                System.out.print(" | Tipo: Local");
            } else if (e instanceof EnvioNacional) {
                System.out.print(" | Tipo: Nacional");
            }
            System.out.print(" | Costo total: " + e.calcularCosto());
            System.out.println();
        }


    }
}
