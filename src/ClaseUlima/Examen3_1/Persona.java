package ClaseUlima.Examen3_1;

import java.time.LocalDate;

public class Persona {
    private int DNI;
    private String name;
    private String AP;
    private  String AM;
    private LocalDate fechaNacimiento;
    private String correo;

    public Persona(int DNI, String name , String AP,String AM, LocalDate fechaNacimiento
    ,String correo){
        if(DNI >= 10000000 && DNI <=99999999){
            System.out.println("El DNI es incorrecto");
            this.DNI = 0;
        }else{
            this.DNI =DNI;
        }
        this.AP=AP;
        this.AM=AM;
        LocalDate hoy = LocalDate.now();
        if(fechaNacimiento.isAfter(hoy)){
            System.out.println("Fecha de nacimiento no puede ser futura.");
        }else{
            this.fechaNacimiento = fechaNacimiento;
        }
        this.correo = correo;


    }
    public void mostrarDatos(){
        System.out.println("DNI: " + DNI);
        System.out.println("Nombre: " + name + " " + AP + " " + AM);
        System.out.println("Fecha Nacimiento: " + fechaNacimiento);
        System.out.println("Correo: " + correo);

    }


}
