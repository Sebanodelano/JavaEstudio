package ClaseUlima;

public class Examen2Main {
    public static void main(String[] args) {
        Examen2Pregunta1 obj = new Examen2Pregunta1();
        obj.crearMatriz();
        obj.mostrarMatriz();
        Examen2Pregunta2 producto1 = new Examen2Pregunta2("A101", "Silla ergonómica", 250.0, 2);


        producto1.montoTotal();


        producto1.Comprobante();

    }
}
