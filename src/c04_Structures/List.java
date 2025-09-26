package c04_Structures;

import java.util.ArrayList;

public class List {

    public static  void main(String[] args){

        //Declaracion y creacion

        ArrayList<String> names = new ArrayList<>(); //antiguo
        var numbers = new ArrayList<Integer>(); //moderno

        // Tamaño
        System.out.println(names.size());

        //Añadir
        names.add("Sebas");//ASI SE AÑADE
        names.add("Sebastian");//ASI SE AÑADE
        names.add("Sebaano");//ASI SE AÑADE
        System.out.println(names);
        System.out.println(names.size());

        // Acceder a los elementos

        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        System.out.println(names.get(1));

        //Modificar un elemento de la lista(array)

        names.set(2,"Sebanodelano");
        System.out.println(names);

        // Eliminar elementos

        names.remove(2);
        System.out.println(names);

        // Buscar elementos
        System.out.println(names.contains("Sebas"));
        System.out.println(names.contains("Sebastian"));

        //Limpiar Arraylist
        names.clear(); //forma de limpiar, te lo deja en "0"
        // 10. Crea una clase Product y un metodo que aplique un descuento sobre su precio.





    }
}
