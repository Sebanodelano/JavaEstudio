package C07_OOP.HerenciaEjercicios;

public class CP0_Main {
    public static void main(String[] args) {
        CP1_Dog d = new CP1_Dog();
        d.makeSound(); // imprime "Woof"
        CP1_Cat c = new CP1_Cat();
        c.makeSound();


        CP2_Manager m = new CP2_Manager("kbro", 10, "Lima");
        m.llamada();

        CP3_Shape cir = new CP31_Circle(17.5);
        cir.calculateArea();
        



        
    }
    
}
