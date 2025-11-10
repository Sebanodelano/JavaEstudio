package ClaseUlima.Examen3_1;

import java.time.LocalDate;

public class AppUlima {
    public static void main(String[] args) {
        Docente docente1 = new Docente(
                12345678,
                "Sebas",
                "barru",
                "Nolas",
                LocalDate.of(2022,3,26),
                "sebas@123.com",
                "Progra",
                "Principal"
        );
        Administrativo admin1 = new Administrativo(
                87654321,
                "Lucía",
                "Gómez",
                "Pérez",
                LocalDate.of(1990, 8, 15),
                "lucia@ulima.edu.pe",
                "Recursos Humanos",
                "Coordinadora");
        Persona[] personas = new Persona[2];
        personas[0] = docente1;
        personas[1] = admin1;
        System.out.println("=== DATOS DEL PERSONAL ULIMA ===");
        for (Persona p : personas) {
            p.mostrarDatos(); // se ejecuta el método sobrescrito según el tipo real del objeto
            System.out.println("---------------------------");
        }
    }
}
