package c04_Structures;

public class Arrays{
    public static void main(String[] args){

        //declaración y creación

        int[] numbers = new int[3];
        System.out.println(numbers);

        String[] names = {"Sebas", "Barrueto", "Sebanodelano"};
        System.out.println(names);

        //Acceso a []
        System.out.println(numbers[0]);
        System.out.println(names[0]);
        System.out.println((new String[3])[0]);

        //Ya creaste el array ahora quieres añadirle más cosas

        numbers[0] = 3;
        numbers[1] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        System.out.println(names[2]);
        names[2]="sebastianbnolasco@gmail.com";
        System.out.println(names[2]);

        System.out.println(names.length);
        names[2]= null;
        System.out.println(names[2]);
        System.out.println(names.length);

        // numbers[2] = null - ERROR
        boolean[] booleans = new boolean[5];
        System.out.println(booleans[2]);

    }
}
