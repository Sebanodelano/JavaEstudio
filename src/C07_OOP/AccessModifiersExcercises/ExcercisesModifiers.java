package C07_OOP.AccessModifiersExcercises;

import javax.swing.*;

public class ExcercisesModifiers {
    public static void main(String[] args) {
        /*1. Crea una clase Person con atributos privados name y age.
        Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.*/
        Person p1 = new Person("Sebastian" , 23);
        p1.showNameAge();

        System.out.println("Nombre desde getter: " + p1.getName());
        System.out.println("Edad desde getter: " + p1.getAge());
        p1.setName("Carlos");
        p1.setAge(30);
        p1.showNameAge();
        /*2. Crea una clase Product con el atributo privado price.
        Añade el metodo setPrice(double price) que solo permita precios mayores a 0.
         */
        Product p2 = new Product(19);
        p2.showPrice();
        /*3. Crea una clase BankAccount con el atributo privado balance.
        Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
         */
        BankAccount p3 = new BankAccount(100);
        p3.deposit(300);
        p3.showBankAccount();
        p3.withdraw(400);
        p3.showBankAccount();
        p3.withdraw(1000);





    }





}
