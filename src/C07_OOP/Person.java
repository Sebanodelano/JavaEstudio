package C07_OOP;

public class Person {
    //Almacenar atributos
    String name;
    int age;

    //Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Metodos
    public void sayHello() {
        System.out.println("Hola soy " + name +" "+ "y tengo " + age + " "+ "años");




    }


}
