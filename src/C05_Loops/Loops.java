package C05_Loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    public static void main(String[] args){

        //Loops

        //-for - clasico
        for (int index =0; index < 5; index++){
            System.out.println("Hola java");

        }
        String [] names = {"Sebastian","Sebas","Barrueto","Nolasco"};
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
        /*For each ( para cada uno de los elementos)
        es ideal para recorrer Arrays o listas*/
        for (String name: names){
            System.out.println(name);
        }
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        for (Integer number: numbers){
            System.out.println(number);
        }
        HashMap<String, String> emails = new HashMap<>();
        emails.put("Sebas" , "sebas@gmail.com");
        emails.put("Sebastian" , "sebastian@gmail.com");
        emails.put("Sebaano" , "sebaano@gmail.com");
        for(Map.Entry<String, String> email: emails.entrySet()){
            System.out.println(email.getValue());
            System.out.println(email.getKey());
        }


        //-While
        int index = 0;
        while(index < 5) {
            System.out.println("HOLA JAVA");
            index++;
        }
        //
        index = 0;
        while(index < names.length){
            System.out.println(names[index]);
            index++;
        }
        index = 0;
        boolean find = false;
        while(!find) {
            System.out.println(names[index]);
            if (names[index].equals("Nolasco")) {
                find = true;
            }
            index++;
        }

        //do-while
        index = 0;
        do{
           System.out.println("Hola java");
           index++;

        }while (index < 5);

        //Control de bucles
        //-break
        for (String name: names){
            if (name.equals("Nolasco")) {
                break;
            }
            System.out.println(name);
        }
        // contrnuar - continue
        for (int i = 0; i<5; i++){
            if (i ==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
