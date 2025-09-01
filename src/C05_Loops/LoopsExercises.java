package C05_Loops;

import java.util.*;

public class LoopsExercises {
    public static void main(String[] args) {
        // 1. Imprime los números del 1 al 10 usando while.
        var i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        int index = 0;
        do {
            System.out.println(numeros.get(index));
            index++;

        } while (index < numeros.size());


        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (index = 0; index <= 50; index += 5) {
            System.out.println(index);

        }
        // 4. Recorre un Array de 5 números e imprime la suma total.
        int num[] = new int[5];
        num[0] = 1;
        num[1] = 15;
        num[2] = 13;
        num[3] = 14;
        num[4] = 5;
        int suma = 0;
        for (int n = 0; n < num.length; n++) {
            suma += num[n];
        }
        System.out.println("la suma total es" + "  " + suma);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.

        String[] names = {"Sebas", "Barrueto", "Sebanodelano"};
        for (String name : names) {
            System.out.println(name);
        }
        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        for (Integer nam : numbers){
            System.out.println(nam);
        }
        HashMap<String, String> emails = new HashMap<>();
        emails.put("Sebas" , "sebas@gmail.com");
        emails.put("Sebastian" , "sebastian@gmail.com");
        emails.put("Sebaano" , "sebaano@gmail.com");
        for (Map.Entry<String,String> email : emails.entrySet()){
            System.out.println(email.getKey() + "-->" + email.getValue());
        }
        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for(int a = 10; a>=1 ;a--){
            System.out.println(a);
        }
        // 8. Usa continue para saltar los múltiplos    de 3 del 1 al 20.
        for(int x =0; x<=20;x++){
            if(x % 3 ==0){
                continue;
            }
            System.out.println(x);

        }
        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] nueve = new int[7];
        nueve[0] = 1;
        nueve[1] = 15;
        nueve[2] = 13;
        nueve[3] = 14;
        nueve[5] = 5;
        nueve[6] = -5;
        for(int y=0; y<nueve.length;y++){
            if(nueve[y]<0){
                break;

            }
            System.out.println(nueve[y]);
        }



        // 10. Crea un programa que calcule el factorial de un número dado.
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el numero que quiere hacer su factorial: ");
        int a = scn.nextInt();
        int fac = 1;
        int temp =a;

        while( temp !=0){
            fac *= temp;
            temp--;

        }
        System.out.println("El factorial de " + a + " es: " + fac);





    }
}
