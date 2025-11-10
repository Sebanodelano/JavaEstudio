package ClaseUlima.Examen3_2;

public class EnvioNacional extends Envios{
    public EnvioNacional(int codigo , String destinatario, double costoBase){
        super(codigo, destinatario, costoBase);
    }

    @Override
    public double calcularCosto() {
        return costoBase*0.18 + costoBase;
    }
}
