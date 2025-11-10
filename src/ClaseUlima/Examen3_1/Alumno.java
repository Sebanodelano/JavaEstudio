package ClaseUlima.Examen3_1;

import java.time.LocalDate;

public class Alumno extends Persona {
    private String carrera;
    private int ciclo;
    public  Alumno(int DNI , String name , String AP, String AM , LocalDate fechaNacimiento,String correo , String carrera,
    int ciclo){
        super(DNI, name, AP, AM, fechaNacimiento, correo);
        this.carrera = carrera;
        this.ciclo= ciclo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Carrera: " + carrera);
        System.out.println("Ciclo: " + ciclo);
    }
}
