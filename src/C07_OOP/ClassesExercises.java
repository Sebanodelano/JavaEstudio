package C07_OOP;
import C07_OOP.Clases.*;

import java.util.ArrayList;

public class ClassesExercises {
    public static void main(String[] args) {
        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        var book = new Book("Indigno de ser humano", "Dazai");
        book.llamado();
        // 2. Crea una clase Dog con un metodo bark() que imprima su sonido.
        sonido ladrar = new sonido();
        ladrar.bark();
        // 3. Añade un constructor a la clase Book que reciba title y author.
        //ya estaxd

        // 4. Crea una clase Car con atributos brand y model y un metodo showData().
        var car = new Car("Ferrari","Formula1");
        car.showdata();
        // 5. Crea una clase Student con atributo score y un metodo que diga si aprobó (mayor o igual a 60).
        var student = new Student(70);
        student.ShowResult();
        System.out.println("Nota actual: " + student.getScore());
        student.setScore(40);
        student.ShowResult();
        // 6. Crea una clase BankAccount con atributo balance y un metodo deposit() que sume el saldo.
        var bankaccount = new BankAccount(40);
        bankaccount.deposit(10.5);
        bankaccount.deposit(20);
        System.out.println("Saldo final: " + bankaccount.getBalance());
        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        var rectangle = new Rectangle(10,20);
        rectangle.AreaPerim();
        // 8. Crea una clase Worker que reciba nombre y salario, y un metodo para mostrar su salario.
        var worker = new Worker("Sally",40);
        worker.Showsalario();
        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        ArrayList<Persons> people = new ArrayList<>();
        people.add(new Persons("Sebastian" , 25));
        people.add(new Persons("Ana", 25));
        people.add(new Persons("Luis", 30));
        for (Persons p : people) {
            p.ShowData();
        }
        // 10. Crea una clase Product y un metodo que aplique un descuento sobre su precio.


        var product = new Product("Electrodomestico" , 1243,10);
        System.out.println(product); // usa toString()
        System.out.println("Precio base: " + product.getPrecio());
        System.out.println("Precio con descuento: " + product.getPrecioConDescuento());









    }



}
