package ClaseUlima.Examen3_1;

import java.time.LocalDate;

public class Docente extends Persona {
    private String especialidad;
    private String categoria;

    public Docente(int DNI , String name , String AP, String AM , LocalDate fechaNacimiento, String correo , String especialidad,
                   String categoria){
        super(DNI, name, AP, AM, fechaNacimiento, correo);
        this.especialidad = especialidad;
        this.categoria = categoria;
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Categoría:  " + categoria);


    }

}
