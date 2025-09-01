package C06_Functions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExerciseFunction {
    public static void main(String[] args){
        /*Bienvenida();
        Saludo("Alvaro");
        calculo();
        int rpta = cuadrado();
        System.out.println("El cuadrado es " + rpta);
        String rpt2 = paroimp();
        System.out.println(rpt2);
        boolean rpt3 = edad();
        System.out.println(rpt3);
        int rpt4 = cadena();
        System.out.println("La longitud es: " + rpt4);
        System.out.println(metodo());
        int rpt9 = factorial();
        System.out.println("El factorial es: " + rpt9);*/
        ArrayList<String> lista = pedirPalabras(); // l
        mostrarLista(lista);


    }
    // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
    public static void Bienvenida(){
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }
    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
    public static void Saludo(String nombre){
        System.out.println("Que tengas feliz día " + nombre);
    }
    // // 3. Haz un metodo que reciba dos números enteros y devuelva su resta
    public static void calculo(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int a = scn.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = scn.nextInt();
        int resultado = a - b;
        System.out.println("La respuesta es "+ resultado);


    }
    // 4. Crea un metodo que calcule el cuadrado de un número (n * n).
    public static int cuadrado(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el numero que quieres saber su cuadrado: ");
        int a = scn.nextInt();
        return a*a;

    }
    // 5. Escribe una función que reciba un número y diga si es par o impar.
    public static String paroimp(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int a = scn.nextInt();
        if( a%2==0 && a != 0){
            return "El numero es par";
        }else{
            return "El numero es impar";
        }



    }
    // 6. Crea un metodo que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
    public static boolean edad(){
        Scanner scn = new Scanner(System.in);
        System.out.println("ingrese la edad: ");
        int a = scn.nextInt();
        if(a >= 18){
            return true;
        }else {
            return false;
        }
    }
    // 7. Implementa una función que reciba una cadena y retorne su longitud.
    public static int cadena(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese un texto(Solo se contará las letras y no espacios): ");
        String text = scn.nextLine();
        text = text.replace(" ", "");
        return text.trim().length();

    }
    //  8. Crea un metodo que reciba un array de enteros, calcula su media y lo retorna.
    public static double metodo() {
        ArrayList<Integer> numeros = new ArrayList<>();;
        for( int i = 0; i < 20; i++){
            numeros.add((int)(Math.random()*100)+1);
        }
        int suma = 0;
        for(int n  : numeros){
            suma += n;
        }
        //Calcular la media
        double media = (double) suma/ numeros.size();
        System.out.println("Lista: " + numeros);
        System.out.println("Media: " + media);

        return media;

    }
    // 9. Escribe un metodo que reciba un número y retorna su factorial.
    public static int factorial(){
        Scanner scn = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO: ");
        int a = scn.nextInt();
        int resultado = 1;
        for(; a>=1;a--){
            resultado = resultado * a;

        }
        return resultado;



    }
    // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
    public static ArrayList<String> pedirPalabras(){
        Scanner scn = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>();
        System.out.println("Escribe palabras (escribe 'Cerrar' para terminar): ");
        while (true){
            String entrada = scn.nextLine();
            if(entrada.equalsIgnoreCase("Cerrar")){
                break;
            }
            palabras.add(entrada);
        }
        return palabras;


    }
    public static void mostrarLista(ArrayList<String> lista){
        System.out.println("/n palabras ingresadas: ");
        for(String palabra : lista ){
            System.out.println(palabra);
        }
    }
}
