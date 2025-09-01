package C07_OOP;

public class Classes {
    public static void main(String[] args) {


        var person = new Person("Sebas",23);

        /*person.name = "Sebas";
        person.age = 23;*/

        person.sayHello();
        person.name= "Sebastian Barrueto";

        System.out.println(person.name);
        var person2 = new Person("Alvaro",25);
        person2.sayHello();

    }

}

