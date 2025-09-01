package c04_Structures;

import java.util.HashSet;

public class Set {

    public static void main(String [] arg){

        //Declaración y creación

        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<>();
        //Tamaño

        System.out.println(names.size());

        //Añadir elemento
        names.add("Sebas");//ASI SE AÑADE
        names.add("Sebastian");//ASI SE AÑADE
        names.add("Sebaano");//ASI SE AÑADE

        System.out.println(names.size());

        System.out.println(names); //El set es DESORDENADO
        /* se usa para que puedas meter datos de forma aleatoria
        sin que te importe el orden
         */

        //eliminar elemento
        names.remove("Sebas");
        System.out.println(names.size());

        // Buscar elementos SI y rápido
        System.out.println(names.contains("Sebas"));
        System.out.println(names.contains("Sebastian"));

        System.out.println(names);
        names.add("Sebas");
        names.add("Sebas");
        names.add("Sebas");
        names.add("Sebas");
        System.out.println(names); //NO PERMITE REPETIR

        //Conjuntos

        //name.addAll(numbers); error

        var countries = new HashSet<String>();
        countries.add("Peú");
        countries.add("Mexico");
        countries.add("Brazil");
        //no se va a repetir nunca en Set

        names.addAll(countries);
        System.out.println(names);

        names.removeAll(countries);
        System.out.println(names);

        names.retainAll(countries); //Obtener los elementos comunes
        System.out.println(names);





    }
}
