package ClaseUlima.Examen3_1;

import java.time.LocalDate;

public class Administrativo extends Persona {
    private String area;
    private String cargo;
    public Administrativo(int DNI , String name , String AP, String AM , LocalDate fechaNacimiento, String correo ,
                          String area, String cargo){
        super(DNI, name, AP, AM, fechaNacimiento, correo);
        this.area = area;
        this.cargo = cargo;
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Area: " + area);
        System.out.println("Cargo: " + cargo);
    }
}
