package c04_Structures;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresEx {
    public static void main(String[] args){

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int [] numbers = {1,2,3,4,5};
        System.out.println(numbers.length);
        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("Antes" + " " + numbers[2]);
        //modificando el 2
        numbers[2]=310;
        System.out.println("Despues" + " " + numbers[2]);
        // 3. Crea un ArrayList vacío.
        ArrayList<String> names = new ArrayList<String>();
        var num = new ArrayList<Integer>();
        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        num.add(2);
        num.add(4);
        num.add(6);
        num.add(8);
        System.out.println(num);
        num.remove(3);
        System.out.println(num);
        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> correos = new HashSet<>();
        HashSet<Integer> numeros = new HashSet<>();

        System.out.println(correos.size());
        correos.add("Sebastian");
        correos.add("Barrueto");
        System.out.println(correos);
        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        correos.add("Sebastian");
        correos.add("Nolasco");
        System.out.println(correos);
        // 7. Elimina uno de los elementos del HashSet.
        correos.remove("Sebastian");
        System.out.println(correos);
        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, Integer> claves = new HashMap<>();
        claves.put("sebano", 99911122 );
        claves.put("Barrueto", 1233211);
        claves.put("alvaro",33441123);
        System.out.println(claves);
        // 9. Modifica uno de los contactos y elimina otro.
        claves.put("sebano" , 991235151);
        System.out.println(claves);
        claves.remove("Barrueto");
        System.out.println(claves);
        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        Integer [] namm = {1,2,3,4,5};
        //a arraylistxd
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(namm));
        System.out.println("ArrayList: " + lista);
        //A SET XD
        HashSet<Integer> set = new HashSet<>(lista);
        System.out.println("HashSet: " + set);
        //a MAP xd
        HashMap<Integer, Integer> nam = new HashMap<>();
        for (Integer n : set){
            nam.put(n,n);
        }









    }
}
