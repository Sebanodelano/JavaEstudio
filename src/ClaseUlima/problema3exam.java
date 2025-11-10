package ClaseUlima;

public class problema3exam {
    private int DNI;
    private String nombre;
    private String cargo;
    private int salario;

    public problema3exam( int DNI , String nombre , String cargo , int salario){
        if( DNI < 10000000 || DNI > 99999999){
            System.out.println("el DNI debe tener 8 digitos: ");
            this.DNI = 0;
        }else{
            this.DNI = DNI;

        }
        this.nombre = nombre;
        this.cargo = cargo;
        if( salario < 0 ){
            System.out.println("El salario no es valido o es 0");
        }else{
            this.salario= salario;
        }

    }


    public double sueldoNetoPagar(){
        double descuento = salario*(12.00/100);

        double sueldoNeto = salario - descuento + 200;
        return sueldoNeto;
    }

    public  void ImprimirRecibo(){
        System.out.println("DNI: " + DNI);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario base: S/ " + salario);
        System.out.println("Sueldo neto: S/ " + sueldoNetoPagar());
        System.out.println("----------------------------");

    }

}
