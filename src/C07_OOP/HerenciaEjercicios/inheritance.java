package C07_OOP.HerenciaEjercicios;

public class inheritance {
    public static void main(String[] args) {
        // Herencia
        Animal animal = new Animal();
        animal.nombre = "sebas";
        animal.eat();
        var perro = new Dog();
        perro.nombre = "LuisHortos";
        perro.eat();
        var gato = new Cat();
        gato.nombre="chloe";
        gato.eat();
        var pajaro = new Bird();
        pajaro.nombre = "Alejandra";
        pajaro.eat();
        pajaro.fly();

    }
    public static class Animal {
        String nombre;
        public void eat(){
            System.out.println("El animal con nombre " + nombre + " esta que come");
        }

    }

    public static class Dog extends Animal{

        @Override
        public void eat() {
            super.eat();
        }
    }

    public  static class Cat extends Animal{

    }

    public static class Bird extends Animal{
        public void fly(){
            System.out.println("vuela");
        }
    }


}
