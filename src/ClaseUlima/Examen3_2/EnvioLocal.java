package ClaseUlima.Examen3_2;

public class EnvioLocal extends Envios {
    public EnvioLocal(int codigo, String destinatario , double costoBase){
        super(codigo, destinatario, costoBase);
    }

    @Override
    public double calcularCosto() {
        return costoBase + 5.0;
    }
}

