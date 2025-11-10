package ClaseUlima.Examen3_2;

public abstract class Envios {
    protected int codigo;
    protected String destinatario;
    protected double costoBase;

    public Envios (int codigo, String destinatario, double costoBase){
        if(codigo < 0){
            System.out.println("El codigo no es correcto");
            this.codigo = 0;
        }else{
            this.codigo = codigo;
        }
        this.destinatario = destinatario;
        if(costoBase < 0){
            System.out.println("El costo base no es correcto");
            this.costoBase = 0;
        }else{
            this.costoBase = costoBase;
        }

    }
    public abstract double calcularCosto();
}
