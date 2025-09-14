package C07_OOP;
import C07_OOP.Clases.Book;
import C07_OOP.Clases.sonido;

public class ClassesExercises {
    public static void main(String[] args) {
        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        var book = new Book("Indigno de ser humano", "Dazai");
        book.llamado();
        // 2. Crea una clase Dog con un metodo bark() que imprima su sonido.
        sonido ladrar = new sonido();
        ladrar.bark();
        // 3. Añade un constructor a la clase Book que reciba title y author.


    }




}
