package C07_OOP.AccessModifiersExcercises;

public class Person {
    //Crea una clase Person con atributos privados name y age.
    // Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age= age;
    }
    public void showNameAge(){
        System.out.println("Hola mi nombre es: " + name + " y mi edad es: " + age);
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

