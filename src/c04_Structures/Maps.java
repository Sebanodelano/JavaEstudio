package c04_Structures;

import java.util.HashMap;

public class Maps {

    public static void main(String[] args){

        //Declaración y creación
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer , String>();

        // Tamaño
        System.out.println(names.size());
        //Añadir elemento
        names.put("Sebas" , "sebas@gmail.com");//ASI SE AÑADE
        names.put("Sebastian" , "sebastian@gmail.com");//ASI SE AÑADE
        names.put("Sebaano" , "sebaano@gmail.com");//ASI SE AÑADE
        System.out.println(names.size());
        System.out.println(names);
        // Acceder a los elementos
        names.get("Sebas");
        System.out.println(names.get("Sebas"));
        System.out.println(names.get("Dev"));

        //Verificar elementos
        System.out.println(names.containsKey("Sebas"));
        System.out.println(names.containsKey("Dev"));

        // con el valor
        System.out.println(names.containsValue("sebaano@gmail.com"));
        //eliminar elementos
        System.out.println(names.remove("Sebas"));
        System.out.println(names.remove("Sebastian"));
        System.out.println(names);

        //limpiar el HashMap
        names.clear();
        System.out.println(names);

        //otras operaciones - modificar
        names.put("Sebaano" , "sebaano@gmail.com");
        System.out.println(names);
        names.put("Sebaano", "Sebastiano@gmailcom");
        System.out.println(names);

        //modificar con seguridad
        names.replace("Sebas","Sebastiam@gmail.com"); //solo si existe el valor
        System.out.println(names);

        names.putIfAbsent("Sebas", "Sebastiaaano@gmail.com");
        System.out.println(names);


        //toca ejercicios. Mañana

    }
}
