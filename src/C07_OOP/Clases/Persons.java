package C07_OOP.Clases;
// 9. Crea varios objetos Person y guárdalos en un ArrayList.

import C07_OOP.Person;

import java.util.ArrayList;

public class Persons {
    private String names;
    private int edads;
    public Persons(String name, int edad){
        this.names = name;
        this.edads = edad;
    }

    public void ShowData(){
        System.out.println("Nombre " + names + " Edad: " + edads );

    }

    public String getName() {
        return names;
    }

    public int getEdad() {
        return edads;
    }
}
